package basicJavaProgram;

public class MethodRecuresion {
	public static void run(int a , int b) {
		/**method calling itself is called method recursion,
		 * THUS we get stack overflow 
		 * Hence we mention conditional statement to control
		 *  the flow of method calling. when it false method calling stops.
		 **/
		if(a<=b) 
		{
			System.out.println(a);
			a++;
			run(a,b);
		}
	}
	public static void main(String[] args) {
		run(1,10);
	}
}
