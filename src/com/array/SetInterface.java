package com.array;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class SetInterface {
public static void main(String[] args) {
	//Create a new TreeSet with values and perform removeAll() function
    //Input : List = 10,20,30,40,50,60,70,80
    //Input : List = 100,200,300,400,500,600,700,8000
	Set<Integer> s1 = new TreeSet<>();
	Set<Integer> s2 = new TreeSet<>();
	s1.add(10);
	s1.add(20);
	s1.add(30);
	s1.add(40);
	s1.add(50);
	s1.add(60);
	s1.add(70);
	s1.add(80);
	s2.add(100);
	s2.add(200);
	s2.add(300);
	s2.add(400);
	s2.add(500);
	s2.add(600);
	s2.add(700);
	s2.add(8000);
	System.out.println("S1:"+s1);
	System.out.println("S2:"+s2);
	System.out.println("After Remove All:");
	s2.removeAll(s1);
	System.out.println(s2);


	/*
	//Create a new LinkedHashSet with values and perform removeAll() function
    //Input : List = 10,20,30,90,10,10,40,50
    //Input : List = 10,20,60,50,40,70,80,90
	Set<Integer> s1 = new LinkedHashSet<>();
	Set<Integer> s2 = new LinkedHashSet<>();
	s1.add(10);
	s1.add(20);
	s1.add(30);
	s1.add(90);
	s1.add(10);
	s1.add(10);
	s1.add(40);
	s1.add(50);
	s2.add(10);
	s2.add(20);
	s2.add(60);
	s2.add(50);
	s2.add(40);
	s2.add(70);
	s2.add(80);
	s2.add(90);
	System.out.println("S1:"+s1);
	System.out.println("S2:"+s2);
	System.out.println("After Remove All:");
	s2.removeAll(s1);
	System.out.println(s2);

	//Create a new HashSet with values and perform removeAll() function
    //Input : List = 10,20,30,90,10,10,40,50
    //Input : List = 30,40,50,60,80
	Set<Integer> s1 = new HashSet<>();
	Set<Integer> s2 = new HashSet<>();
	s1.add(10);
	s1.add(20);
	s1.add(30);
	s1.add(90);
	s1.add(10);
	s1.add(10);
	s1.add(40);
	s1.add(50);
	s2.add(30);
	s2.add(40);
	s2.add(50);
	s2.add(60);
	s2.add(80);
	System.out.println("S1:"+s1);
	System.out.println("S2:"+s2);
	System.out.println("After Remove All:");
	s2.removeAll(s1);
	System.out.println(s2);

	//Create a new TreeSet with values and return the common values
    //Input : List = 10,20,30,40,50,60,70,80
    //Input : List = 100,200,300,400,500,600,700,8000
	Set<Integer> s1 = new TreeSet<>();
	Set<Integer> s2 = new TreeSet<>();
	s1.add(10);
	s1.add(20);
	s1.add(30);
	s1.add(40);
	s1.add(50);
	s1.add(60);
	s1.add(70);
	s1.add(80);
	s2.add(100);
	s2.add(200);
	s2.add(300);
	s2.add(400);
	s2.add(500);
	s2.add(600);
	s2.add(700);
	s2.add(8000);
	System.out.println("S1:"+s1);
	System.out.println("S2:"+s2);
	System.out.println("After RetainAll:");
	s2.retainAll(s1);
	System.out.println(s2);

	//Create a new LinkedHashSet with values and return the common values
    //Input : List = 10,20,30,90,10,10,40,50
    //Input : List = 10,20,60,50,40,70,80,90
	Set<Integer> s1 = new LinkedHashSet<>();
	Set<Integer> s2 = new LinkedHashSet<>();
	s1.add(10);
	s1.add(20);
	s1.add(30);
	s1.add(90);
	s1.add(10);
	s1.add(10);
	s1.add(40);
	s1.add(50);
	s2.add(10);
	s2.add(20);
	s2.add(60);
	s2.add(50);
	s2.add(40);
	s2.add(70);
	s2.add(80);
	s2.add(90);
	System.out.println("S1:"+s1);
	System.out.println("S2:"+s2);
	System.out.println("After RetainAll:");
	s2.retainAll(s1);
	System.out.println(s2);

	//Create a new HashSet with values and return the common values
    //Input : List = 10,20,30,90,10,10,40,50
    //Input : List = 30,40,50,60,80
	Set<Integer> s1 = new HashSet<>();
	Set<Integer> s2 = new HashSet<>();
	s1.add(10);
	s1.add(20);
	s1.add(30);
	s1.add(90);
	s1.add(10);
	s1.add(10);
	s1.add(40);
	s1.add(50);
	s2.add(30);
	s2.add(40);
	s2.add(50);
	s2.add(60);
	s2.add(80);
	System.out.println("S1:"+s1);
	System.out.println("S2:"+s2);
	System.out.println("After RetainAll:");
	s2.retainAll(s1);
	System.out.println(s2);
	
	//Create a HashSet and iterate each value in the set by using enhanced for loop
    //List = 10,20,30,40,50,60,70,80,90,10,20
	Set<Integer> s = new HashSet<>();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	s.add(50);
	s.add(60);
	s.add(70);
	s.add(80);
	s.add(90);
	s.add(10);
	s.add(20);
	System.out.println(s);
	System.out.println("Enhanced Forloop:");
	for (Integer integer : s) {
		System.out.println(integer);
	}
	 
	//Create a TreeSet and iterate each value in the set by using enhanced for loop
    //List = 10,20,30,40,50,60,70,80,90,10,20
	Set<Integer> s = new TreeSet();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	s.add(50);
	s.add(60);
	s.add(70);
	s.add(80);
	s.add(90);
	s.add(10);
	s.add(20);
	System.out.println(s);
	System.out.println("Enhanced Forloop:");
	for (Integer integer : s) {
		System.out.println(integer);
	}

	//Convert the below list in to set(use addAll()) method
    //List = 100,200,300,400,500,600,700,100,300,500
	Set<Integer> s = new TreeSet<>();
	List<Integer> l = new ArrayList();
	l.add(100);
	l.add(200);
	l.add(300);
	l.add(400);
	l.add(500);
	l.add(600);
	l.add(700);
	l.add(100);
	l.add(300);
	l.add(500);
	System.out.println("Before AddAll");
	System.out.println("List:"+l);
	System.out.println("Set:"+s);
	System.out.println("After AddAll");
	s.addAll(l);
	System.out.println("List:"+l);
	System.out.println("Set:"+s);

	//Create a HashSet for the below value
	//Input : List = 10,20,30,40,50,60,70,80,90,10,20
	Set<Integer> s1=new HashSet<>();
	s1.add(10);
	s1.add(20);
	s1.add(30);
	s1.add(40);
	s1.add(50);
	s1.add(60);
	s1.add(70);
	s1.add(80);
	s1.add(90);
	s1.add(10);
	s1.add(20);
	System.out.println("Hash Set:");
	System.out.println(s1);
	//Create a LinkedHashSet for the below values
	//Input : List = 10,20,30,40,50,60,70,80,90,10,20
	Set<Integer> s2 = new LinkedHashSet<>();
	s2.add(10);
	s2.add(20);
	s2.add(30);
	s2.add(40);
	s2.add(50);
	s2.add(60);
	s2.add(70);
	s2.add(80);
	s2.add(90);
	s2.add(10);
	s2.add(20);
	System.out.println("Linked Hash Set:");
	System.out.println(s2);
	//Create a TreeSet for the below values
	//Input : List = 10,20,30,40,50,60,70,80,90,10,20
	Set<Integer> s3 = new TreeSet<>();
	s3.add(10);
	s3.add(20);
	s3.add(30);
	s3.add(40);
	s3.add(50);
	s3.add(60);
	s3.add(70);
	s3.add(80);
	s3.add(90);
	s3.add(10);
	s3.add(20);
	System.out.println("Tree Set:");
	System.out.println(s3);
	*/

	
}
}
