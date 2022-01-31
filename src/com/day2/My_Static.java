package com.day2;
//1 Nested Class
//2 Method
//3 Variable
//4 Block
class Student {
 
    // nested static class
    static class Address {

        //variable
        int houseNo;
        String streetName;
 
        //method
        public void print() {
            System.out.println("Nested class");

        }

 
    }
 
    // static block
    // it is special block in the java which will run as first statement of program
    // no need to call this block it will call automatically by the compiler
    static {
        System.out.println("Static");
    }
 
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + " School name " + schoolName + "]";
    }
 
    public Student(int rollno, String name) {
        super();
        this.rollno = rollno;
        this.name = name;
    }
 
    private int rollno;
    private String name;
    // static variable
    static String schoolName;
 
    // static method
    public static void staticMethod() {
        System.out.println("School Name" + schoolName);
    }
 
}
 
public class My_Static
{
 
    public static void main(String args[]) {
 
        Student.schoolName = "Abc school";
 
        Student s1 = new Student(1, "MK");
        Student s3 = new Student(2, "KI");
        Student s2 = new Student(3, "MI");
 
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
 
        Student.staticMethod();
 
        Student.Address address = new Student.Address();
        address.print();
 
    }
 
}