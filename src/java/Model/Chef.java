/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ACER
 */
public class Chef {
//    private int chefid;
    private String name;
//    private int salary;
//    private int phone;
//    private String address;
//    private String Description;
    private String role;

    public Chef() {
    }

    public Chef(String name, String role) {
//        this.chefid = chefid;
        this.name = name;
//        this.salary = salary;
//        this.phone = phone;
//        this.address = address;
//        this.Description = Description;
        this.role = role;
    }

//    public int getChefid() {
//        return chefid;
//    }
//
//    public void setChefid(int chefid) {
//        this.chefid = chefid;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public int getPhone() {
//        return phone;
//    }
//
//    public void setPhone(int phone) {
//        this.phone = phone;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getDescription() {
//        return Description;
//    }
//
//    public void setDescription(String Description) {
//        this.Description = Description;
//    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}