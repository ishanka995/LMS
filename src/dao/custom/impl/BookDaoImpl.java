/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtill;
import dao.custom.BookDao;
import java.awt.print.Book;
import java.util.ArrayList;
import Model.Books;
import Model.Member;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Max point galgamuwa
 */
public class BookDaoImpl implements BookDao {

    @Override
    public boolean add(Books t) throws Exception {
        return CrudUtill.executeUpdate("insert into bookmanage values(?,?,?,?,?,?,?,?,?)", t.getBOOK_ID(), t.getBook_Name(), t.getAuthor(), t.getISBN_No(), t.getPublisher(), t.getRack(), t.getColomn(), t.getRow(), t.getDonation());
    }

    @Override
    public boolean update(Books t) throws Exception {
        return CrudUtill.executeUpdate("update bookmanage set Book_Name=?,Author=?,ISBN_No=?,Publisher=?,Rack=?,colomn=?,row=?,Donation=? where BOOK_ID =?", t.getBook_Name(), t.getAuthor(), t.getISBN_No(), t.getPublisher(), t.getRack(), t.getColomn(), t.getRow(), t.getDonation(), t.getBOOK_ID());
    }

    @Override
    public boolean delete(String id) throws Exception {
    return  CrudUtill.executeUpdate("delete from bookmanage where Book_ID = ?", id);
    }

    @Override
    public Books search(String id) throws Exception {
        ResultSet rst = CrudUtill.executeQuery("select BOOK_ID,Book_Name,Author,ISBN_No,Publisher from bookmanage where BOOK_ID = ?", id);
        Books books = null;
        while (rst.next()) {

            books = new Books(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
        }
        return books;
    }

    @Override
    public ArrayList<Books> getAll() throws Exception {
        ResultSet rst = CrudUtill.executeQuery("select * from bookmanage");
        ArrayList<Books> allBooks = new ArrayList<>();
        while (rst.next()) {
            Books books = new Books(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9));
            allBooks.add(books);
        }
        return allBooks;
    }
}
