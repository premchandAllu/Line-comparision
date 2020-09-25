package com.Bridgelabz.LineComparision;

public class LineComparision 
  {
	public static void main(String [] args)
	  { 
		//Variables
		int X1,X2,X3,X4,Y1,Y2,Y3,Y4;
		
		X1=(int) ( Math.random( ) *10);
		X2=(int) ( Math.random( ) *10);
		X3=(int) ( Math.random( ) *10);
		X4=(int) ( Math.random( ) *10);

		Y1=(int) ( Math.random( ) *10);
		Y2=(int) ( Math.random( ) *10);
		Y3=(int) ( Math.random( ) *10);
		Y4=(int) ( Math.random( ) *10);
		
	    //Computation
		int length1  = (int) Math.floor( Math.sqrt( (X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1) ) );
		int length2 = (int) Math.floor( Math.sqrt( (X4-X3)*(X4-X3) + (Y4-Y3)*(Y4-Y3) ) );
		
		//Wrapper Class
	   Double obj1 =new Double(length1);
	   Double obj2 =new Double(length2);
	   //Comparing
	   boolean value= obj1.equals(obj2);
	  
	     if(value)
	      { 
		   System.out.println("Both lines are equal");
	      }
	     else
		   System.out.println("Both lines are not equal"); 
		  
	  }
	
}	

