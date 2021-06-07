/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author ddok
 */
public class Student {

    private int id;
    private String firtName;
    private String lastName;
    private String gender;
    private Date birthDate;
    private String discipline;
    private String address;
    private BigInteger phoneNumber;
    private byte[] studentPhoto;

    public Student() {
    }

    public Student(int id, String firtName, String lastName, String gender, Date birthDate, String discipline, String address, BigInteger phoneNumber, byte[] studentPhoto) {
        this.id = id;
        this.firtName = firtName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.discipline = discipline;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.studentPhoto = studentPhoto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigInteger getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(BigInteger phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public byte[] getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(byte[] studentPhoto) {
        this.studentPhoto = studentPhoto;
    }

}
