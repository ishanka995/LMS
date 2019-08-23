/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.MemberM_Controller.bo;
import Model.Books;
import Model.Issue;
import Model.Member;
import bo.BOFactory;
import bo.custom.BookBo;
import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Max point galgamuwa
 */
public class BookMax_con {

    static BookBo bo = (BookBo) BOFactory.getInstance().getBO(BOFactory.BOTypes.Book);

    public static boolean addBook(Books books) throws Exception {
        return bo.addBook(books);

    }

    public static boolean update(Books books) throws Exception {

        return bo.updateBook(books);

    }

    public static Books searchbook(String id) throws Exception {
        return bo.searchBook(id);

    }

    public static boolean deleteBook(String id) throws Exception {

        return bo.deleteBook(id);

    }

    public static Books searchBook(String Rack, String colomn, String row) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from bookmanage where Rack=? && colomn=? && row=?";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ptsm.setObject(1, Rack);
        ptsm.setObject(2, colomn);
        ptsm.setObject(3, row);
        ResultSet rst = ptsm.executeQuery();
        Books book = null;
        while (rst.next()) {
        book = new Books(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9));

        }
        return book;
    }

    public static ArrayList<Books> getAllBooks() throws Exception {
        return bo.getAllBooks();

    }
    public static Books searchBOOK(String code) throws ClassNotFoundException, SQLException {
        //static MemberBo bo = (MemberBo) BOFactory.getInstance().getBO(BOFactory.BOTypes.Member);
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select BOOK_ID,Book_Name,Author,ISBN_No,Publisher from bookmanage where BOOK_ID = ?";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ptsm.setObject(1, code);
        ResultSet rst = ptsm.executeQuery();
        Books book = null;
        while (rst.next()) {
            book = new Books();
            book.setBOOK_ID(rst.getString(1));
            book.setBook_Name(rst.getString(2));
            book.setAuthor(rst.getString(3));
            book.setISBN_No(rst.getString(4));
            book.setPublisher(rst.getString(5));
            
        }
        return book;
        }
    
    public static Issue SIssueBook(String code) throws ClassNotFoundException, SQLException {
        //static MemberBo bo = (MemberBo) BOFactory.getInstance().getBO(BOFactory.BOTypes.Member);
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from issuebook where BookID = ?";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ptsm.setObject(1, code);
        ResultSet rst = ptsm.executeQuery();
        Issue issue = null;
        while (rst.next()) {
            issue = new Issue(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9),rst.getString(10),rst.getString(11),rst.getString(12),rst.getString(13));
            
            
        }
        return issue;
        }

}
