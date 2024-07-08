package com.tnsif.day2;

public class AriOpDemo {

	public static void main(String[] args) {


		int a= 10;
		int b= 20;
		int c= 30;
		
		a++; //
		
		int d = a ++ + b + c; // 11 + 20 + 30
		System.out.println("value of d" +d);//12 20 30
		
		
	 --a; //11
	 b++; //20
	 c++; //30
	 
	 int aa =  -- a  + b + c++; // 10 + 21 + 31 
	 System.out.println(aa);
	 
	 System.out.println(a);//10
	 System.out.println(b);//21
	 System.out.println(c);//32
		
	}

}
