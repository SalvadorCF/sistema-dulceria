package General;

import java.sql.*;

public class conexionBDM {

    Connection cn;

    public Connection conexion() {
        
        //CONEXION MARIANA
        
     try{
     Class.forName("com.mysql.jdbc.Driver");
    //cn= DriverManager.getConnection("jdbc:mysql://localhost/puntoventa","root","");
    cn= DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/bMhGTRr2QX","bMhGTRr2QX","geRLb0BqhH");
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
