/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
//import Business.Organization.DistributorOrganization;
import Business.Organization.TransportOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.TransportWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author Sumedha
 */
public class TransportRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new TransportWorkAreaJPanel(userProcessContainer, account, (TransportOrganization)organization, enterprise, business);
    }
    
}
