package org.opentutorials.javatutorials.packages.Generic;

//class StudentInfo{
//    public int grade;
//    StudentInfo(int grade){ this.grade = grade; }
//}
//class StudentPerson{
//    public StudentInfo info;
//    StudentPerson(StudentInfo info){ this.info = info; }
//}
//class EmployeeInfo{
//    public int rank;
//    EmployeeInfo(int rank){ this.rank = rank; }
//}
//class EmployeePerson{
//    public EmployeeInfo info;
//    EmployeePerson(EmployeeInfo info){ this.info = info; }
//}
//public class GenericDemo {
//    public static void main(String[] args) {
//        StudentInfo si = new StudentInfo(2);
//        StudentPerson sp = new StudentPerson(si);
//        System.out.println(sp.info.grade); // 2
//        EmployeeInfo ei = new EmployeeInfo(1);
//        EmployeePerson ep = new EmployeePerson(ei);
//        System.out.println(ep.info.rank); // 1
//    }
//}
class StudentInfo{
    public int grade;
    StudentInfo(int grade){this.grade=grade;}
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){this.rank=rank;}
}
class Person_{
    public Object info;
    Person_(Object info){this.info=info;}
}
public class GenericDemo{
    public static void main(String[] args) {
        Person_ p1 = new Person_("부장");
        EmployeeInfo ei = (EmployeeInfo) p1.info;
        System.out.println(ei.rank);
    }
}