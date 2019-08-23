/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Return;
import bo.BOFactory;
import static bo.BOFactory.BOTypes.Return;
import bo.custom.ReturnBo;

/**
 *
 * @author Max point galgamuwa
 */
public class ReturnM_controller {

    static ReturnBo bo = (ReturnBo) BOFactory.getInstance().getBO(BOFactory.BOTypes.Return);

    public static boolean addIssue(Return returns) throws Exception {
        return bo.ReturnBook(returns);
    }

}
