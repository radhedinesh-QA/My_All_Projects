package basicJavaProgram;

public class MEthodOverloading {
/** To achieve method over loading we should satisfy any of one as below
 * no.of formal arguments should be different
 * data type of formal argument should be different
 * sequence of data type should be different.
 * In Class having multiple methods with same name but change in formal
 *  argument is called method overloading. 
 */
	public static void cal()
	{
		System.out.println("No data provided");
	}
	public static void cal (int a )
	{
		
		System.out.println("Given value:" + a );
	}
	public static void cal (int a, int b)
	{
		System.out.println( a+b+ " is sum of a and b" );
	}
	
	public static void main(String[] args) {
		cal();
		cal(10);
		cal(10,30);
	}
}
