

package factura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class ConexionBD {
    Connection cn;
    
    public Connection conexion(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/Factura","root","");
        System.out.println("Conectado con Exito");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }return cn;
    }
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}
