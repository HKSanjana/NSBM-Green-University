package com.mycompany.practical03;
public class Practical03 
{

    public static void main(String[] args)
    {
        Employee obj=new Employee();
        obj.setempName("Sanjana kavindi");
        obj.setBouns(25);
        obj.setBasicSalary( 80000);
        String empaName=obj.getempName();
        int Bouns=obj.getBouns();
        int BasicSalary=obj.getBasicSalary();
        int BonusAmount = (10000);
        System.out.println("Employee name"+obj.getempName());
        System.out.println("Employee Bonus"+obj.getBonus());
        System.out.println("Employee Basic Salary"+obj.getBasicSalary());
        System.out.println("Bonus Amount"+BonusAmount);
    }
}
