/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import DTO.Book_Issue;

import Model.Books;

/**
 *
 * @author Max point galgamuwa
 */
public class Issue_controller {

//    public static ArrayList<Book> LoadAllMember() throws ClassNotFoundException, SQLException, Exception {
//
//        Connection connection = DBConnection.getInstance().getConnection();
//        String sql = "Select BOOK_ID from Issue_Book Where status = 1";
//        PreparedStatement ptsm = connection.prepareStatement(sql);
//        ResultSet rst = ptsm.executeQuery();
//        
//           
//           
//
//        
//        
//    }
    public static boolean IssueBook(Book_Issue b) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        //String sql = "insert into Issue_Book values (?,?,?,?,?,?,?,?,?,?,?,?,?) ";
        String sql = "insert into Issue_Book values (?,?,?,?,?,?,?,?,?,?,?,?) ";
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
        ptsm.setObject(11, b.getIssueDate());
        ptsm.setObject(12, b.getIssueID());

        return ptsm.executeUpdate() > 0;

    }

    public static Book_Issue RsearchItem(String code) throws ClassNotFoundException, SQLException {

//          public Book searchCustomer(String id) throws Exception {
//       Connection connection = DBConnection.getInstance().getConnection();
//       String sql = "select * from book_manage where BOOK_ID=?";
//       PreparedStatement ptsm = connection.prepareStatement(sql);
//       ptsm.setObject(1, id);
//       ResultSet rst = ptsm.executeQuery();
//       Book book = null;
//       while (rst.next()){
//       book = new Book(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5));
//       }
//        return book;
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from issue_book where BOOK_ID=?";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ptsm.setObject(1, code);
        ResultSet rst = ptsm.executeQuery();
        Book_Issue book_issue = null;
        while (rst.next()) {

            book_issue = new Book_Issue(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12));

//((JTextField) Birthdate.getDateEditor().getUiComponent()).setText(birthdate);
        }
        return book_issue;

    }

//    public static Books searchBook(String Rack, String colomn, String row) throws ClassNotFoundException, SQLException {
//
//        Connection connection = DBConnection.getInstance().getConnection();
//        String sql = "select * from bookmanage where Rack=? && colomn=? && row=?";
//        PreparedStatement ptsm = connection.prepareStatement(sql);
//        ptsm.setObject(1, Rack);
//        ptsm.setObject(2, colomn);
//        ptsm.setObject(3, row);
//        ResultSet rst = ptsm.executeQuery();
//        Books book = null;
//        while (rst.next()) {
//            book = new Books(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9));
//            
//
//        }return book;
//}
}