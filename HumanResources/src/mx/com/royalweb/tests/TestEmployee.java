package mx.com.royalweb.tests;
import java.util.Date;
import java.lang.*;
import mx.com.royalweb.models.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christianjimenezcjs
 */

public class TestEmployee {
    public static void main(String args[]){
        Location lMexico = new Location("Av. Univesidad, #333 Col. las Viboras","Colima","Colima","Mexico");
        lMexico.setId(6);      
       
        Department dIT = new Department("Tecnologías de la Información",lMexico);
        Department dDireccion = new Department("Dirección",lMexico);
        Department dMercadotecnia = new Department("Mercadotecnia",lMexico);
        
        Job jProgrammer = new Job("jProgrammer",15000,30000);
        Job jDirector = new Job("jDirector",30000,50000);
        
        Employee e1 = new Employee("Christian","Jimenez",new Date(), jProgrammer);
        e1.setDepartment(dIT);
        e1.setEmail("cjimenez@ucol.mx");
        e1.setPhoneNumber("(314)11-0-26-45");
        e1.setSalary(18000);
        e1.setAge(24);
        //e1.getDetails();
        
        Employee e2 = new Employee("Josue","Sanchez",new Date(), jProgrammer);
        e2.setDepartment(dIT);
        e2.setEmail("jsanchez@ucol.mx");
        e2.setPhoneNumber("(314)11-0-26-45");
        e2.setSalary(25000);
        e2.setAge(24);
        //e2.getDetails();
        
        Employee e3 = new Employee("Alfonso","Rangel",new Date(), jDirector);
        e3.setDepartment(dDireccion);
        e3.setEmail("jsanchez@ucol.mx");
        e3.setPhoneNumber("(314)11-0-26-45");
        e3.setSalary(25000);
        e3.setAge(24);
        e3.getDetails();
        
        Director d1 = new Director("Christian", "Jimenez", new Date(), jDirector);
        d1.setAge(23);
        d1.setDepartment(dDireccion);
        d1.setEmail("cjimenez@ucol.mx");
        d1.setPhoneNumber("(314)-11-0-26-45");
        d1.setSalary(100000);
        d1.setSecretary(e3);
        System.out.println("Detalles: "+d1.getDetails());
        
        
        /*System.out.println("*** REPORTE DEL DEPARTAMENTO DE 'TI' ***");
        for (Employee e : dIT.getEmployeeList()) {
            System.out.println("Full Name: "+e.getFirstName() + " " + e.getLastName());
            System.out.println("Job: "+e.getJob().getTitle());
            System.out.println("Salary: "+e.getSalary());
            System.out.println("Department: "+e.getDepartment().getName());
            System.out.println();
        }
        
        System.out.println("*** REPORTE DEL DEPARTAMENTO DE 'Mercadotecnia' ***");
        for (Employee e : dMercadotecnia.getEmployeeList()) {
            System.out.println("Full Name: "+e.getFirstName() + " " + e.getLastName());
            System.out.println("Job: "+e.getJob().getTitle());
            System.out.println("Salary: "+e.getSalary());
            System.out.println("Department: "+e.getDepartment().getName());
            System.out.println();
        }*/
    }
}
