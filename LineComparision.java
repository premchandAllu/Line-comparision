package com.Bridgelabz.LineComparision;

public class LineComparision 
  {
	
	public static void main(String [] args)
	  { 
		//Variables
		int X1,X2,Y1,Y2;
		
		X1=(int) ( Math.random( ) *10);
		X2=(int) ( Math.random( ) *10);
		Y1=(int) ( Math.random( ) *10);
		Y2=(int) ( Math.random( ) *10);
		
	    //Computation
		int length= (int) Math.floor( Math.sqrt( (X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1) ) );
		
		//Printing Output
		System.out.println("Length of the line is "+length);
		  
	  }
	
}	

