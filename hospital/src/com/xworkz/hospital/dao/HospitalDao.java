package com.xworkz.hospital.dao;
import com.xworkz.hospital.dto.HospitalDto;
public class HospitalDao {
        HospitalDao hospitalDao;

        public void getPatientDetails(HospitalDto hospitalDto){

            String name = hospitalDto.getName();
            System.out.println(name);

            int id = hospitalDto.getId();
            System.out.println(id);

            int age = hospitalDto.getAge();
            System.out.println(age);

            String disease = hospitalDto.getDisease();
            System.out.println(disease);

            long contactNum = hospitalDto.getContactNum();
            System.out.println(contactNum);

            String gender = hospitalDto.getGender();
            System.out.println(gender);
            this.hospitalDao= hospitalDao;

        }
    }

