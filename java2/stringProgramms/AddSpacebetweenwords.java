package stringProgramms;

public class AddSpacebetweenwords {
	public static void main(String[] args) {
		
		String s = "iamworkingatopentext";
		char [] ch = s.toCharArray();
		for ( int  i = 0; i<ch.length; i++)
		{
			System.out.println(ch[i]+" "+ i+ " ");
		}

		/** Let's say: "i" (1), "am" (2), "working" (7), "at" (2), "opentext" (8)
		String result = s.substring(0, 1)+" "+ s.substring(1, 3)+" "+ s.substring(3, 10)+
				" "+ s.substring(10, 12)+" "+ s.substring(12);
		System.out.println(result); **/
	}
}
