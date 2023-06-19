package com.mycompany.practical1;
public class Practical1 
{

    public static void main(String[] args)
    {
        int x;
        for(x=0;x<5;x++)
        {
            System.out.println("Excuting loop"+x);
            {
                System.out.println("");
                int y = 0;
                while(y<5)       
                {
                    System.out.println("Excuting loop"+y); 
                    y++;
                }
            }
        }
    }
}
