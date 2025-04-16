package org.example.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConnection {
    public static final String URL = "jdbc:postgresql://127.0.0.1:5432/FIAP";

    public static final String User = "sys";

    public static final String Password = "senha123";

    //Metodo para obter uma conexao

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, User, Password);
    }
}
