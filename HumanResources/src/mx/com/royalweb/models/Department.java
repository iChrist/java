/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.royalweb.models;

/**
 *
 * @author christianjimenezcjs
 */
public class Department {
    private int id;
    private String name;
    private Employee manager;
    private Location location;
    private Employee [] employeeList = new Employee[0];
    
    public Department(String name, Location location) {
        this.name = name;
        this.location = location;
    }
    
    public void getDetails(){
        System.out.println("name: "+this.name);
        System.out.println("manager: "+this.manager);
        System.out.println("location: "+this.location);
    }

    public void setEmployeeList(Employee[] employeeList) {
        this.employeeList = employeeList;
    }

    public Employee[] getEmployeeList() {
        return employeeList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

   
}