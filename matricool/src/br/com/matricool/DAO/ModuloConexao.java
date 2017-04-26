
package br.com.matricool.dao;
import java.sql.*;

public class ModuloConexao {
    
 //Método responsavel por estabelecer a conexão com o banco.
    public static Connection conector(){
        
       //Conexao refere-se a uma variavel que recebe null.
     java.sql.Connection conexao = null;
     
     //A linha abaixo chama o driver que importado aqui para a biblioteca.
     String driver = "com.mysql.jdbc.Driver";
     
     //Armazenando informaçãoes referente ao banco.
     String url="jdbc:mysql://localhost:3306/db_matricool";
     String user="root"; //Usuario db
     String password=""; //Senha db
     
     //Estabelecendo a conexão com o banco.
        try {
            Class.forName(driver);
            //Se der tudo certo (se obtiver resposta do servidor), obtem a conexao e armazena na variavel conexao.
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            
            //Caso ocorra uma excessao ele retorna null.
            return null;
            
             //A linha abaixo serve de apoio para esclarecer o erro
            //System.out.println(e);
            
            
        }
     
    }
    
    
    
    
    
}
