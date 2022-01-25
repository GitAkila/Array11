package com.array;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
	public static void main(String[] args) {
		//Create a new ArrayListlists with values and perform removeAll() function
		//Input : List = 10,20,30,40,50,60,70,80
        //Input : List = 100,200,300,400,500,600,700,8000
		List<Integer> l1=new ArrayList();
		List<Integer> l2=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(70);
		l1.add(80);
		System.out.println("L1:"+l1);
		l2.add(100);
		l2.add(200);
		l2.add(300);
		l2.add(400);
		l2.add(500);
		l2.add(600);
		l2.add(700);
		l2.add(8000);
		System.out.println("L2:"+l2);
		System.out.println("After RemoveAll():");
		l2.removeAll(l1);
		System.out.println(l2);
         /*
		//Create a new ArrayListlists with values and return the common values
		//Input : List = 10,20,30,40,50,60,70,80
		//Input : List = 100,200,300,400,500,600,700,8000
		List<Integer> l1=new ArrayList();
		List<Integer> l2=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(70);
		l1.add(80);
		System.out.println("L1:"+l1);
		l2.add(100);
		l2.add(200);
		l2.add(300);
		l2.add(400);
		l2.add(500);
		l2.add(600);
		l2.add(700);
		l2.add(8000);
		System.out.println("L2:"+l2);
		System.out.println("Common Values:");
		l2.retainAll(l1);
		System.out.println(l2);
		*/
	}

}
