package Lista;

public class Principal {
	
	 public static void main(String[] args) 
	    { 
	        /* Start with the empty list. */
	    	ImplList list = new ImplList(); 
	  
	        // 
	        // ******INSERTION****** 
	        // 
	  
	        // Insert the values 
	        list.insert(list, 1); 
	        list.insert(list, 2); 
	        list.insert(list, 3); 
	        list.insert(list, 4); 
	        list.insert(list, 5); 
	        list.insert(list, 6); 
	        list.insert(list, 7); 
	        list.insert(list, 8); 
	  
	        // Print the LinkedList 
	        list.printList(list); 
	    } 

}
