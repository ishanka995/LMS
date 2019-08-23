/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import Model.Member;
import dao.CrudUtill;
import dao.custom.MemberDao;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Max point galgamuwa
 */
public class MemberDaoImpl implements MemberDao {

    @Override
    public boolean add(Member t) throws Exception {
//        return  CrudUtill.executeUpdate("update bookmanage set Book_Name=?,Author=?,ISBN_No=?,Publisher=?,Rack=?,colomn=?,row=?,Donation=? where BOOK_ID =?", t.getBook_Name(), t.getAuthor(), t.getISBN_No(), t.getPublisher(), t.getRack(), t.getColomn(), t.getRow(), t.getDonation(),t.getBOOK_ID());
        return CrudUtill.executeUpdate("insert into membermanage values (?,?,?,?,?,?,?)", t.getMemberID(), t.getMemberName(), t.getBirthdate(), t.getAge(), t.getEmail(), t.getTelephone(), t.getMembership());

    }

    @Override
    public boolean update(Member t) throws Exception {
        return CrudUtill.executeUpdate("update membermanage set MemberName=?,Birthdate=?,Age=?,Email=?,Telephone =?,membership=? where MemberID = ?", t.getMemberName(), t.getBirthdate(), t.getAge(), t.getEmail(), t.getTelephone(), t.getMembership(), t.getMemberID());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtill.executeUpdate("delete from membermanage where MemberID =?", id);
    }

    @Override
    public Member search(String id) throws Exception {
        ResultSet rst = CrudUtill.executeQuery("select MemberName,Birthdate,Email,Telephone from membermanage where MemberID=?", id);
        Member member = null;

        while (rst.next()) {
            member = new Member(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5));
        }
        return member;

    }

    @Override
    public ArrayList<Member> getAll() throws Exception {
        ResultSet rst = CrudUtill.executeQuery("select * from membermanage");
        ArrayList<Member> allMembers = new ArrayList<>();
        while (rst.next()) {
            Member member = new Member(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getInt(6), rst.getString(7));
            allMembers.add(member);
        }
        return allMembers;
    }

}
