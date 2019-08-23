/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import DTO.Book_Issue;
import DTO.Book_Return;

/**
 *
 * @author Max point galgamuwa
 */
public class Return_controller {
    public static boolean deleteBook(String id) throws ClassNotFoundException, SQLException {
       
//        Connection connection = DBConnection.getInstance().getConnection();
//        String sql = "Delete from member_manage where Member_ID = ?";
//        PreparedStatement pstm = connection.prepareStatement(sql);
//        pstm.setObject(1, id);
//        return pstm.executeUpdate() > 0;

Connection connection = DBConnection.getInstance().getConnection();
String sql = "Delete from issue_book where BOOK_ID = ?";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ptsm.setObject(1, id);
        return ptsm.executeUpdate()>0;
}
    
    public static boolean ReturnBook(Book_Return b) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        //String sql = "insert into Issue_Book values (?,?,?,?,?,?,?,?,?,?,?,?,?) ";
        String sql = "insert into Return_Book values (?,?,?,?,?,?,?,?,?,?,?,?) ";
        PreparedStatement ptsm = connection.prepareStatement(sql);

        ptsm.setObject(1, b.getBOOK_ID());
        ptsm.setObject(2, b.getBook_Name());
        ptsm.setObject(3, b.getAuthor());
        ptsm.setObject(4, b.getISBN_No());
        ptsm.setObject(5, b.getPublisher());
        ptsm.setObject(6, b.getMember_ID());
        ptsm.setObject(7, b.getMember_Name());
        ptsm.setObject(8, b.getBirthDate());
        ptsm.setObject(9, b.getEmail());
        ptsm.setObject(10, b.getTelePhone_No());
        ptsm.setObject(11, b.getReturnDate());
        ptsm.setObject(12, b.getReturn_ID());

        return ptsm.executeUpdate() > 0;

    }
}