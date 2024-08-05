package com.xworkz.shampoo.dao;

import com.xworkz.shampoo.dto.ShampooDto;

public class ShampooDao {

    public ShampooDto dto;

    public boolean createShampooBrand(ShampooDto dto){
        System.out.println("ShampooBrandCreated started");
        boolean isShampooBrandcreated=false;
        if(null!=dto){
            this.dto=dto;
            isShampooBrandcreated=true;
        }else{
            System.out.println("Please provide valid details....");
        }
        System.out.println("ShampooBrandCreated ended");
        return isShampooBrandcreated;
    }

    public void getInfo(){
        System.out.println("Fetching Shampoo Details....");
        System.out.println("The Brand Name is :"+dto.brandName);
        System.out.println("The Quantity of the Shampoo is :"+dto.quantity);
        System.out.println("The Type of Shampoo is :"+dto.type);
        System.out.println("The Price of the Shampoo is :"+dto.price);
        System.out.println("The Manufacture Date is :"+dto.mfgDate);
        System.out.println("The Expire Date is :"+dto.expDate);
    }
}
