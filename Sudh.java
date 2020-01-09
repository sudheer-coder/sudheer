1) Reverse a String with using String class
package sudheer;

public class sample {

	public static void main(String[] args) {
		// 
		 
		StringBuilder se1 = new StringBuilder("sudheer");
		System.out.println(se1.reverse());

	}

}
===========================================================================================
2)Reverse a String without using methods of String 

package sudheer;

public class sample {

	public static void main(String[] args) {
		// 
		 int g=0;
		String se = "sudheer";
		char ce[] = se.toCharArray();
		
		for(int i=0;i<ce.length;i++) 
		{ 
			g++; 
		}
        for(int i=g-1;i>=0;i--) 
        { 
        	System.out.println(ce[i]);
        }
	}

}
=======================================================================================
write a program to replace all even positoned characters with the next one 

package sudheer;

public class sample {

	public static void main(String[] args) {
		// 
		 int g=0;
		String se = "sudheer";
		char ce[] = se.toCharArray();
		
		for(int i=0;i<ce.length;i++) 
		{ 
			g++; 
		}
        for(int i=g-1;i>=0;i--) 
        { 
        	System.out.println(ce[i]);
        }
	}

}
package sudheer;

public class sample {

	public static void main(String[] args) {
		// 
		 int g=0;
		String se = "sudheer";
		char ce[] = se.toCharArray();
		
		for(int i=0;i<ce.length;i++) 
		{ 
			g++; 
		}
        for(int i=g-1;i>=0;i--) 
        { 
        	System.out.println(ce[i]);
        }
	}

}
=========================================================================================== 
what is immutable ? 

immutable means the value will not change when you perform any operations 
eg :String  
    String se = "Information";
		se.toUpperCase();
		System.out.println(se.toUpperCase());
		System.out.println(se);
    in the above sample code the string se will not change until you assign it to another string variable