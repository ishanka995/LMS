/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

//import View.Login;
import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import DTO.LoginDetails;
/**
 *
 * @author Max point galgamuwa
 */
public class Login_controller {
    public static boolean adddetails(LoginDetails ld) throws ClassNotFoundException, SQLException{
        
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "insert into logindetails values (?,?)";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        
        
      return  ptsm.executeUpdate()>0;
    
    
    } 
    
}
