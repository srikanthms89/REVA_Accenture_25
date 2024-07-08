package com.tnsif.day3;

public class ForEachLoopDemo {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};	
//for integer array
		for(int i:a)
		{
		System.out.println(i);	
		}
		
		char ch[]= {'j','a','v','a'};
		for(char c:ch)
		{
			System.out.print(c);		
		}
		System.out.println(" ");
		String s1[]= {"Java","programming","learning"};
//for String array
		for(String s:s1)
		{
			System.out.print(s+" ");		
		}

//for float array
float bb[] = {2.4f,4.5f,6.7f,8.8f};
for(float ff:bb)
{
    System.out.print(ff);
	}
// for double array
double dd[] ={687686.09,787987.89,99999.0};
for(double d:dd)
{
System.out.print(d); 
}
	}
}
