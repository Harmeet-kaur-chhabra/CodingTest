package test;

import java.io.*;
import java.util.Scanner;
class BMI
    {
	  public static void main(String args[])
	  {
		  String a,b;
	  float w,h,t;
	  Scanner sc=new Scanner(System.in);
	  {
		  System.out.println("enter first name");
		  a=sc.nextLine();
		  System.out.println("enter last name");
	      b=sc.nextLine();
	      System.out.println("enter weight name");
	      w=sc.nextFloat();
	      System.out.println("enter height name");
	      h=sc.nextFloat();
	  }
	  t=w/(h*h);
	  System.out.println(a+" "+b);
	  if(t<18.5)
	  {
		  System.out.println("Underweight");
	  }
	  else if(w>=18.5 && w<25)
	  {
		  System.out.println("Normal");
	  }
	  else if(w>=25 && w<30)
	  {
		  System.out.println("Overweight");
	  }
	  else
	  {
		  System.out.println("Obese");
		  }
	  }
}
