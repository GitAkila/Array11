package com.array;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
public class Collection {
	public static void main(String[] args) {
		//Description : Replace the 10 into 100 in List
		//Input:   List = 10,20,30,90,10,10,40,50,30
		//Output:  List = 100,20,30,90,100,100,40,50,30
		List<Integer> l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);
		l1.add(30);
		System.out.println("Before Replace:");
		System.out.println(l1);
		System.out.println("After Replacing 10:");
		for (int i = 0; i < l1.size(); i++) {
			Integer integer = l1.get(i);
			if (integer==10) {
				l1.set(i, 100);
			}
		}
		System.out.println(l1);


		
		/*
		//Replace the value present in 7th index as 90 
        //Input:   List = 10,20,30,90,10,10,40,50,10
		List<Integer> l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);
		l1.add(10);
		System.out.println("Before Replace");
		System.out.println(l1);
		System.out.println("After Replace");
		l1.set(7, 90);
		System.out.println(l1);
		
		//Add a value 100 at the last index of 10 in the list
        //Input : List = 10,20,30,90,10,10,40,50
		List<Integer> l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);
		System.out.println("Before Adding");
		System.out.println(l1);
		int lastIndexOf = l1.lastIndexOf(10);
		System.out.println("After Adding");
		l1.add(lastIndexOf, 100);
		System.out.println(l1);

		//Remove the last value of 10 present in the list  
        //Input:   List = 10,20,30,90,10,10,40
		List<Integer> l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		System.out.println("Before Remove method");
		System.out.println(l1);
		int lastIndexOf = l1.lastIndexOf(10);
		l1.remove(lastIndexOf);
		System.out.println("the last Index value of 10 present in the list: "+lastIndexOf);
		System.out.println("After Remove method");
		System.out.println(l1);

		//Remove the value present at 10th index 
        //Input:   List = 10,20,30,90,10,10,40
		List<Integer> l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		System.out.println("Before Remove method");
		System.out.println(l1);
		l1.remove(10);
		System.out.println("After Remove method");
		System.out.println(l1);

		//Get the each value of list by using enhanced for loop
		//Input:   List = 105,205,305,405,505,605,705,805
		List<Integer> l1 = new LinkedList();
		l1.add(105);
		l1.add(205);
		l1.add(305);
		l1.add(405);
		l1.add(505);
		l1.add(605);
		l1.add(705);
		l1.add(805);
		System.out.println(l1);
		for (Integer integer : l1) {
			System.out.println(integer);
		}

		//Get the each value of list by using normal for loop
		//Input:   List = 105,205,305,405,505,605,705,805
		List<Integer> l1 = new LinkedList();
		l1.add(105);
		l1.add(205);
		l1.add(305);
		l1.add(405);
		l1.add(505);
		l1.add(605);
		l1.add(705);
		l1.add(805);
		System.out.println(l1);
		for (int i = 0; i < l1.size(); i++) {
			Integer integer = l1.get(i);
			System.out.println("Inder " + i + " element:" +integer);
		}
		
		//Get the value present at 8th index
		//Input:   List = 105,205,305,405,505,605,705,805
		List<Integer> l1 = new LinkedList();
		l1.add(105);
		l1.add(205);
		l1.add(305);
		l1.add(405);
		l1.add(505);
		l1.add(605);
		l1.add(705);
		l1.add(805);
		System.out.println(l1);
		Integer integer = l1.get(8);
		System.out.println("value present at 8th index:"+integer);

		//Get the each index value of 70 present in below list  
		//Input:   List = 10,20,30,90,10,10,40,50,10
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);
		l1.add(10);
		System.out.println(l1);
		System.out.println("Each index values of 70:");
		for (int i = 0; i < l1.size(); i++) {
			Integer integer = l1.get(i);
			if (integer == 70) {
				System.out.println(i);
			}
		}

		//Get the index value of 90  
		//Input:   List = 10,20,30,90,10,10,40,50
        List<Integer> l2 = new Vector();
        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(90);
        l2.add(10);
        l2.add(10);
        l2.add(40);
        l2.add(50);
        System.out.println(l2);
        int indexOf = l2.indexOf(70);
        System.out.println("Index value of 70:"+indexOf);
        
		//Get the last index value of 10 
		//Input:   List = 10,20,30,90,10,10,40,50
		List<Integer> l1 = new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		int lastIndexOf = l1.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		//Get the first index value of 10 
		//Input:   List = 10,20,30,90
		List<Integer> l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		System.out.println(l1);
		int indexOf = l1.indexOf(10);
		System.out.println("Index of 10:"+indexOf);

		//Create a new vector with values and find the length of it
        //Input : List = 105,205,305,405,505,605,705,805
        List l3 = new Vector();
		l3.add(105);
		l3.add(205);
		l3.add(305);
		l3.add(405);
		l3.add(505);
		l3.add(605);
		l3.add(705);
		l3.add(805);
		System.out.println(l3);
		int size = l3.size();
		System.out.println("Length:"+size);
		
		//Create a new LinkedListlist with values and find the length of it
        //Input : List = 100,200,300,400,500,600,700
		List l2 = new LinkedList();
		l2.add(100);
		l2.add(200);
		l2.add(300);
		l2.add(400);
		l2.add(500);
		l2.add(600);
		l2.add(700);
		System.out.println(l2);
		int size = l2.size();
		System.out.println("Length:"+size);

		//Create a new ArrayListlist with values and find the length of it
		List l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(90);
		l1.add(30);
		l1.add(40);
		l1.add(100);
		l1.add(10);
		l1.add(50);
		System.out.println(l1);
		int size = l1.size();
		System.out.println("Length:"+size);
		*/
		
	}

}
