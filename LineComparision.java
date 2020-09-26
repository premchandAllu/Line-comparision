package com.Bridgelabz.LineComparision;
import java.text.DecimalFormat;

public class LineComparision 
  {  
	private static DecimalFormat df=new DecimalFormat("0.00");
	public static boolean comparevalue;
	public static int value;
	
	public static void main(String [] args)
	  { 
		//Variables
		int X1,X2,X3,X4,Y1,Y2,Y3,Y4;
		
		X1=(int) ( Math.random( ) *10 );
		X2=(int) ( Math.random( ) *10 );
		X3=(int) ( Math.random( ) *10 );
		X4=(int) ( Math.random( ) *10 );

		Y1=(int) ( Math.random( ) *10 );
		Y2=(int) ( Math.random( ) *10 );
		Y3=(int) ( Math.random( ) *10 );
		Y4=(int) ( Math.random( ) *10 );
		
	    //Computation
		 double length1  =   Math.sqrt( (X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1) ) ;
		 double length2 =    Math.sqrt( (X4-X3)*(X4-X3) + (Y4-Y3)*(Y4-Y3) ) ;
		
		//Class object
		LineComparision lineObject= new LineComparision();
		lineObject.equals(length1, length2);
		lineObject.compareTo(length1, length2);
		
	 }	
		public void equals(double line1Length, double line2Length)
		{
		
			  //By equals method
			 comparevalue = df.format(line1Length).equals (df.format(line2Length));
			  
			  if(comparevalue)
			  {
			   System.out.println("Both the lines are equal in length");
			  }
			  else {
			   System.out.println("Both the lines are not equal in length");
			  }
			 }
	   public void compareTo(double line1Length,double line2Length)
	     {
		 //Wrapper Class
		   Double obj1 =new Double(df.format(line1Length));
		   Double obj2 =new Double(df.format(line2Length));
		   
	      //Comparing
	      int value= obj1.compareTo(obj2);
	  
	     if(value==0)
		   System.out.println("Both lines are equal");
	
	     else if(value<0)
		   System.out.println("Line 1 is smaller than Line 2"); 
	     
	     else
	       System.out.println("Line 1 is bigger than Line 2");
	    } 
	   
  }
	   
	
	

