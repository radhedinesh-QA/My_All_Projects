package stringProgramms;

public class PallandromeStringwithStringBuilder {
public static void main(String[] args) {
	String st = "level";
	StringBuilder sub = new StringBuilder(st).reverse();
	if (st.equals(sub.toString()))
		System.out.println("Pallandrome String " );
	else
		System.out.println("Not Pallandrome String ");
	
}
}
