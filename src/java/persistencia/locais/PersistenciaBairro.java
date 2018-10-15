
package persistencia.locais;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.locais.Bairro;
import persistencia.conexao.ConexaoBD;


public class PersistenciaBairro {
    Connection conexao = null;
   
    public ArrayList recuperarBairros(int id) throws SQLException{
        String sql;
        ArrayList<Bairro> listaBairros = new ArrayList<>();
        //Seleciona as cidades de um determinado estado.
        sql = String.format("SELECT * FROM bairro B WHERE B.FK_CIDADE_id = %d;", id);
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        
        //exeucta a query no banco de dados
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
            Bairro bairro = new Bairro();
            bairro.setId(rs.getInt("id"));
            bairro.setNome(rs.getString("nome"));
            listaBairros.add(bairro);
        }
        //fecha a conexao com o banco de dados
        statement.close();
        conexao.close();
        
        return listaBairros;
    }

    public String toString(ArrayList<Bairro> listaBairros) {
        String texto = "";
        
        for (Bairro bairro : listaBairros) {
            texto += bairro.getId() + " - " + bairro.getNome()+ "\n";
        }
        
        //Removendo o último caracter ("\n") da string.
        if (texto.length() > 0)
            texto = texto.substring(0, texto.length()-1);
        
        return texto;
    }
    
}
