/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import Model.Return;
import dao.CrudUtill;
import dao.custom.ReturnDao;
import java.util.ArrayList;

/**
 *
 * @author Max point galgamuwa
 */
public class ReturnDaoImpl implements ReturnDao{

    @Override
    public boolean add(Return t) throws Exception {
       return CrudUtill.executeUpdate("insert into returnmanage values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",t.getBOOK_ID(),t.getBook_Name(),t.getAuthor(),t.getISBN_No(),t.getPublisher(),t.getMemberID(),t.getMemberName(),t.getBirthdate(),t.getEmail(),t.getTelephone(),t.getIssueID(),t.getIssueDate(),t.getDatetoreturn(),t.getReturnDate(),t.getReturnID());
    }

    @Override
    public boolean update(Return t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Return search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Return> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
