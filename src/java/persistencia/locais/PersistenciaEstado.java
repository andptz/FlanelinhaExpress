
package persistencia.locais;


import java.sql.Connection;
import java.sql.ResultSet;
import persistencia.conexao.ConexaoBD;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.locais.Estado;


public class PersistenciaEstado {
    Connection conexao = null;
    
    //Método insertEstado() não é utilizado, foi criado apenas para fins didáticos.
    public void insertEstado(Estado estado) throws SQLException{
        String sql;
        
        sql = String.format("SELECT E.nome FROM estado E WHERE E.nome ILIKE %s", estado.getNome());
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        
        if (!statement.executeQuery(sql).first()) {
            sql = String.format("INSERT INTO estado (nome)"
                + "VALUES (%s)", estado.getNome());
            statement.executeUpdate(sql);
            System.out.println("Nova cidade cadastrada!");
        }
        else{
            System.out.println("Estado jÃ¡ cadastrado!");
        }
        
        statement.close();
        conexao.close();
    }

    public ArrayList recuperarEstados() throws ClassNotFoundException, SQLException{
        ArrayList<Estado> listaEstados = new ArrayList<>();
        
        String sql ="SELECT * FROM estado";
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
         
        //exeucta a query no meu banco de dados
        ResultSet rs = statement.executeQuery(sql);
        
        while(rs.next()){
            Estado estado = new Estado();
            estado.setId(rs.getInt("id"));
            estado.setNome(rs.getString("nome"));
            PersistenciaCidade cidade = new PersistenciaCidade();
            estado.setLista_cidades(cidade.recuperarCidades(estado));
            listaEstados.add(estado);
            }
        //fecha a conexao com o banco de dados
        statement.close();
        conexao.close();
        
        return listaEstados;
    }

    //Método que formata a saída em texto dos estados (apenas para teste).
    public String toString(ArrayList<Estado> listaEstados){
        String texto = "";
        
        for (Estado estado : listaEstados) {
            texto += estado.getId() + " - " + estado.getNome()+ "\n";
        }
        
        //Removendo o último caracter ("\n") da string.
        if (texto.length() > 0)
            texto = texto.substring(0, texto.length()-1);
        
        return texto;
    }
}
