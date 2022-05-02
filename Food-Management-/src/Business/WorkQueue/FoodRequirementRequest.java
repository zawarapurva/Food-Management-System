/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author apurvazawar
 */
public class FoodRequirementRequest extends WorkRequest {
    private String requestResult;
    private ArrayList<Products> productList;

    public ArrayList<Products> getSuppProductList() {
        return suppProductList;
    }

    public void setSuppProductList(ArrayList<Products> suppProductList) {
        this.suppProductList = suppProductList;
    }
    private ArrayList<Products> suppProductList;
    
    public FoodRequirementRequest(){
        super();
        this.productList= new ArrayList<>();
        this.suppProductList=new ArrayList<>();
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }

    public ArrayList<Products> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Products> productList) {
        this.productList = productList;
    }
    
    
    
    
}


