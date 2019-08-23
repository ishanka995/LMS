/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import Model.Issue;
import dao.CrudUtill;
import dao.custom.BookDao;
import dao.custom.IssueDao;
import java.util.ArrayList;

/**
 *
 * @author Max point galgamuwa
 */
public class IssueDaoImpl implements IssueDao {

    @Override
    public boolean add(Issue t) throws Exception {
       // return CrudUtill.executeUpdate("insert into bookmanage values(?,?,?,?,?,?,?,?,?)", t.getBOOK_ID(), t.getBook_Name(), t.getAuthor(), t.getISBN_No(), t.getPublisher(), t.getRack(), t.getColomn(), t.getRow(), t.getDonation());
      return  CrudUtill.executeUpdate("insert into issuebook values (?,?,?,?,?,?,?,?,?,?,?,?,?)",t.getIssueID(), t.getMemberID(), t.getMemberName(), t.getBirthdate(), t.getEmail(), t.getTelephone(), t.getBookID(), t.getBookName(), t.getAuthor(), t.getISBNNo(), t.getPublisher(), t.getIssueDate(), t.getReturnDate());
    }

    @Override
    public boolean update(Issue t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
       //eturn CrudUtil.executeUpdate("delete from Customer where CustomerID=?", id);
       return CrudUtill.executeUpdate("delete from issuebook where BookID = ?", id);
    }

    @Override
    public Issue search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Issue> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
