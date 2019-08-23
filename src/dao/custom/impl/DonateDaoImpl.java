/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import Model.Donator;
import dao.CrudUtill;
import dao.custom.DonateDao;
import java.util.ArrayList;

/**
 *
 * @author Max point galgamuwa
 */
public class DonateDaoImpl implements DonateDao {

    @Override
    public boolean add(Donator t) throws Exception {
        return CrudUtill.executeUpdate("insert into donation values (?,?,?,?,?,?,?,?)", t.getDonationID(), t.getDonatorName(), t.getTelephone(), t.getEmail(), t.getBookName(), t.getISBNNO(), t.getPublisher(), t.getBookPrice());
    }

    @Override
    public boolean update(Donator t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Donator search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Donator> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
