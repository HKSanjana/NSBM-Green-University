package com.mycompany.practical03;
public class Employee
{
    //data
    private String empName;
    private int Bonus,BasicSalary;
    //methods
    public void setempName(String empName)
    {
        this.empName=empName;
    }
    public void setBonus(int Bonus)
    {
        this.Bonus=Bonus;
    }
    public void setBasicSalry(int BasicSalary)
    {
        this.BasicSalary=BasicSalary;
    }
    public String getempName()
    {
        return empName;
    }
    public int getBonus()
    {
        return Bonus;
    }
    public int getBasicSalary()
    {
        return BasicSalary;
    }
    //method to calculate bonus amount
    public int calculateBonusAmount()
    {
        return (BasicSalary+Bonus);
    }
            
}

