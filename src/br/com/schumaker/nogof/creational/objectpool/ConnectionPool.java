package br.com.schumaker.nogof.creational.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hudson Schumaker
 */
public class ConnectionPool extends ObjectPool<Connection> {

    private String dsn;
    private String usr;
    private String pwd;

    protected ConnectionPool(String driver, String dsn, String usr, String pwd) {
        super();
        try {
            Class.forName(driver).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.err.println(e);
        }
        this.dsn = dsn;
        this.usr = usr;
        this.pwd = pwd;
    }

    @Override
    protected Connection create() {
        try {
            return (DriverManager.getConnection(dsn, usr, pwd));
        } catch (SQLException e) {
            System.err.println(e);
            return (null);
        }
    }

    @Override
    public boolean validate(Connection o) {
        try {
            return (!((Connection) o).isClosed());
        } catch (SQLException e) {
            System.err.println(e);
            return (false);
        }
    }

    @Override
    public void expire(Connection o) {
        try {
            ((Connection) o).close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}