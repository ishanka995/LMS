/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import Model.Books;
import bo.Superbo;
import java.util.ArrayList;

/**
 *
 * @author Max point galgamuwa
 */
public interface BookBo extends Superbo {
    
    public boolean addBook(Books books)throws Exception;
    public boolean deleteBook(String id)throws Exception;
    public boolean updateBook(Books books)throws Exception;
    public Books searchBook(String id)throws Exception;
    public ArrayList<Books> getAllBooks()throws Exception;
    
    
}
