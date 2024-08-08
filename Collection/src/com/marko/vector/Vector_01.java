package com.marko.vector;
/*
 * Q 1) What is the Vector and why Vector ?
 * Q 2) Synchronized collection ?
 * Q 3) Ordered Collection ?
 * Q 4) Implemented data structure ?
 * Q 5) Default capacity, incremental capacity, load factor ?
 * Q 6) What type elements are stored ?
 * Q 7) Is null allowed ?
 * Q 8) In which order elements are stored ?
 * Q 9) In which order elements are retrieved ? 
 * Q10) What are the method called inside collection 
 * and executed from the adding object class ?
 * 
 * 1) ==> The collection vector is a legacy collection available 
 * 		  from java 1.0version when we want to store multiple objects 
 * 		  with index in insertion order with thread-safety we must choose vector.
 * 
 * 2) ==> Vector is a synchronized collection.
 * 
 * 3) ==> Vector is an ordered collection, it maintains insertion order with index.
 * 
 * 4) ==> Vector implemented data structure is growable array.
 * 
 * 5) ==> Default capacity is:10					if default capacity(dc): 0
 * 		incremental capacity :double  			   incremental capacity(ic):+1
 * 
 * 6) ==> All 4 type of objects are stored [h,h,u,d] = {homogeneous, heterogeneous, unique, duplicate}
 * 
 * 7) ==> Null s allowed, multiple time.
 * 
 * 8) ==> Insertion order is preserved, add() method calling order.
 * 
 * 9) ==> Support random and also sequential access. 
 * 
 *10) ==> toString() and equals() method are called and execute from our class or 
 *		  from java.lang.object class
 *		- toString() is called is println() method while printing collection
 *		- equal() is called in contains() and remove() method while searching and
 *		  removing object from collection
 */
import java.util.Vector;

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
			System.out.println(); //xerox 223 onword
			
			
			System.out.println(v5);								//[a, b, 5, 6.7, p, true, a, 5, 6.7, true, Ex [x=5, y=6]]
			System.out.println(v5.contains(5));					//true
			System.out.println(v5.contains(true));				//true
			System.out.println(v5.contains("a"));				//true
			System.out.println(v5.contains("A"));				//false
			System.out.println(v5.contains(new String("a")));	//true
			System.out.println(v5.contains(new Ex(5,6))); 		// false (to sol we can override equals method)
			
			//after override equlas method
			/*[a, b, 5, 6.7, p, true, a, 5, 6.7, true, Ex [x=5, y=6]]
			 *	true
			 *	true
			 *	true
			 *	false
			 *	true
			 *	true
			 * */
			
	}
}
