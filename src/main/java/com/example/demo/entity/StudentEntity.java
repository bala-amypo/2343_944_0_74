package com.example.demo.entity;

import java.time.LocalDate;

public class StudentEntity{
    private String name;
    privvate int id;
    private LocalDate date;
    private float cgpa;

    public StudentEntity(){
        public StudentEntity(String name, int id, LocalDate date, float cgpa){
            this.name = name;
            this.id = id;
            this.date = date;
            this.cgpa = cgpa;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getID(){
            return id;
        }
        public void setID(int ID){
            this.id=id;
        }
        public LocalDate getDate(){
            return date;
        }
        public void setDate(LocalDate date){
            this.date = date;
        }
    }
}