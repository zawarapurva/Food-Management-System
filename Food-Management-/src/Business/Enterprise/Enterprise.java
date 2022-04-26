/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Pankaj Gorav
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        NGO("NGO"),
        Shelter("Shelter"),
        Distributor("Distributor"),
        QualityCheck("Quality Check"),
        Supplier("Supplier");
       
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;

    }
    }
    
    public enum EnumType1{
        NGO("NGO"),NgoFoodOrganization("Ngo Food Organization");
        private String value;
        private EnumType1(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum EnumType2{
       Shelter("Shelter"),ShelterFoodOrganization("Shelter Food Organization");
        private String value;
        private EnumType2(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum EnumType3{
       Distributor("Distributor"),DistributorFoodOrganization("Distributor Food Organization");
        private String value;
        private EnumType3(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum EnumType4{
       QualityCheck("Quality Check"),QualityCheckFoodOrganization("QualityCheck Food Organization");
        private String value;
        private EnumType4(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum EnumType5{
       Supplier("Supplier"),SupplierFoodOrganization("Supplier Food Organization");
        private String value;
        private EnumType5(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }


    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
    
}
