package com.mycompany.practical1;
public class Practical1 
{
    
        /*output
        Excellent
    
    
        Repeat the same romoving "break" commond at the line number 6 write down the output
        Output
        Excellent
        Your passed
        
        */
   public static void main(String[] args) {
    String grade = "A";
    if (grade.equals("A")) {
        System.out.println("Excellent");
    } else if (grade.equals("D")) {
        System.out.println("You Passed");
    } else if (grade.equals("F")) {
        System.out.println("Better try again");
    } else {
        System.out.println("Invalid grade");
        System.out.println("Your grade is " + grade);
    }
   }
}


