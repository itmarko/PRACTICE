package com.marko.vector;

import java.util.*;

public class Vector_01 {
	public static void main(String[] args) {
		Vector<Object> v1 = new Vector<>();		// default capacity : 10, incremental capacity :Double
		Vector<Object> v2 = new Vector<>(5);	// dc: 5, ic :double
		Vector<Object> v3 = new Vector<>(1);	// dc: 1, ic : double
		Vector<Object> v4 = new Vector<>(0);	// dc: 0, ic :+1 	if default capacity is 0 than ic is +1
		
		System.out.println("v1 capacity :"+ v1.capacity() +" "+v1.size());
		System.out.println("v2 capacity :"+ v2.capacity() +" "+v2.size());
		System.out.println("v3 capacity :"+ v3.capacity() +" "+v3.size());
		System.out.println("v4 capacity :"+ v4.capacity() +" "+v4.size());
		
		System.out.println("v4 capacity :"+ v4.capacity() +" "+v4.size()+" "+v4);
		v4.add(10);
		System.out.println("v4 capacity :"+ v4.capacity() +" "+v4.size()+" "+v4);
		v4.add(20);
		System.out.println("v4 capacity :"+ v4.capacity() +" "+v4.size()+" "+v4);
		v4.add(30);
		System.out.println("v4 capacity :"+ v4.capacity() +" "+v4.size()+" "+v4);
		v4.add(40);
		System.out.println("v4 capacity :"+ v4.capacity() +" "+v4.size()+" "+v4);
		v4.add(50);
		System.out.println("v4 capacity :"+ v4.capacity() +" "+v4.size()+" "+v4);
		v4.add(60);
		System.out.println("v4 capacity :"+ v4.capacity() +" "+v4.size()+" "+v4);
		v4.add(70);
		System.out.println("v4 capacity :"+ v4.capacity() +" "+v4.size()+" "+v4);
		v4.add(80);
		System.out.println("v4 capacity :"+ v4.capacity() +" "+v4.size()+" "+v4);
		v4.add(90);
		System.out.println("v4 capacity :"+ v4.capacity() +" "+v4.size()+" "+v4);
		System.out.println();
		
		
		
		
		System.out.println("v3 capacity :"+ v3.capacity() +" "+v3.size()+" "+v3);
		v3.add("a");
		System.out.println("v3 capacity :"+ v3.capacity() +" "+v3.size()+" "+v3);
		v3.add("b");	//Homogeneous object unique
		System.out.println("v3 capacity :"+ v3.capacity() +" "+v3.size()+" "+v3);
		v3.add(5);		//heterogeneous object unique
		System.out.println("v3 capacity :"+ v3.capacity() +" "+v3.size()+" "+v3);
		v3.add(6.7);	// heterogeneous object unique
		System.out.println("v3 capacity :"+ v3.capacity() +" "+v3.size()+" "+v3);
		v3.add("a");	// duplicate unique
		System.out.println("v3 capacity :"+ v3.capacity() +" "+v3.size()+" "+v3);
		v3.add(null);	// null
		System.out.println("v3 capacity :"+ v3.capacity() +" "+v3.size()+" "+v3);
		v3.add(true);	// heterogeneous unique 
		System.out.println("v3 capacity :"+ v3.capacity() +" "+v3.size()+" "+v3);
		v3.add(null);	// duplicate null
		System.out.println("v3 capacity :"+ v3.capacity() +" "+v3.size()+" "+v3);
		
		
		System.out.println();
		
//		Object obj;
//			obj =v3.get(0);
//			System.out.println(obj);
//			
//			obj = v3.get(3);
//			System.out.println(obj);
//			
//			for(int i=0; i<v3.size(); i++) {
//				obj=v3.get(i);
//				System.out.print(obj+", ");
//				
//			}
				
			Vector<Object> v5 = new Vector<>();
			
			System.out.println(v5.capacity());
			System.out.println(v5.size());
			System.out.println(v5.toString());
			System.out.println();
			
			v5.add("a");
			v5.add("b");
			v5.add(5);
			v5.add(6.7);
			v5.add('p');
			v5.add(true);
			v5.add("a");
			v5.add(5);
			v5.add(6.7);
			v5.add(true);
			
			System.out.println(v5.capacity());
			System.out.println(v5.size());
			System.out.println(v5.toString());
			System.out.println();
			
			v5.add(new Ex(5, 6));
			System.out.println(v5.capacity());
			System.out.println(v5.size());
			System.out.println(v5.toString());
			System.out.println();
			
			
	}
}
