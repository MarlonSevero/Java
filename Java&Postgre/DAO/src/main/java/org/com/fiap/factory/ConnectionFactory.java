package org.com.fiap.factory;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static final String URL = "jdbc:postgresql://127.0.0.1:5432/FIAP";

    public static final String User = "sys";

    public static final String Password = "senha123";

    public static java.sql.Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, User, Password);
    }
}
