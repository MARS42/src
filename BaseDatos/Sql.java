/*
Esta clase es la conexion a mysql 
 */
package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Sql 
{
    //Esta Variable es la interfaz para conectar a mysql
    private static Connection conect = null;
    private static final String driver="com.mysql.jdbc.Driver"; 
    //Variables para la conexion a mysql 
    String servidor="bzhxn1jvfwzfcmdmvsna-mysql.services.clever-cloud.com";
    String baseDatos="bzhxn1jvfwzfcmdmvsna";
    String usuario="uqrpgkbs9nbay4jd";
    String password="67xGHnnVYGKSuO3f6zO7";
   
    public  void apagar ()
    {
        try {
            conect.close();
        } catch (Exception e) {}
    }
    public Sql(){
    //El constructor realiza la conexion a mysql
        conect =null;
        try {
            Class.forName(driver);
            // String n="jdbc:mysql://"+host+"/"+bd+","+user+","+password;
            conect = DriverManager.getConnection("jdbc:mysql://"+servidor+"/"+baseDatos,usuario,password);
        }
        catch (ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
       }
    public Connection getConnection(){ return conect; }          
}
