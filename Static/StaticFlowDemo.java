package com.shubham;
// StaticFlowDemo class (Main class)
 
class StaticFlowDemo{
    // initializing static string company
    static String company= "Drucare";//	1//7
 
    // static main method
    public static void main(String[] args)//2
    {
        // calling static method print()
        print();//14
        System.out.println("Main method has finished its execution");//16
    }
 
    // first static block
    static//3
    {
        // displaying value of company
        System.out.println(company);//8
 
        // calling static method print()
        print();//9
        System.out.println("Inside First Static Block");//11
    }
 
    // static method print()
    public static void print()//4
    {
        // displaying value of address
        System.out.println(address);//10//15
    }
 
    // second static block
    static//5
    {
        System.out.println("Inside Second Static Block");//12
    }
 
    // initializing static String address
    static String address= "Gachibowli";//6//13
}
//1. identification of static members 
//from top to bottom[1-6]
//2. Execution of static variable assignments 
//and static blocks from top to bottom[7-13]
//3. main method execution [14-16]