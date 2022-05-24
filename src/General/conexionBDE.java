package General;

import java.sql.*;

public class conexionBDE {

    Connection cn;

    public Connection conexion() {
        
        //CONEXION EDGAR
        
     try{
     Class.forName("com.mysql.jdbc.Driver");
    //cn= DriverManager.getConnection("jdbc:mysql://localhost/puntoventa","root","");
    cn= DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/TWJWr2HkTl","TWJWr2HkTl","9fEqLkXqtn");
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
