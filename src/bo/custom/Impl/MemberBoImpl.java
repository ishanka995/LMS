package bo.custom.Impl;

import Model.Member;
import bo.custom.MemberBo;
import dao.DaoFactory;
import dao.custom.MemberDao;
import java.util.ArrayList;

public class MemberBoImpl implements MemberBo {

    MemberDao dao = DaoFactory.getInstance().getDAO(DaoFactory.DAOTypes.Member);

    @Override
    public boolean addMember(Member member) throws Exception {
        return dao.add(new Member(member.getMemberID(), member.getMemberName(), member.getBirthdate(), member.getAge(), member.getEmail(), member.getTelephone(), member.getMembership()));
    }

    @Override
    public boolean deleteMember(String id) throws Exception {
        return dao.delete(id);
    }

    @Override
    public boolean updateMember(Member member) throws Exception {
        return dao.update(new Member(member.getMemberID(), member.getMemberName(), member.getBirthdate(), member.getAge(), member.getEmail(), member.getTelephone(), member.getMembership()));
    }

    @Override
    public Member searchMember(String id) throws Exception {
        Member search = dao.search(id);
        return new Member(search.getMemberID(), search.getMemberName(), search.getBirthdate(), search.getEmail(), search.getTelephone());
    }

    @Override
    public ArrayList<Member> getAllMembers() throws Exception {
//        ArrayList<Customer> allCustomers = new ArrayList<>();
//        ArrayList<Customer> all = dao.getAll();
//        for (Customer a : all) {
//            allCustomers.add(new Customer(a.getId(), a.getName(), a.getAddress(), a.getSalary()));
//        }
//        return allCustomers;
        ArrayList<Member> allMembers = new ArrayList<>();
        ArrayList<Member> all = dao.getAll();
        for (Member a : all) {
            allMembers.add(new Member(a.getMemberID(), a.getMemberName(), a.getBirthdate(), a.getAge(), a.getEmail(), a.getTelephone(), a.getMembership()));

        }
        return allMembers;
    }

}
