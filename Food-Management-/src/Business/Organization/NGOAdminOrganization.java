/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.NGORole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Team Void
 */
public class NGOAdminOrganization extends Organization{
    
     public NGOAdminOrganization() {
        super(Organization.Type.NgoFoodOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGORole());
        return roles;
    }
    
}
