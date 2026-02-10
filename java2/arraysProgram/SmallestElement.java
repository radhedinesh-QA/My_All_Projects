package arraysProgram;

public class SmallestElement {
public static void main(String[] args) {
	int [] a = {20,10,40,30,60,05};
	int small = a[0];
	for (int i = 0;i<a.length;i++)
	{
		if(a[i]<small)
		{
			small =a[i];
		}
	}
	System.out.println(small);
}
}
