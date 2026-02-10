package arraysProgram;

public class SwipeStringWithoutThirdVariabl {
	public static void main(String[] args) {
		String st = "dinesh";
		String sr = "Chigari";
		st = st +sr;
		sr = st.substring(0,st.length()-sr.length());
		st = st.substring(sr.length());
		System.out.println(st);
		System.out.println(sr);
		
		
	}
}
