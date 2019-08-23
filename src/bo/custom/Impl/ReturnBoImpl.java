/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.Impl;

import Model.Return;
import bo.custom.ReturnBo;
import dao.DaoFactory;
import dao.custom.ReturnDao;

/**
 *
 * @author Max point galgamuwa
 */
public class ReturnBoImpl implements ReturnBo{
    static ReturnDao dao = DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.Return);

    @Override
    public boolean ReturnBook(Return returns) throws Exception {
      return  dao.add(new Return(returns.getBOOK_ID(),returns.getBook_Name(),returns.getAuthor(),returns.getISBN_No(),returns.getPublisher(),returns.getMemberID(),returns.getMemberName(),returns.getBirthdate(),returns.getEmail(),returns.getTelephone(),returns.getIssueID(),returns.getIssueDate(),returns.getDatetoreturn(),returns.getReturnDate(),returns.getReturnID()));
       
    }

   
    }
    

