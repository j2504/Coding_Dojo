package com.revature;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestCases {
Single_and_ready_to_mingle num;
ArrayList<String> arr;
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
@Before
public void ele()
{
	arr=new ArrayList<String>();	
	 arr.add("a");
	 arr.add("1");
	 arr.add("2");
	 arr.add("3");
	 arr.add("4");
}
     @Test
    void Empty() {
    num=new Single_and_ready_to_mingle();
 
    }
     @Test
     void singles() {
    	 
     }
     @Test
     void doubles() {
    	 
     }
     @Test
     void thriples() {
    	 
     }
     @Test
    void exception() {
    	 arr=new ArrayList<String>();	
    	 arr.add("a");
    	 arr.add("1");
    	 arr.add("2");
    	 arr.add("3");
    	 arr.add("4");
    	num=new Single_and_ready_to_mingle();
    	System.out.println(arr);
    	Single_and_ready_to_mingle.find_singles(arr);
 
    	assertEquals(Single_and_ready_to_mingle.find_singles(arr), "Error");
    	
    }	
    }
    

