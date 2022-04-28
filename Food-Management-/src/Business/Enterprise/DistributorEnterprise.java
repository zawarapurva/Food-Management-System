/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise;
import Business.Role.Role;
import Business.WorkQueue.InventoryDirectory;
import java.util.ArrayList;

/**
 *
 * @author Pooja
 */
public class DistributorEnterprise extends Enterprise {
    
    public DistributorEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Distributor);
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
