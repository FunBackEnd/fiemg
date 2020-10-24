
package cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Cadastro {

  public static Connection conectar(){
      
  Connection con = null;
  final String URL = "JDBC:mysql://localhost:3306/cadastro?useTimezone=true&serverTimezone=UTC";
  final String USER = "root";
  final String PASS = "!@#abc123";
  
  try
  {
  con = DriverManager.getConnection(URL,USER,PASS);
  return con;
  }
  catch(SQLException e)
  {
   return null;   
  }
  
  }
    public static void desconectar(Connection con) 
  {
        try {
            con.close();
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, e);
        }
    }
}
  
  
    
    
       

