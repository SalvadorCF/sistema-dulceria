package General;

import java.sql.*;

public class conexionBDA {

    Connection cn;

    public Connection conexion() {
        
        //CONEXION ABIGAIL
        
     try{
     Class.forName("com.mysql.jdbc.Driver");
    //cn= DriverManager.getConnection("jdbc:mysql://localhost/puntoventa","root","");
    cn= DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/Cr8grQ7esE","Cr8grQ7esE","qIuJBlmB0l");
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
