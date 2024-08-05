package com.xworkz.hospital.dto;

public class HospitalDto {


        private String name;
        private int id;
        private int age;
        private String disease;
        private long contactNum;
        private String gender;

        public String getName(){
            return name;
        }

        public int getId(){
            return id;

        }

        public int getAge(){
            return age;
        }

        public String getDisease(){
            return disease;
        }

        public long getContactNum(){
            return contactNum;
        }

        public String getGender(){
            return  gender;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setDisease(String disease) {
            this.disease = disease;
        }

        public void setContactNum(long contactNum) {
            this.contactNum = contactNum;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }

