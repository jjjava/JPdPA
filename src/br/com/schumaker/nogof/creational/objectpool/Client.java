package br.com.schumaker.nogof.creational.objectpool;

import java.sql.Connection;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool(
                "com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/mydb",
                "root", "1234");
        // Pegando a conexão
        Connection con = pool.acquire();
        // Usando a conexão
        //...
        // Devolvendo a conexão
        pool.release(con);
    }
}
