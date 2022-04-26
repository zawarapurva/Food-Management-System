/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.Organization;
import Business.Organization.QualityOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.NGOWorkAreaJPanel;
import UserInterface.QualityCheckWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author kasar
 */
public class NGORole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new NGOWorkAreaJPanel(userProcessContainer, account, (NGOAdminOrganization)organization,enterprise, business);
    }
    
}