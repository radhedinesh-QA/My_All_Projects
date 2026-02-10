package stringProgramms;

public class Palandrom_String_logic_1 {
	public static void main(String[] args) {
		String str = "HiiamDineshChigariiragihChseniDmaiiH";
		char[] ch = str.toCharArray();
		String res ="";
		for(int i =0;i<ch.length;i++)
		{
			res+=ch[i];
		}
		if(str==res)
		{
			System.out.println("String is palandram");
		}
		else
		{
			System.out.println("String not palandram");
		}
	}
}
