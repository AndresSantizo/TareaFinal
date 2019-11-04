
package Conexiones;

import java.sql.Connection;
import javax.swing.JOptionPane;

import java.sql.DriverManager;

public class conexionSQL {
    Connection connection;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/Escuela","multiusos","12345");
            JOptionPane.showMessageDialog(null,"Conexion exitosa");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        }
        return connection;
    }
    
    public void setVisible(boolean b){
        throw new UnsupportedOperationException("Not supported yet");
    }
    
}
