/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import DTO.BookDTO;
import DTO.Book_Issue;

/**
 *
 * @author Max point galgamuwa
 */
public interface SuperDao {

    public boolean addbook(BookDTO b) throws Exception;

    public boolean updatebook(BookDTO b) throws Exception;

    public ArrayList<BookDTO> getAllBooks() throws Exception;

    public boolean deletebook(String id) throws Exception;
    
    public BookDTO searchCustomer(String id)throws Exception;
    
    public Book_Issue searchIBook(String id) throws Exception;
}
