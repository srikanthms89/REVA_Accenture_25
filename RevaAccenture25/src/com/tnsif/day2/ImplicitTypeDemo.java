//Demonstarte type conversion
package com.tnsif.day2;

public class ImplicitTypeDemo {

	public static void main(String[] args) {

		//Implicit Type conversion
 char ch = 'a';
 int a = ch;
 System.out.println(a);
 
 
 int  b = 100;
 double bb = b;
 System.out.println(bb);
 
 //Explicit Type Conversion
 
 double d = 198765.9765755d;
 int dd =(int)  d;
 System.out.println(dd);
 
 
 float f = 123.76f;
 
 char ff = (char) f;
 System.out.println(ff);
 
 
 
 
		
		
	}

}
