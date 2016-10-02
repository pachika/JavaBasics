
//import java.lang.*;
//IMMUTABLE OBJECTS
/*STRINGS-- Bcz in string pool, Multiple strings point to same value 2 save space
It explains the resource pool, When a string is updated, the object or reference here(S)
is updated to 
new location i.e the object points to new location but not the string value is not updated.*/

public class String_test {
	private static final String aaa = null;

	public static void main(String argv[])
	{
		String str1 = "ABC"; 
		String s2 = str1.toLowerCase();
		str1 = s2;
		System.out.println(str1);
		String s = "a" + "bc";
	    String t = "ab" + "c";
	    System.out.println(s == t); //True
	    System.out.println(s);
		s = "cdc" ;
	    s.toUpperCase();
	    System.out.println(s);
	}
}
