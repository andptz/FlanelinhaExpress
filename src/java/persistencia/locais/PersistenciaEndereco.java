
package persistencia.locais;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.componentes.Estacionamento;
import modelo.locais.Endereco;
import persistencia.conexao.ConexaoBD;


public class PersistenciaEndereco {
    Connection conexao = null;
    
    public void insertEndereco(Endereco endereco) throws SQLException{
        String sql;
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        
        sql = String.format("INSERT INTO endereco (complemento, cep, logradouro, FK_BAIRRO_id) "
                    + "VALUES ('%s', '%s', '%s', %d);",
                endereco.getComplemento(), endereco.getCep(),
                endereco.getLogradouro(),endereco.getBairro().getId());
        
        statement.executeUpdate(sql);
        System.out.println("Novo endereço registrado com sucesso!");
        
        statement.close();
        conexao.close();
    }
    
    public void recuperartEndereco(Estacionamento estacionamento){
        
    }
}
