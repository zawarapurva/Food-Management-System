/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;
/**
 *
 * @author kasar
 */
public class InventoryDirectory {
    
    public static ArrayList<Inventory> inventoryList  = new ArrayList<>();
    private InventoryDirectory newInventoryList;
    
    
   static InventoryDirectory iDir=null;
     
    private InventoryDirectory() {
        
     	Inventory inv1  = new Inventory("101", "Bread","Bakery Products","Available",10);
        Inventory inv2  = new Inventory("102", "Muffin","Bakery Products","Available",100);
        Inventory inv3  = new Inventory("103", "Cakes","Bakery Products","Available",100);
        Inventory inv4  = new Inventory("104", "Milk","Dairy Products","Available",10);
        Inventory inv5  = new Inventory("105", "Eggs","Dairy Products","Available",100);
        Inventory inv6  = new Inventory("106", "Butter","Dairy Products","Available",100);
        Inventory inv7  = new Inventory("107", "Chicken","Meat Products","Available",100);
        Inventory inv8  = new Inventory("108", "Turkey","Meat Products","Available",10);
        Inventory inv9  = new Inventory("109", "Ham","Meat Products","Available",100);
        Inventory inv10 = new Inventory("110", "Wheat","Cereals","Available",100);
        Inventory inv11 = new Inventory("111", "Rice","Cereals","Available",100);
        Inventory inv12 = new Inventory("112", "Oats","Cereals","Available",100);
        Inventory inv13 = new Inventory("113", "Tomatoes","Vegetables","Available",100);
        Inventory inv14 = new Inventory("114", "Potatoes","Vegetables","Available",100);
        Inventory inv15 = new Inventory("115", "Capsicum","Vegetables","Available",100);
        Inventory inv16 = new Inventory("116", "Banana","Fruits","Available",100);
        Inventory inv17 = new Inventory("117", "Orange","Fruits","Available",100);
        Inventory inv18 = new Inventory("118", "Apple","Fruits","Available",100);
        
        inventoryList.add(inv1);
        inventoryList.add(inv2);
        inventoryList.add(inv3);
        inventoryList.add(inv4);
        inventoryList.add(inv5);
        inventoryList.add(inv6);
        inventoryList.add(inv7);
        inventoryList.add(inv8);
        inventoryList.add(inv9);
        inventoryList.add(inv10);
        inventoryList.add(inv11);
        inventoryList.add(inv12);
        inventoryList.add(inv13);
        inventoryList.add(inv14);
        inventoryList.add(inv15);
        inventoryList.add(inv16);
        inventoryList.add(inv17);
        inventoryList.add(inv18);

    }

    public static ArrayList<Inventory> getInventoryList() {
        
        if(iDir==null)
        {
            iDir=new InventoryDirectory();
           // inventoryList=new ArrayList<>();
        }
        return inventoryList;
    }

    public static void setInventoryList(ArrayList<Inventory> inventoryList) {
        InventoryDirectory.inventoryList = inventoryList;
    }
    
    public  ArrayList<Inventory> getArrayUniqueList() {
        return inventoryList;
    }

}

    

