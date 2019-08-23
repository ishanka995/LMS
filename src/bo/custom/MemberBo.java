/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;


import Model.Member;
import bo.Superbo;
import java.util.ArrayList;

/**
 *
 * @author Max point galgamuwa
 */
public interface MemberBo extends Superbo {
     public boolean addMember(Member member)throws Exception;
    public boolean deleteMember(String id)throws Exception;
    public boolean updateMember( Member member)throws Exception;
    public Member searchMember(String id)throws Exception;
    public ArrayList<Member> getAllMembers()throws Exception;
    
}
