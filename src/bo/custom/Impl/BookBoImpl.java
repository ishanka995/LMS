/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.Impl;

import Model.Books;
import Model.Member;

import bo.custom.BookBo;
import dao.CrudUtill;
import dao.DaoFactory;
import dao.custom.BookDao;
import java.util.ArrayList;

/**
 *
 * @author Max point galgamuwa
 */
public class BookBoImpl implements BookBo {

    static BookDao dao = DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.Book);

    @Override
    public boolean addBook(Books books) throws Exception {
        return dao.add(new Books(books.getBOOK_ID(), books.getBook_Name(), books.getAuthor(), books.getISBN_No(), books.getPublisher(), books.getRack(), books.getColomn(), books.getRow(), books.getDonation()));
    }

    @Override
    public boolean deleteBook(String id) throws Exception {
        return dao.delete(id);
    }

    @Override
    public boolean updateBook(Books books) throws Exception {
        return dao.update(new Books(books.getBOOK_ID(), books.getBook_Name(), books.getAuthor(), books.getISBN_No(), books.getPublisher(), books.getRack(), books.getColomn(), books.getRow(), books.getDonation()));
    }

    @Override
    public Books searchBook(String id) throws Exception {
        Books search = dao.search(id);
        return new Books(search.getBOOK_ID(), search.getBook_Name(), search.getAuthor(), search.getISBN_No(), search.getPublisher());

    }

    @Override
    public ArrayList<Books> getAllBooks() throws Exception {
        ArrayList<Books> allBooks = new ArrayList<>();
        ArrayList<Books> all = dao.getAll();
        for (Books books : all) {
            allBooks.add(new Books(books.getBOOK_ID(), books.getBook_Name(), books.getAuthor(), books.getISBN_No(), books.getPublisher(), books.getRack(), books.getColomn(), books.getRow(), books.getDonation()));

        }
        return allBooks;
    }

}
