package arraysProgram;

public class largestElement {
	public static void main(String[] args) {
		int [] a = {20,10,40,30,60,05};
		int large = a[0];
		for (int i =0; i<a.length;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
		}
		System.out.println(large);
	}
}
