/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DTO.BookDTO;
import DTO.Member;
import Model.Books;
import bo.BOFactory;
import bo.custom.MemberBo;
import java.awt.print.Book;

/**
 *
 * @author Max point galgamuwa
 */
public class Member_controller {

    public static boolean addmember(Member m) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();

        String sql = "insert into member_manage values(?,?,?,?,?)";

        PreparedStatement ptsm = connection.prepareStatement(sql);
        ptsm.setObject(1, m.getMember_ID());
        ptsm.setObject(2, m.getMember_Name());
        ptsm.setObject(3, m.getBirthDate());
        ptsm.setObject(4, m.getEmail());
        ptsm.setObject(5, m.getTelePhone_No());

        return ptsm.executeUpdate() > 0;

    }

    public static boolean updateMember(Member m) throws ClassNotFoundException, SQLException {
//    Connection connection = DBConnection.getInstance().getConnection();
//        String sql = "update Item set description=?,qtyOnHand=?,unitPrice=? where code=?";
//        PreparedStatement pstm = connection.prepareStatement(sql);
//        pstm.setObject(1, item.getDescription());
//        pstm.setObject(2, item.getQtyOnHand());
//        pstm.setObject(3, item.getUnitPrice());
//        pstm.setObject(4, item.getCode());
//        return pstm.executeUpdate() > 0;
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "update member_manage set Member_Name =?,BirthDate=?,Email =?,Telephone_No=? where Member_ID =?";
        PreparedStatement ptsm = connection.prepareStatement(sql);

        ptsm.setObject(5, m.getMember_ID());

        ptsm.setObject(1, m.getMember_Name());
        ptsm.setObject(2, m.getBirthDate());
        ptsm.setObject(3, m.getEmail());
        ptsm.setObject(4, m.getTelePhone_No());

        return ptsm.executeUpdate() > 0;

    }

    public static ArrayList<Member> LoadAllMember() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from member_manage";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ResultSet rst = ptsm.executeQuery();
        ArrayList<Member> allMembers = new ArrayList<>();
        while (rst.next()) {
            Member temp = new Member(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
            allMembers.add(temp);

        }
        return allMembers;

    }

    public static boolean deleteMember(String id) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Delete from member_manage where Member_ID = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, id);
        return pstm.executeUpdate() > 0;
    }

//    public static Item searchItem(String code) throws ClassNotFoundException, SQLException {
//        Connection connection = DBConnection.getInstance().getConnection();
//        String sql = "select * from Item where code=?";
//        PreparedStatement pstm = connection.prepareStatement(sql);
//        pstm.setObject(1, code);
//        ResultSet rst = pstm.executeQuery();
//        Item item = null;
//        while (rst.next()) {
//            item = new Item();
//            item.setCode(rst.getString(1));
//            item.setDescription(rst.getString(2));
//            item.setQtyOnHand(rst.getInt(3));
//            item.setUnitPrice(rst.getDouble(4));
//        }
//        return item;
    public static Member searchItem(String code) throws SQLException, ClassNotFoundException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from member_manage where Member_ID = ?";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ptsm.setObject(1, code);

        ResultSet rst = ptsm.executeQuery();
        Member member = null;
        while (rst.next()) {
            member = new Member();
            member.setMember_ID(rst.getString(1));
            member.setMember_Name(rst.getString(2));
            member.setBirthDate(rst.getString(3));
            member.setEmail(rst.getString(4));
            member.setTelePhone_No(rst.getString(5));

        }
        return member;

    }

    public static boolean submit(BookDTO b) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "insert into book_manages values (?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ptsm = connection.prepareStatement(sql);
        ptsm.setObject(1, b.getBOOK_ID());
        ptsm.setObject(2, b.getBook_Name());
        ptsm.setObject(3, b.getAuthor());
        ptsm.setObject(4, b.getISBN_No());
        ptsm.setObject(5, b.getPublisher());
        ptsm.setObject(6, b.getRack());
        ptsm.setObject(7, b.getColomn());
        ptsm.setObject(8, b.getRow());
        ptsm.setObject(9, b.getDonation());
        ptsm.setObject(10, b.getDonatorName());
        ptsm.setObject(11, b.getDonatorEmail());
        ptsm.setObject(12, b.getDonatorMobile());

        return ptsm.executeUpdate() > 0;

    }

    
    }
