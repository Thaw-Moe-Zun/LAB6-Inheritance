import classes.Department;
import classes.Student;
import classes.Teacher;

public class SchoolSystem {
  public static void main (String[]args){

  

  Department Electrical = new Department("101","Electrical Engineering");
  Department Mechanical = new Department("102","Mechanical Engineering");
  Department Industrial = new Department("103","Industrial Engineering");
  Department Software = new Department("104","Software Engineering");

  Student aronb = new Student(Electrical,3.28,"aronb", "a1a2a3", "Aron Brown", "0123456789", 2005, 07, 12);

  Student jj = new Student(Software,3.35,"jj", "7584", "Jane Smith", "0987654321", 2004, 11, 24);

  Teacher bob = new Teacher(Mechanical, 32000, "bob", "b555", "Bob Miley", "0642341122", 1995, 06, 22);

  Teacher mili = new Teacher(Industrial, 45000, "mili", "7455", "Milie Jackson", "0842345610", 1988, 03, 17);



  bob.info();

  jj.info();

  }


}
