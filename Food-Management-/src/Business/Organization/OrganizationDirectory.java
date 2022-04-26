/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Team Void
 */
public class OrganizationDirectory {
    
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.NgoFoodOrganization.getValue())){
            organization = new NGOAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.ShelterFoodOrganization.getValue())){
            organization = new ShelterOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.DistributorFoodOrganization.getValue())){
            organization = new DistributorOrganization();
            organizationList.add(organization);
        }    
        else if (type.getValue().equals(Organization.Type.QualityCheckFoodOrganization.getValue())){
            organization = new QualityOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.SupplierFoodOrganization.getValue())){
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }    
        
        return organization;
    }
    
}
