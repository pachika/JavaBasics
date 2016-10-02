
public class StaticFinalTest {
		final static int var1 =0;
		static final int var2;
		final int var3;
		static {
		System.out.println("VARiable is "+StaticFinalTest.var1);
		//staticFinalTest.var1 = 8; 
		final int abc =3;
		//System.out.println("VARiable is "+var2);
		// Compilation error The final field ExceptionTest.var cannot be assigned	
		StaticFinalTest obj = new StaticFinalTest();
		var2=8;
		}
		{
		this.var3=10;
		}
		public static void main(String[] args) {
			
			int var3 = 3;

		}
}