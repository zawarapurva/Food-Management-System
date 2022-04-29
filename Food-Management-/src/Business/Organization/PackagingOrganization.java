/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.PackagingRole;
import java.util.ArrayList;
/**
 *
 * @author apurvazawar
 */
public class PackagingOrganization extends Organization {
    public PackagingOrganization() {
        super(Organization.Type.PackagingFoodOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PackagingRole());
        return roles;
    }
}
