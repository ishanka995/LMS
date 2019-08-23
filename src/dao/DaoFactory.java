/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.custom.impl.BookDaoImpl;
import dao.custom.impl.DonateDaoImpl;
import dao.custom.impl.IssueDaoImpl;
import dao.custom.impl.MemberDaoImpl;
import dao.custom.impl.ReturnDaoImpl;
import java.sql.Types;

/**
 *
 * @author Max point galgamuwa
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    public DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public enum DAOTypes {
        Book, Member, Issue, Return, Donate

    }

    public <T extends SuperDDAO> T getDAO(DAOTypes types) {
        switch (types) {
            case Book:
                return (T) new BookDaoImpl();
            case Member:
                return (T) new MemberDaoImpl();
            case Issue:
                return (T) new IssueDaoImpl();
            case Return:
                return (T) new ReturnDaoImpl();
            case Donate:
                return (T) new DonateDaoImpl();
            default:
                return null;
        }

    }

}
