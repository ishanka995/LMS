/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.Impl;

import Model.Donator;
import bo.custom.DonateBo;
import dao.DaoFactory;
import dao.custom.DonateDao;

/**
 *
 * @author Max point galgamuwa
 */
public class DonateBoImpl implements DonateBo{
    
       static DonateDao dao = DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.Donate);

    @Override
    public boolean addDonate(Donator donator) throws Exception {
        return dao.add(new Donator(donator.getDonationID(),donator.getDonatorName(),donator.getTelephone(),donator.getEmail(),donator.getBookName(),donator.getISBNNO(),donator.getPublisher(),donator.getBookPrice()));
       
    }
    
}
