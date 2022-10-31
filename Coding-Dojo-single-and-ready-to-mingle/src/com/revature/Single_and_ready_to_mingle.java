package com.revature;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.hamcrest.Matcher;

public class Single_and_ready_to_mingle {
	public static String find_singles( ArrayList <String> arr) {
		HashSet<Integer> num=new HashSet<Integer>(); 
		for (int j=0;j<arr.size();j++) {
			if(!arr.get(j).matches("[0-9]+")) {
				//System.out.println("Error");
			return("Error");
			}
			Integer a=Integer.parseInt(arr.get(j));
		

			if(!num.contains(a)) {
				num.add(a);
			//System.out.println("Add="+num);
			}
			else {
				num.remove(a);
				//System.out.println("Remove="+num);
			}
		}
		return(String.valueOf(num));
		//System.out.println(num);
		}
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			 ArrayList<String> arr=new ArrayList<String>();
			 System.out.println("Enter the length");
			 int n=in.nextInt();
			 in.nextLine();
			try {
				for (int i=0;i<n;i++) {
					System.out.println("Enter Number");
					arr.add(in.nextLine());
				}
			}
			catch(Exception e) {System.out.println(e);}
			find_singles(arr);
			
		}
}
