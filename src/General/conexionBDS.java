package General;

import java.sql.*;

public class conexionBDS {

    Connection cn;

    public Connection conexion() {
        
        //CONEXION SALVADOR
        
     try{
     Class.forName("com.mysql.jdbc.Driver");
    //cn= DriverManager.getConnection("jdbc:mysql://localhost/puntoventa","root","");
    cn= DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/wPnioWJU5g","wPnioWJU5g","zrLYuiEQpm");
    System.out.println("Se hizo la conexion exitosa");
     } catch(Exception e){
         System.out.println(e.getMessage());
         
     }
     return cn;
     
    }
       Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
        
    }
    

}
