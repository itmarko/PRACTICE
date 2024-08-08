package com.marko.ArrayList;
/*
 * Q 1) What is the ArrayList and why ArrayList ?
 * Q 2) Synchronized collection ?
 * Q 3) Ordered Collection ?
 * Q 4) Implemented data structure ?
 * Q 5) Default capacity, incremental capacity, load factor ?
 * Q 6) What type elements are stored ?
 * Q 7) Is null allowed ?
 * Q 8) In which order elements are stored ?
 * Q 9) In which order elements are retrieved ? 
 * Q10) What are the method called inside collection and executed from the adding object class ?
 * 
 * 1) ==> The collection ArrayList is a collection framework, collection, available from 1.2v 
 * 		  When we want to store multiple object with index in insertion order including duplicate
 * 		  without thread-safety we must choose ArrayList(AL).
 * 		  When we want to perform collection operations in STMA(Single Thread Model Application ) 
 * 		  and in ML(Method Local) we must choose AL.
 * 
 * 2) ==> AL a non-synchronized collection collection
 * 		  best to use in STMA and ML operation 
 * 
 * 3) ==> AL is an ordered collection, it maintains insertion order with index.
 * 
 * 4) ==> AL implemented data structure is Resizable array
 * 
 * 5) ==> Default capacity of ArrayList: initially DC(Default Capacity) : 0 then increased to 10 , id DC = 0
 * 		  incremental capacity : half or IC(incremental capacity): +1 
 * 											if  EIC(Explicit initial capacity) is : 0 or 1
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

import java.util.ArrayList;
import com.marko.vector.Ex;

public class Test02_ArrayList {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
//		System.out.println("Capacity :"+al.capacity());
		System.out.println("Size :"+al.size());
		System.out.println("Ele. :"+al.toString());
		System.out.println();
		
	 //#1 Adding Objects
		 al.add("a");
		 al.add("b");
		 al.add(5);
		 al.add(6.7);
		 al.add('p');
		 al.add(true);
		 al.add(null);
		 al.add("a");
		 al.add(5);
		 al.add(new Ex(5,6));
		 
	//#2 Counting object storing in ArrayList 
		System.out.println("Size :"+al.size());
		
	//#3 printing object storing in ArrayList
		System.out.println("Ele. :"+al.toString());
		
	//testing Resizable Array Algorithm
		al.add(6.7);
		al.add(null);
		
		System.out.println("Size :"+al.size());
		System.out.println("Ele. :"+al.toString());
		System.out.println();
		
		al.add(new Sa(5,"a"));
		al.add(null);
		al.add(new Sa(6,"b"));
		System.out.println("Size :"+al.size());
		System.out.println("Ele. :"+al.toString());
		System.out.println();
		
	//#Searching object in ArrayList - finding the given argument method object
		System.out.println(al.contains("a")); // true 
											//-> "a".equals(eD[0]:"a"); ->true
		System.out.println(al.contains(new String("a"))); //true
											// ->new String("a").equals(eD[0]:"a"); ->true
		System.out.println(al.contains(6.7)); // true //LinearSearching algorithm
											// -> (6.7).equals(eD[0]:"a"); -> false ->contains()
											// -> (6.7).equals(eD[1]:"b"); -> false ->contains()
											// -> (6.7).equals(eD[2]:5); -> false ->contains()
											// -> (6.7).equals(eD[3]:6.7); -> true
		System.out.println(al.contains(new Ex(5,6))); //true
											// -> Ex(5,6).equals(eD[0]:"a");
											// -> Ex(5,6).equals(eD[0]:"a"); -> false ->contains()
											// -> Ex(5,6).equals(eD[1]:"b"); -> false ->contains()
											// -> Ex(5,6).equals(eD[2]:5); -> false ->contains()
											// -> Ex(5,6).equals(eD[3]:6.7); -> false ->contains()
											// -> Ex(5,6).equals(eD[4]:'p'); -> false ->contains()
											// -> Ex(5,6).equals(eD[5]:true); -> false ->contains()
											// -> Ex(5,6).equals(eD[6]:null); -> false ->contains()
											// -> Ex(5,6).equals(eD[7]:"a"); -> false ->contains()
											// -> Ex(5,6).equals(eD[8]:6); -> false ->contains()
											// -> Ex(5,6).equals(eD[9]:new Ex(5,6)); -> true
											
		System.out.println(al.contains(new Sa(5,"a"))); // false
											// Because in Sa class equals() method is not overridden
											// it is expected from java.lang.Object class, Sa object
											// compare with all available in collection 
											// by using reference, its reference  is not equal 
											// to any object available in collection,
											// equals() method returns false and there by contains()
											// method also returns false 
		System.out.println(al.contains(null)); //-> true -> null eD[i]
		System.out.println();

		//#5 Searching object in ArrayList and retrieving its index number
		System.out.println(al.indexOf("a"));	// "a".equals(eD[i]) -> return index 
		System.out.println(al.indexOf("A"));	// "A".equals(eD[i]) -> -1
		System.out.println(al.indexOf(new String("a"))); // S("a").equals(eD[i])-> return index
		System.out.println(al.indexOf(6.7));	//
		System.out.println(al.indexOf('p'));	//
		System.out.println(al.indexOf(new Ex(5,6))); 	//
		System.out.println(al.indexOf(new Sa(5,"a")));	//
		System.out.println(al.indexOf(null)); //null == eD[i]
		
		System.out.println(al.lastIndexOf(null)); // null == eD[i] 
//	#6 retrieving elements from collection
		System.out.println();
		System.out.println(al.get(0));	//111.toSting()
		System.out.println(al.get(3));
		System.out.println(al.get(7));
		
		// Rule #1: we must not assign get() to returning object type variable 
				//we must assign returning element to object type variable 
				// because get() method return type java.lang.Object 
				// String s=al.get(0);
		Object obj=al.get(3);
		System.out.println(obj);
		
		//Rule #2: by using object type variable we cannot access 
					//returned object specific method for this purpose 
					// we must do type casting 
					//System.out.println()obj.ToUpperCase());
		
		//Rule #3: we must not do type casting directly , it may leads classcastException
					// we must do type casting inside instanceof operator condition
		
		
		//String s = (String)obj;
		if (obj instanceof String) {
			String s=(String)obj;
			System.out.println(s.toUpperCase());
		}
		
		// Rule #4: the [index>=0&&index<size ]
		//obj = al.get(-1);
		obj =al.get(0);
		obj =al.get(14); //size
	//		obj = al.get(15); // size
	//		obj = al.get(20);	// capacity
		System.out.println(al);
		
		//for(int i = 0; i<al.size();i++)	{ All Elements 
		//for(int i = 0; i<=al.size();i++)	{ All elements +IOOBE
		//for(int i = 0; i<=al.size()-1;i++){ All Elements 
		for(int i =0; i<=al.size()-1; i++) { // last element will be missed
			obj = al.get(i);
			System.out.println(obj);
			
		}
		System.out.println();
		//retrive  Ex(5,6) object from al
		int index  = al.indexOf(new Ex(5, 6));
		Ex e1 = (Ex) al.get(index);
		System.out.println(e1);
		System.out.println();
		
		// retrieve Ex(5,6) change its value by adding 10 
		Ex e = new Ex(5, 6);
		
		System.out.println(al);
		e1 = (Ex)al.get(al.indexOf(e));
		
		System.out.println(e + " "+ e1);
		e1.setX(e1.getX()+10);	 // mutable object 
		e1.setX(e1.getY()+10);	// modification, effected collection 
		System.out.println(e + " "+ e1);
		System.out.println(al);
		
		String s1 = (String)al.get(0);
		s1.toUpperCase();						// immutable object modification 
		System.out.println(al);					// not affected to collection 
												// to store modification in collection 
		//#7 replacing object in collection 	// we must replace old with new data object
		al.set(0, s1.toUpperCase());			// in collection by using get method 
		System.out.println(al);
		
		al.add("b");
		System.out.println();
		
		
	}			
	
}
