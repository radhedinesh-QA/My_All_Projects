package arraysProgram;

public class Rev {
	public static void main(String[] args) {
		int [] a = {10,20,30,40,50,60,70};
		int left =0;
		int right= a.length-1;
		while(left<=right)
		{
			int temp =a[left];
			a[left]=a[right];
			a[right]= temp;
			left++;
			right--;
		}
		for(int o :a)
		{
			System.out.println(o);
		}
	}
}
