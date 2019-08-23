/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Donator;
import bo.BOFactory;
import bo.custom.DonateBo;
import static dao.DaoFactory.DAOTypes.Donate;
import db.DBConnection;
import java.sql.Connection;

/**
 *
 * @author Max point galgamuwa
 */
public class Donator_controller {

    static DonateBo bo = (DonateBo) BOFactory.getInstance().getBO(BOFactory.BOTypes.Donate);

    public static boolean addDonate(Donator donate) throws Exception {
        return bo.addDonate(donate);

    }
}
