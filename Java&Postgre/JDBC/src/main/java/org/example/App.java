package org.example;

import org.example.factory.FactoryConnection;

import java.sql.Connection;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args )
    {
        try{

            Connection conexao = FactoryConnection.getConnection(); //Realiza a conexao configurada na factory

            Statement stm = conexao.createStatement(); //Stm criado para conseguirmos realizar operacoes no banco de dados

            stm.executeUpdate("INSERT INTO T_SIP_PROJETO (CD_PROJETO, NM_PROJETO, DT_INICIO) " +
                                   "VALUES (10009, 'PROJETO NOVO',TO_DATE('19/03/2020','DD/MM/YYYY'))");

            System.out.println("Projeto Cadastrado!");

            stm.close();
            conexao.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
