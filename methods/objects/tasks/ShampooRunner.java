package com.xworkz.shampoo;

import com.xworkz.shampoo.dao.ShampooDao;
import com.xworkz.shampoo.dto.ShampooDto;

public class ShampooRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        ShampooDto dto =new ShampooDto();
        dto.brandName="Sunsilk";
        dto.quantity=200;
        dto.type="Smoothning";
        dto.price=400.00;
        dto.mfgDate="12/2024";
        dto.expDate="12/2025";

        ShampooDao shampooDao = new ShampooDao();

        shampooDao.createShampooBrand(dto);
        shampooDao.getInfo();
        System.out.println("main ended");
    }
}
