
public class NotPointerExp {

	public static void main(String[] args) {
		Math m = null;
	    double result = m.floor(28.15); // Confusing code, but it works.
	    double result1 = Math.floor(28.15);
//		 String s = null;
//		    s = s.toUpperCase(); // Oops! s is null!
	}

}
