package dummyProject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
	public static void main(String s[])
	{
//	Collections-A heterogeneous collection of data elements. 
//	If we want to represent a group of individual objects(Different data types) as a 
//	single entity, then we can use collections.
//	Inbuilt Method support is available in collections framework.
//	Collections(I)- List(I), Set(I)
//	List(I)-If we want to represent a group of individual objects
//	(Different data types) as a single entity where insertion 
//	order is preserved and duplicates are allowed.
//	Child Interfaces: ArrayList, LinkedList, Vector(Legacy), Stack(Legacy)
//	ArrayList- storing mechanism- growable array- Searching mechanism
//	Linked List- Storing mechanism - Double Linked list- insertion/deletion
//	List l = new ArrayList();
	List l = new ArrayList();	
	l.add(34);
	l.add("Test");
	l.add(40);
	l.add(50.09);
	l.add(true);
	l.add(34);
	System.out.println(l);
	//As the input data is not of same data type, we have given it as Object
	for(Object i:l)
	{
		System.out.println(i);
	}
	//We have size() method in List which is similar to length variable in Arrays.
	for(int i=0;i<l.size();i++)
	{
		//We have get() method in List which is similar to [] symbol in arrays.
		System.out.println(l.get(i));
	}
	
	//Set: If we want to represent a group of individual objects(Different data types) as a 
//	single entity where insertion order is not preserved and duplicates are not allowed then we can use Set.
	
//	Child Classes-HashSet-> TreeSet
	System.out.println("****************************Set***********************");
	Set d = new HashSet();	
	d.add(34);
	d.add("Test");
	d.add(40);
	d.add(50.09);
	d.add(true);
	d.add(34);
	System.out.println(d);
	for(Object o:d) {
		System.out.println(o);
	}
//	Data gets sorted in a tree set and duplicates are not allowed
	//We can achieve homogenity of the collection through Generics(<>)
	Set<Integer> y = new TreeSet<Integer>();	
	y.add(34);
	y.add(1);
	y.add(40);
	y.add(50);
	y.add(35);
	y.add(34);
	System.out.println(d);
	for(int o:y) {
		System.out.println(o);
	}

	Set<String> y1 = new TreeSet<String>();	
	y1.add("Hi");
	y1.add("Hello");
	System.out.println(d);
	for(String o:y1) {
		System.out.println(o);
	}

	}
	
	
	
	
}
