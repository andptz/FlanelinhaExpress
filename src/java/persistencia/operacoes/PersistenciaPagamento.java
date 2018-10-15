/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.operacoes;

import java.sql.Connection;
import java.sql.ResultSet;
import persistencia.conexao.ConexaoBD;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.operacoes.Pagamento;


public class PersistenciaPagamento {
    
    Connection conexao = null;
    
    public void CriarPagamento(Pagamento pagamento) throws SQLException{
        String sql;
         
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        
        /* Acerta com o novo Banco;
        
        sql = String.format("INSERT INTO pagamento (id_pagamento,valor,data,id_vaga,cpf)"
        + "VALUES (%d, %f, %s, %d, %s)",pagamento.getId(),pagamento.getValor(),pagamento.getData(),pagamento.getVaga().getId(),pagamento.getMotorista().getCpf() );
        statement.executeUpdate(sql);
        */
        System.out.println("Novo pagamento cadastrado!");
        
        statement.close();
        conexao.close();
         
    }
    
}
