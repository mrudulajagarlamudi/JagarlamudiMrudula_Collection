package com.epam1.Collection;

public class Collection_Class {
	
		public static void main(String[] args) 
	    {
			Collection_List<Integer> list = new Collection_List<Integer>(); 
	        //add elements
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        list.add(6);
	        
	        System.out.println(list);
	         
	        //Removes elements from the list
	        list.remove(2);
	        System.out.println(list);
	         
	        //Get element with index
	        System.out.println( list.get(3) );
	        System.out.println( list.get(4) );
	        System.out.println( list.get(1) );
	 
	
	        //List Size
	        System.out.println(list.size());
	    }
		
}
