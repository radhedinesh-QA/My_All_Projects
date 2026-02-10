package stringProgramms;

public class Palandrom_String_logic_2 {
	public static void main(String[] args) {
		String str = "HiiamDineshChigariiragihChseniDmaiiH";
		int len = str.length()-1;
		boolean ispalandrom = true;
		for(int i= 0;i<=len/2;i++)
		{
			if(str.charAt(i)!=str.charAt(len-i))
			{
				ispalandrom=false;
				break;
			}
		}
		if(ispalandrom)
		{
			System.out.println("Given String is palandrom");
		}
		else
		{
			System.out.println("Given String is not palandrom");
		}
	}
}
