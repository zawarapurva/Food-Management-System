/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.ShelterRole;
import java.util.ArrayList;

/**
 *
 * @author Team Void
 */
public class ShelterOrganization extends Organization{
    
     public ShelterOrganization() {
        super(Organization.Type.ShelterFoodOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ShelterRole());
        return roles;
    }
    
}
