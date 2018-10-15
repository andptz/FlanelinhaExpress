
package persistencia.locais;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.locais.Bairro;
import modelo.locais.Cidade;
import modelo.locais.Estado;
import persistencia.conexao.ConexaoBD;


public class PersistenciaCidade {
    Connection conexao = null;
    
    public void insertCidade(Cidade cidade) throws SQLException{
        String sql;

        sql = String.format("SELECT C.nome FROM cidade C WHERE C.nome LIKE '%s' AND C.FK_ESTADO_id = %d;", cidade.getNome(), cidade.getEstado().getId());

        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        
        //Se não existir uma cidade de mesmo nome da que se está tentando registrar, em um determinado estado, então o registro é permitido.
        if (!statement.executeQuery(sql).first()) {
            sql = String.format("INSERT INTO cidade (nome, FK_ESTADO_id) "
                    + "VALUES (%s, %d)", cidade.getNome(), cidade.getFK_ESTADO_id());
            
            statement.executeUpdate(sql);
            System.out.println("Nova cidade registrada com sucesso!");
        }
        else
            System.out.println("Cidade já existente no banco de dados!");
        
        statement.close();
        conexao.close();
    }
    
    //Método que retorna num Array, as cidades (recuperadas de um banco de dados) de um determinado estado.
    public ArrayList recuperarCidades(Estado estado) throws SQLException{
        ArrayList<Cidade> listaCidades = new ArrayList<>();
        
        //Seleciona as cidades de um determinado estado.
        String sql = String.format("SELECT * FROM cidade WHERE cidade.FK_ESTADO_id = %d;", estado.getId());
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        
        //exeucta a query no banco de dados
        ResultSet rs = statement.executeQuery(sql);
        
        while(rs.next()){
            Cidade cidade = new Cidade();
            cidade.setId(rs.getInt("id"));
            cidade.setNome(rs.getString("nome"));
            cidade.setFK_ESTADO_id(estado.getId());
            cidade.setEstado(estado);
           // PersistenciaBairro bairro = new PersistenciaBairro();
           // cidade.setLista_bairros(bairro.recuperarBairros(cidade));
            listaCidades.add(cidade);
        }
        
        //fecha a conexao com o banco de dados
        statement.close();
        conexao.close();
        return listaCidades;
    }
    
    
    
    
    //Método que formata a saída em texto das cidades. (Método não utilizado)
    public String toString(ArrayList<Cidade> listaCidades){
        String texto = "";
        
        for (Cidade cidade : listaCidades) {
            texto += cidade.getId() + " - " + cidade.getNome()+ "\n";
        }
        
        //Removendo o último caracter ("\n") da string.
        if (texto.length() > 0)
            texto = texto.substring(0, texto.length()-1);
        return texto;
    }
}