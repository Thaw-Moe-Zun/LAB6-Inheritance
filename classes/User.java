package classes;

import java.time.LocalDate;
import java.time.Period;

public class User {
  private String userName;
  private String password;
  private String fullName;
  private String tel;
  private  LocalDate dateOfBirth;
  public LocalDate todayDate;


  public User(String userName, String password, String fullName, String tel, int year, int month , int date) {
    this.userName = userName;
    this.password = password;
    this.fullName = fullName;
    this.tel = tel;
    this.dateOfBirth = LocalDate.of(year,month,date);
  }

      public String userName(){
    return this.userName;
  }
  
    public String tel(){
    return this.tel;
  }

  public double calAge(){
    LocalDate todayDate = LocalDate.now();
    Period diff = Period.between(dateOfBirth, todayDate);
    double age =  diff.getYears();
    return age;
  }

  public void info(){
    System.out.println("=============== INFO ===============");
    System.out.println("Full Name : "+this.userName);
    System.out.println("Tel : "+tel);
    System.out.println("Age : "+calAge());
  }

  
}
