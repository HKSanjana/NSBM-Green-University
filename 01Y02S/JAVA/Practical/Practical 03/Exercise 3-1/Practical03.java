package com.mycompany.practical03;
public class Practical03 
{

    public static void main(String[] args)
    {
        EncapsulationDemo obj=new EncapsulationDemo();
        obj.setempName("Sanjana kavindi");
        obj.setempAge(25);
        obj.setSalary((float) 80000.45);
        System.out.println("Employee name"+obj.getempName());
        System.out.println("Employee Age"+obj.getempAge());
        System.out.println("Employee Salary"+obj.getSalary());
        String empName=obj.getempName();
        int empAge=(int) obj.getSalary();
        float Salary=obj.getempAge();
    }
}
