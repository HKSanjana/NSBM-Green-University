package com.mycompany.practical03;
public class EncapsulationDemo 
{
    //data
    private String empName;
    private int empAge;
    private float Salary;
    //setter method
    public void setempName(String a)
    {
       empName=a; 
    }
    public void setempAge(int b)
    {
        empAge=b;
    }
    public void setSalary(float c)
    {
        Salary=c;
    }
    //getter method
    public String getempName()
    {
        return empName;
    }
     public int getempAge()
    {
        return empAge;
    }
     public float getSalary()
    {
        return Salary;
    }

 
}
