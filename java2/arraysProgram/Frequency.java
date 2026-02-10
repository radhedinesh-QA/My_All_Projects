package arraysProgram;

public class Frequency {
	public static void main(String[] args) {
		int a [] = {10,20,30,50,60,20,10,20,40,60};
		boolean [] b = new boolean [a.length];
		
		for (int i =0; i<a.length;i++)
		{
			if(b[i]==false)
			{
				int count =0;
				for (int j = 0; j<a.length;j++)
				{
					if(a[i]== a[j])
					{
						count++;
						b[j]=true;
					}
				}
					System.out.println(a[i]+"==>"+ count);
			}
		}
	}
}
