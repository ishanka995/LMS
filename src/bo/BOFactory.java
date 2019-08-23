/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bo.custom.Impl.BookBoImpl;
import bo.custom.Impl.DonateBoImpl;
import bo.custom.Impl.IssueBoImpl;
import bo.custom.Impl.MemberBoImpl;
import bo.custom.Impl.ReturnBoImpl;

/**
 *
 * @author Max point galgamuwa
 */
public class BOFactory {

    public static BOFactory bofactory;

    public BOFactory() {
    }

    public static BOFactory getInstance() {

        if (bofactory == null) {
            bofactory = new BOFactory();
        }
        return bofactory;

    }

    public enum BOTypes {
        Book, Member, Issue, Return, Donate
    }

    public Superbo getBO(BOTypes types) {
        switch (types) {
            case Book:
                return new BookBoImpl();
            case Member:
                return new MemberBoImpl();
            case Issue:
                return new IssueBoImpl();
            case Return:
                return new ReturnBoImpl();
            case Donate :
                return new DonateBoImpl();
            default:
                return null;
        }
    }
}
