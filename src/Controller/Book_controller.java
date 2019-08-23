


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.BookManageDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import DTO.BookDTO;
import DTO.Book_Issue;

/**
 *
 * @author Max point galgamuwa
 */
public class Book_controller {

    public static boolean addBook(BookDTO book) throws ClassNotFoundException, SQLException {
        BookManageDAO dao = new BookManageDAO();
        return dao.addbook(book);

    }

    public static boolean updateBook(BookDTO book) throws Exception {
        return new BookManageDAO().updatebook(book);

    }

    public static ArrayList<BookDTO> getAllBooks() throws Exception {
        return new BookManageDAO().getAllBooks();

    }
    public static boolean deletebook (String id) throws Exception{
     return   new BookManageDAO().deletebook(id);
      
    }
   public static BookDTO searchbook (String id) throws Exception{
    return new BookManageDAO().searchCustomer(id);
   
   }
   public static Book_Issue searchIbook(String id) throws Exception{
     return  new BookManageDAO().searchIBook(id);
   
   }
}
