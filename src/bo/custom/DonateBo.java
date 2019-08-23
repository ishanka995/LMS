/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import Model.Donator;
import Model.Issue;
import bo.Superbo;

/**
 *
 * @author Max point galgamuwa
 */
public interface DonateBo extends Superbo{
    public boolean addDonate(Donator donator)throws Exception;
    
}
