package com.revature;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Single_and_ready_to_mingle {
	public static void find_singles( ArrayList <Integer> arr) {
		HashSet<Integer> num=new HashSet<Integer>();
		

		for (int j=0;j<arr.size();j++) {
			if(num.contains(arr.get(j))) {
				num.remove(arr.remove(j));
			}
			else {
				num.add(arr.get(j));
			}
		}
		System.out.println(num);
		}
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			 ArrayList<Integer> arr=new ArrayList<Integer>();
			 System.out.println("Enter the length");
			 int n=in.nextInt();
			for (int i=0;i<n;i++) {
				System.out.println("Enter Number");
				arr.add(in.nextInt());
			}
			find_singles(arr);
			
		}
}
