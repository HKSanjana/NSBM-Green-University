
package com.mycompany.pactrical2;
public class Monster 
{
    //data
    private int location;
    private String descripition;
    //method
    public Monster (int location,String description)
    {
        this.location=location;
        this.descripition=descripition;
    }
    public void display()
    {
        System.out.println("location"+location); 
        System.out.println("descripition"+descripition);
    }
}
