
package persistencia.componentes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import persistencia.conexao.ConexaoBD;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.componentes.Estacionamento;
import modelo.componentes.Veiculo;

public class PersistenciaVeiculo {
    Connection conexao = null;
    
    public void CriarVeiculoMotorista(Veiculo veiculo,int id_moto) throws SQLException{
        
        
        String sql;
        
        //Estabelece a conexão;
        conexao = ConexaoBD.conectar();
 
        //SQL Criar Veiculo;
        PreparedStatement ps = conexao.prepareStatement("INSERT INTO veiculo(modelo,marca,placa,ano,cor) values(?,?,?,?,?) returning id;");
        
        ps.setString(1,veiculo.getModelo()); // Modelo
        ps.setString(2,veiculo.getMarca()); // Marca
        ps.setString(3,veiculo.getPlaca()); // Placa    
        ps.setInt(4,veiculo.getAno()); // Ano
        ps.setString(5,veiculo.getCor()); // Cor
        
        //Executa SQL e guarda ID;
        ResultSet rs = ps.executeQuery();
      
        //Se obtiver algum resultado da Execução;
        if(rs.next()){
            
            //SQL Cria Veiculo Motorista;
            ps = conexao.prepareStatement("INSERT INTO veiculo_motorista(fk_veiculo_id,fk_motorista_fk_pessoa_fisica_fk_pessoa_id) values(?,?) returning fk_motorista_fk_pessoa_fisica_fk_pessoa_id;");
            ps.setInt(1,rs.getInt("id")); // ID Veiculo
            ps.setInt(2,id_moto); // ID Motoritsta
            
            //Executa SQL e guarda ID;
            rs = ps.executeQuery();
            
            //Verifica o ID retornado;
            if(rs.next()){
                
                if (rs.getInt("fk_motorista_fk_pessoa_fisica_fk_pessoa_id") == id_moto){
                    System.out.print("Sucesso - Motorista_Veiculo.");
                }
                
            }
            ps.close();
            conexao.close();
        }
         
    }
    
    public void updateCorVeiculo(String nomeVeiculo,String cor) throws SQLException{
        
        String sql;
        
        //Estabelece a conexão;
        conexao = ConexaoBD.conectar();
 
        //SQL UpdateVeiculo;
        PreparedStatement ps = conexao.prepareStatement("UPDATE veiculo SET cor = ? where modelo = ? returning id;");
        
        ps.setString(1,cor); // Cor
        ps.setString(2,nomeVeiculo);//Modelo
        
        //Executa SQL e guarda ID;
        ResultSet rs = ps.executeQuery();
        ps.close();
        conexao.close();
    
    }
    public void deletaVeiculo(String nomeVeiculo) throws SQLException{
        
        String sql;
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        
        sql = String.format("SELECT id FROM veiculo WHERE marca = '%s';",nomeVeiculo);
       
        //exeucta a query no meu banco de dados
        ResultSet rs = statement.executeQuery(sql);
        if(rs.next()){
            int id_veiculo = rs.getInt("id");
            sql = String.format("DELETE FROM veiculo_motorista WHERE fk_veiculo_id= '%s' returning fk_veiculo_id;",id_veiculo);
            rs = statement.executeQuery(sql);
            
            if(rs.next()){
                sql = String.format("DELETE FROM veiculo WHERE id= '%s' returning id;",id_veiculo);
                rs = statement.executeQuery(sql);
                
            }
        }
        statement.close();
        conexao.close();
        
    }
    
    //Metodo que retorna um array com todos os veiculos do banco de dados.
    public ArrayList recuperarVeiculos(Estacionamento estacionamento) throws ClassNotFoundException, SQLException{
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        String sql;
        
        sql = String.format("SELECT * FROM veiculo");
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
         
        //exeucta a query no meu banco de dados
        ResultSet rs = statement.executeQuery(sql);
        
        while(rs.next()){
                Veiculo veiculo = new Veiculo();
                veiculo.setId(rs.getInt("id"));
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setAno(rs.getInt("ano"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setMarca(rs.getString("Marca"));
                listaVeiculos.add(veiculo);
            }
        //fecha a conexao com o banco de dados
        statement.close();
        conexao.close();
        return listaVeiculos;
    }  
        
    //Metodo que retorna um array com todos os veiculos do banco de dados.
    public ArrayList recuperarVeiculosMotorista(int id_moto) throws ClassNotFoundException, SQLException{
        
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        String sql;
        
        sql = String.format("SELECT fk_veiculo_id FROM veiculo_motorista WHERE fk_motorista_fk_pessoa_fisica_fk_pessoa_id = %d;",id_moto);
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
         
        //exeucta a query no meu banco de dados
        ResultSet rs = statement.executeQuery(sql);
        
        while(rs.next()){
                Veiculo veiculo = new Veiculo();
                veiculo.setId(rs.getInt("fk_veiculo_id"));
                listaVeiculos.add(veiculo);
        }
        
        for(int i = 0; i < listaVeiculos.size();i++){
            
            sql = String.format("SELECT * FROM veiculo WHERE id = %d;",listaVeiculos.get(i).getId());
            rs = statement.executeQuery(sql);
            
            if(rs.next()){
                listaVeiculos.get(i).setCor(rs.getString("cor"));
                listaVeiculos.get(i).setPlaca(rs.getString("placa"));
                listaVeiculos.get(i).setMarca(rs.getString("modelo"));
                listaVeiculos.get(i).setModelo(rs.getString("marca"));
                listaVeiculos.get(i).setAno(rs.getInt("ano"));
            }
            
        }
      
        //fecha a conexao com o banco de dados       
        statement.close();
        conexao.close();
        
        return listaVeiculos;
    }
    
    
}
