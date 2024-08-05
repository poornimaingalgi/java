package com.xworkz.hospital;
import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.dao.HospitalDao;
import javafx.scene.chart.PieChart;

public class HospitalRunner {



        public static void main(String[] args){
            HospitalDto hospitalDto = new HospitalDto();
            HospitalDao hospitalDao = new HospitalDao();

            HospitalDto hospitalDto1 = new HospitalDto();
            HospitalDto hospitalDto2 = new HospitalDto();
            HospitalDto hospitalDto3 = new HospitalDto();


            HospitalDto HospitalDto1 = new HospitalDto();
            HospitalDto1.setName("Aysha");
            HospitalDto1.setId(2002);
            HospitalDto1.setAge(29);
            HospitalDto1.setDisease("Stomach ache");
            HospitalDto1.setContactNum(7894561230l);
            HospitalDto1.setGender("female");

            HospitalDto HospitalDto2 = new HospitalDto();
            HospitalDto2.setName("Ammer");
            HospitalDto2.setId(3010);
            HospitalDto2.setAge(19);
            HospitalDto2.setDisease("Dengue");
            HospitalDto2.setContactNum(8899774455l);
            HospitalDto2.setGender("male");

            HospitalDto HospitalDto3 = new HospitalDto();
            HospitalDto3.setName("Karuna");
            HospitalDto3.setId(4050);
            HospitalDto3.setAge(50);
            HospitalDto3.setDisease("tyroid");
            HospitalDto3.setContactNum(7788441122l);
            HospitalDto3.setGender("female");


            hospitalDao.getPatientDetails(HospitalDto1);
            hospitalDao.getPatientDetails(HospitalDto2);
            hospitalDao.getPatientDetails(HospitalDto3);



        }
    }

