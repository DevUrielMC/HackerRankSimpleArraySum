package com.hackerranksimplearraysum.app;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SimpleArraySum 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
	
		for (int miArray = 0; miArray < n; miArray++) 
		{
			sum += input.nextInt();
		}
		System.out.println(sum);
		
	}
}

	
	

