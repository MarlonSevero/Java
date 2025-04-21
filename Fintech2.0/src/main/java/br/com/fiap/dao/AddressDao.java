package br.com.fiap.dao;

import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.user.Address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressDao {
    private final Connection connection;

    public AddressDao() throws SQLException {
        connection = ConnectionFactory.getConnection();
    }

    public int save(Address address) throws SQLException {
        String sql = "INSERT INTO address (cidade, rua, bairro, numero, complemento) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stm = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stm.setString(1, address.getCidade());
            stm.setString(2, address.getRua());
            stm.setString(3, address.getBairro());
            stm.setString(4, address.getNumero());
            stm.setString(5, address.getComplemento());
            stm.executeUpdate();

            try (ResultSet generatedKeys = stm.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1);
                } else {
                    throw new SQLException("Falha ao obter ID do endereço.");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar endereço: " + e.getMessage(), e);
        }
    }

    public void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}