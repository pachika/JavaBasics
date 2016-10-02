/*
 * This program is used to demonstrate if java is pass by value 
 * When an object is passed, The memory location which it stores is passed. therefore java is pass by value
 */
public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test Test_obj = new Test();
		Test Test_obj2 = new Test();
		PassByValue PassByValue_obj = new PassByValue();
		PassByValue_obj.Method(Test_obj);
		PassByValue_obj.Method(Test_obj2);
	}

	public void Method(Test Test_obj2)
	{
		System.out.println("I am object:"+Test_obj2);
		System.out.println(Test_obj2);
	}
}

 class Test{

	 int a =10; 
	 String s="I am string"; 
}