package com.shubham;

class Students{
    String name;
    int rollNo;
  
    // static variable
    static String collegeName;
  
    public Students(String name,int rollNo)
    {
        this.name = name;
        this.rollNo=rollNo;
        
    }
  
    // static method
    static void setCollege(String name) 
    { 
    	collegeName = name; 
    }
  
    // instance method
    void getStudentInfo()
    {
        System.out.println("name : " + this.name);
        System.out.println("rollNo : " + this.rollNo);
  
        // accessing static variable
        System.out.println("cllgName : " + collegeName);
    }
}
//Driver class
public class NonStaticDemo {
 public static void main(String[] args)
 {
     // calling static method
     // without instantiating Student class
     Students.setCollege("NIT");

     Students s1 = new Students("Sai",101);
     Students s2 = new Students("Jaggu",102);

     s1.getStudentInfo();
     s2.getStudentInfo();
 }
}