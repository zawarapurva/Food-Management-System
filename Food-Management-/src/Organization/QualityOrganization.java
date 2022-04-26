/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.QualityCheckRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Pankaj Gorav
 */
public class QualityOrganization extends Organization{
   
     public QualityOrganization() {
        super(Organization.Type.QualityCheckFoodOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new QualityCheckRole());
        return roles;
    }
    
}
