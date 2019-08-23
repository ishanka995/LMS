/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DTO.BookDTO;
import DTO.Book_Issue;

/**
 *
 * @author Max point galgamuwa
 */
public class BookManageDAO implements SuperDao {

    @Override
    public boolean addbook(BookDTO b) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "insert into Book_Manage values (?,?,?,?,?)";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ptsm.setObject(1, b.getBOOK_ID());
        ptsm.setObject(2, b.getBook_Name());
        ptsm.setObject(3, b.getAuthor());
        ptsm.setObject(4, b.getISBN_No());
        ptsm.setObject(5, b.getPublisher());
        return ptsm.executeUpdate() > 0;

    }

    @Override
    public boolean updatebook(BookDTO b) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "update book_manage set Book_Name=?,Author=?,ISBN_NO=?,Publisher=? where BOOK_ID= ?";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ptsm.setObject(5, b.getBOOK_ID());
        ptsm.setObject(1, b.getBook_Name());
        ptsm.setObject(2, b.getAuthor());
        ptsm.setObject(3, b.getISBN_No());
        ptsm.setObject(4, b.getPublisher());

        return ptsm.executeUpdate() > 0;
    }

    @Override
    public ArrayList<BookDTO> getAllBooks() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from book_manage";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ResultSet rst = ptsm.executeQuery();
        ArrayList<BookDTO> allbooks = new ArrayList<>();
        while (rst.next()) {
           // Book book = new Book(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
            //allbooks.add(book);

        }
        return allbooks;
    }

    @Override
    public boolean deletebook(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "delete from book_manage where BOOK_ID = ?";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ptsm.setObject(1, id);
        return ptsm.executeUpdate() > 0;
    }

    @Override
    public BookDTO searchCustomer(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from book_manage where BOOK_ID=?";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ptsm.setObject(1, id);
        ResultSet rst = ptsm.executeQuery();
        BookDTO book = null;
        while (rst.next()) {
           // book = new Book(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
        }
        return book;
    }

    @Override
    public Book_Issue searchIBook(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from issue_book where BOOK_ID=?";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ptsm.setObject(1, id);
        ResultSet rst = ptsm.executeQuery();
        Book_Issue book_issue = null;
        while (rst.next()) {
            book_issue = new Book_Issue(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12));
        }
        return book_issue;
    }
  
}
