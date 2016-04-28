/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.royalweb.models;

import java.util.Date;

/**
 *
 * @author christianjimenezcjs
 */
public class Director extends Employee{
    private Employee secretary;

    public Employee getSecretary() {
        return secretary;
    }

    public void setSecretary(Employee secretary) {
        this.secretary = secretary;
    }

    public Director(String firstName, String lastName, Date hireDate, Job job) {
        super(firstName, lastName, hireDate, job);
    }

    public String getDetails() {
        return super.getDetails()+"\nJob: " + this.getJob().getTitle()
                +"\nSecretary: " + this.getSecretary().getFirstName()+" "+this.getSecretary().getLastName();
       
    }
   
    
}
