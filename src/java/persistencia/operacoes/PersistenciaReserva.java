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
import modelo.componentes.Vaga;
import modelo.componentes.Veiculo;
import modelo.operacoes.Reserva;
import modelo.operadores.Motorista;

public class PersistenciaReserva {
    Connection conexao = null;
    private Motorista motorista;
    private Vaga vaga;
    private Veiculo veiculo;
    
    public void CriarReserva(Reserva reserva) throws SQLException{
        String sql;
         
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        
        /*Correção com o Novo Banco;
        sql = String.format("INSERT INTO reserva (horaReserva, dataReserva, horaSaida, fk_veiculo_id, fk_vaga_id, fk_motorista_fk_pessoa_fisica_fk_pessoa_id)"
        + "VALUES (%s, %s, %s, %d, %d, %d)",reserva.getHoraReserva(),reserva.getHoraReserva(),reserva.getHoraSaida(),reserva.getVeiculo().getId(),reserva.getVaga().getId(),reserva.getMotorista().getId_pessoa() );
        */
        //statement.executeUpdate(sql);
        System.out.println("Nova reserva cadastrada!");
        
        statement.close();
        conexao.close();
         
    }
    
     public ArrayList<Reserva> selectFiltroBairro2(String bairro) throws SQLException{

        ArrayList<Reserva> listRes = new ArrayList<>();
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        
        String sql = String.format("SELECT id FROM bairro WHERE nome = '%s';",bairro);
          
        //exeucta a query no meu banco de dados
        ResultSet rs = statement.executeQuery(sql);
        
        if(rs.next()){
            int id_bairro = rs.getInt("id");
            sql = String.format("SELECT id FROM endereco WHERE fk_bairro_id = '%d';",id_bairro);
            rs = statement.executeQuery(sql);
            
            if(rs.next()){
                
                int id_endereco = rs.getInt("id");
                sql = String.format("SELECT id FROM estacionamento WHERE fk_endereco_id = '%d';",id_endereco);
                rs = statement.executeQuery(sql);
                
                if(rs.next()){
                    
                    int id_estacionamento = rs.getInt("id");
                    sql = String.format("SELECT datareserva,horareserva,horasaida FROM reserva WHERE fk_estacionamento_id = '%d';",id_estacionamento);
                    rs = statement.executeQuery(sql);
                    
                    while(rs.next()){
                        Reserva res = new Reserva();
                        res.setDataReserva(rs.getString("datareserva"));
                        res.setHoraReserva(rs.getString("horareserva"));
                        res.setHoraSaida(rs.getString("horasaida"));
                        listRes.add(res);
                    }

                    
                
                }

            }
            
        }

        return listRes;
    }
    
    //Recebe o motorista e recupera a reserva
    public ArrayList recuperarReserva(int id) throws ClassNotFoundException, SQLException{
        ArrayList<Reserva> listaReservas = new ArrayList<>();
        String sql;
        
        sql = String.format("SELECT * FROM reserva R WHERE R.fk_motorista_fk_pessoa_fisica_fk_pessoa_id = %d;",id);
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
         
        //exeucta a query no meu banco de dados
        ResultSet rs = statement.executeQuery(sql);
        
        while(rs.next()){
                Reserva reserva = new Reserva();
                reserva.setId(rs.getInt("ID"));
                reserva.setHoraReserva(rs.getString("Hora Reserva"));
                reserva.setHoraSaida(rs.getString("Hora Saida"));
                reserva.setDataReserva(rs.getString("Data Reserva"));
                
                listaReservas.add(reserva);
                
            }
        //fecha a conexao com o banco de dados
        statement.close();
        conexao.close();
        return listaReservas;
    }
    
    public ArrayList recuperarReserva2(Motorista motorista,Veiculo veiculo) throws ClassNotFoundException, SQLException{
        ArrayList<Reserva> listaReservas = new ArrayList<>();
        String sql;
        
        sql = String.format("SELECT * FROM reserva R WHERE R.fk_motorista_fk_pessoa_fisica_fk_pessoa_id = %d AND WHERE R.fk_veiculo_id = %d;", motorista.getId_pessoa(),veiculo.getId());
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
         
        //exeucta a query no meu banco de dados
        ResultSet rs = statement.executeQuery(sql);
        
        while(rs.next()){
                Reserva reserva = new Reserva();
                reserva.setId(rs.getInt("ID"));
                reserva.setHoraReserva(rs.getString("Hora Reserva"));
                reserva.setHoraSaida(rs.getString("Hora Saida"));
                reserva.setDataReserva(rs.getString("Data Reserva"));
                
                listaReservas.add(reserva);
                
            }
        //fecha a conexao com o banco de dados
        statement.close();
        conexao.close();
        return listaReservas;
    }
    
    
}

