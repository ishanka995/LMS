/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Issue;
import Model.Member;
import bo.BOFactory;
import bo.custom.MemberBo;
import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Max point galgamuwa
 */
public class MemberM_Controller {

    static MemberBo bo = (MemberBo) BOFactory.getInstance().getBO(BOFactory.BOTypes.Member);

    public static boolean addMember(Member member) throws Exception {
        return bo.addMember(member);

    }

    public static boolean update(Member member) throws Exception {

        return bo.updateMember(member);

    }

    public static Member searchMember(String id) throws ClassNotFoundException, SQLException, Exception {
        return bo.searchMember(id);

    }

    public static boolean deleteMember(String id) throws ClassNotFoundException, SQLException, Exception {

        return bo.deleteMember(id);
    }

    public static ArrayList<Member> getAllCustomers() throws Exception {
        return bo.getAllMembers();

    }

    public static Member searchM(String code) throws ClassNotFoundException, SQLException {
        //static MemberBo bo = (MemberBo) BOFactory.getInstance().getBO(BOFactory.BOTypes.Member);
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select MemberID,MemberName,Birthdate,Email,Telephone from membermanage where MemberID=?";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ptsm.setObject(1, code);
        ResultSet rst = ptsm.executeQuery();
        Member member = null;
        while (rst.next()) {
            member = new Member();
            member.setMemberID(rst.getString(1));
            member.setMemberName(rst.getString(2));
            member.setBirthdate(rst.getString(3));
            member.setEmail(rst.getString(4));
            member.setTelephone(rst.getInt(5));

        }
        return member;
    }
    public static Issue SIssueBook(String code) throws ClassNotFoundException, SQLException {
        //static MemberBo bo = (MemberBo) BOFactory.getInstance().getBO(BOFactory.BOTypes.Member);
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from issuebook where MemberID = ?";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ptsm.setObject(1, code);
        ResultSet rst = ptsm.executeQuery();
        Issue issue = null;
        while (rst.next()) {
            issue = new Issue(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9),rst.getString(10),rst.getString(11),rst.getString(12),rst.getString(13));
            
            
        }
        return issue;
        }
}
