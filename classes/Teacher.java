package classes;

import java.time.LocalDate;

public class Teacher extends User{

  public Department department;
  public double salary;

  

  public Teacher(Department department, double salary, String userName, String password, String fullName, String tel, int year, int month , int date) {

    super(userName,password,fullName,tel,year,month,date);
    this.department = department;
    this.salary = salary;
  }


  @Override
  public void info(){
    System.out.println("=============== INFO ===============");
    System.out.println("Full Name : "+userName());
    System.out.println("Department Name : "+department.departmentName);
    System.out.println("Tel : "+tel());
    System.out.println("Age : "+calAge());
    System.out.println("Salary : "+ salary);
  }

}
