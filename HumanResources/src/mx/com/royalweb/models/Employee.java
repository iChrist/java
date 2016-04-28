package mx.com.royalweb.models;

import java.util.Date;

public class Employee {

    // atributos, fields, variables de instancia.
    private static int count;
    private final int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private double salary;
    private Date hireDate;
    private int age;
    private Department department;
    private Job job;

    static{
        count = 0;
    }

    public Employee() {
        this.id = ++count;
    }
    
    
    
    public Employee(String firstName, String lastName, Date hireDate, Job job){
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.job = job;
    }
    
    public String getDetails() {
         System.out.println(this);
         if(this instanceof Director){
           System.out.println(this);
       }else{
             System.out.println(this);
         }
        return "\nid: " + this.getId()
                +"\nfirstName: " + this.getFirstName()
                +"\nlastName: " + this.getLastName()
                +"\nemail: " + this.getEmail()
                +"\nphoneNumber: " + this.getPhoneNumber()
                +"\nsalary: " + this.getSalary()
                +"\nhireDate: " + this.getHireDate()
                +"\nage: " + this.getAge()
                +"\nDepartment: " + this.department.getName()
                +"\nJob: " + this.job.getTitle();
       
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@ucol.mx")) {
            System.out.println("NOT EMAIL FOUND.");
        } else {
            this.email = email;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        switch (this.job.getTitle()) {
            case "programmer":
                if (salary > this.job.getMaxSalary()) {
                    this.salary = this.job.getMaxSalary();
                } else if (salary < this.job.getMinSalary()) {
                    this.salary = this.job.getMinSalary();
                }
                break;
            default:
                this.salary = salary;
                break;
        }
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 65) {
            System.out.println("Edad no valida.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
        Employee[] temp = new Employee[this.department.getEmployeeList().length + 1];
        System.arraycopy(
            this.department.getEmployeeList() 
            ,0 
            ,temp 
            ,0
            ,this.department.getEmployeeList().length
        );
        temp[temp.length-1]=this;
        this.department.setEmployeeList(temp);

    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
