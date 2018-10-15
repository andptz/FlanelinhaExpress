/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.componentes;

import java.sql.Connection;
import java.sql.ResultSet;
import persistencia.conexao.ConexaoBD;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.componentes.Estacionamento;
import modelo.componentes.Vaga;



public class PersistenciaVaga {
    Connection conexao = null;
    
    //Correção com o Novo Banco;
    public void criarVaga(Vaga vaga) throws SQLException{
        String sql;
        
        //VERIFICAR SE VAGA JÁ EXISTE NO BANCO DE DADOS
        //sql = String.format("SELECT E.nome FROM estado E WHERE E.nome ILIKE %s", estado.getNome());
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        
        /*if (!statement.executeQuery(sql).first()) {
        
            sql = String.format("INSERT INTO vaga (FK_VAGA_id,status,andar,numero,latitude,longitude)"
            + "VALUES (%d, %s, %d, %d, %s, %s)", vaga.getId(),vaga.getStatus(),vaga.getAndar(),vaga.getNumero(),vaga.getLatitude(),vaga.getLongitude());
            statement.executeUpdate(sql);
            System.out.println("Nova cidade cadastrada!");

        }
        else{
            System.out.println("Estado já cadastrado!");
        }*/
        
        statement.close();
        conexao.close();
    }
    //Metodo que retorna um array com todas as vagas do banco de dados.
    public ArrayList recuperarVagas(Estacionamento estacionamento) throws ClassNotFoundException, SQLException{
        ArrayList<Vaga> listaVagas = new ArrayList<>();
        String sql;
        
        sql = String.format("SELECT * FROM vaga V WHERE V.fk_ESTACIONAMENTO_ID = %d;", estacionamento.getId());
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
         
        //exeucta a query no meu banco de dados
        ResultSet rs = statement.executeQuery(sql);
        
        while(rs.next()){
                Vaga vaga = new Vaga();
                
                vaga.setId(rs.getInt("id"));
                /* Rever com o Novo Banco
                
                vaga.setStatus(rs.getString("status"));
                vaga.setAndar(rs.getInt("andar"));
                vaga.setNumero(rs.getInt("numero"));
                vaga.setLatitude(rs.getString("latitude"));
                vaga.setLongitude(rs.getString("longitude"));
                */
                listaVagas.add(vaga);
            }
        //fecha a conexao com o banco de dados
        statement.close();
        conexao.close();
        return listaVagas;
    }
}
