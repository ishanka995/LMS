/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.Impl;

import Model.Issue;
import bo.custom.IssueBo;
import dao.DaoFactory;
import dao.custom.IssueDao;

/**
 *
 * @author Max point galgamuwa
 */
public class IssueBoImpl implements IssueBo {

    static IssueDao dao = DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.Issue);

    @Override
    public boolean addBook(Issue issue) throws Exception {
        return dao.add(new Issue(issue.getIssueID(), issue.getMemberID(), issue.getMemberName(), issue.getBirthdate(), issue.getEmail(), issue.getTelephone(), issue.getBookID(), issue.getBookName(), issue.getAuthor(), issue.getISBNNo(), issue.getPublisher(), issue.getIssueDate(), issue.getReturnDate()));
    }

    @Override
    public boolean deletebook(String id) throws Exception {
        return dao.delete(id);
    }

}
