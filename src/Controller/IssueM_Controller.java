/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Issue;
import bo.BOFactory;

import bo.custom.IssueBo;
import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Max point galgamuwa
 */
public class IssueM_Controller {

    static IssueBo bo = (IssueBo) BOFactory.getInstance().getBO(BOFactory.BOTypes.Issue);

    public static boolean addIssue(Issue issue) throws Exception {
        return bo.addBook(issue);

    }

    public static Issue SIssueBook(String code) throws ClassNotFoundException, SQLException {
        //static MemberBo bo = (MemberBo) BOFactory.getInstance().getBO(BOFactory.BOTypes.Member);
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from issuebook where BookID = ?";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ptsm.setObject(1, code);
        ResultSet rst = ptsm.executeQuery();
        Issue issue = null;
        while (rst.next()) {
            issue = new Issue(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12), rst.getString(13));

        }
        return issue;
    }

    public static boolean deletebook(String ID) throws Exception {
        return bo.deletebook(ID);

    }
}
