/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DistributorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Team Void
 */
public class DistributorOrganization extends Organization{
 
     public DistributorOrganization() {
        super(Organization.Type.DistributorFoodOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DistributorRole());
        return roles;
    }
}
