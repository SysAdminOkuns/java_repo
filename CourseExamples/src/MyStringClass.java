import java.util.Calendar;
import java.util.Locale;
import java.io.Console;

public class MyStringClass {
//	java.lang.String (Immutable String that String literals and String object Type)
// StringBuffer and StringBuilder (They are mutable class for strings).
//	StringBuffer is thread safe whereas StringBuilder is not thread-safe.

	String str = new String("      Hello World");
	Console cnsl = System.console();
	String name;
	{
		if (cnsl == null) {
			System.out.println("No console available");
		}
		// ReadLine
		name = cnsl.readLine("Please, enter your name: ");
	}

	public void mySubStr() {
		String nStr = " additional text was added.";
		String trimmedStr = str.trim();
		System.out.println(trimmedStr);

		String subStr = trimmedStr.substring(5, 11);
		System.out.println(subStr);

		String upper = trimmedStr.toUpperCase();
		System.out.println(upper);

		char c = trimmedStr.charAt(10);
		System.out.println(c);

		trimmedStr += nStr;
		System.out.println(trimmedStr);
	}

//	String concatenation without StringBuilder
	public String strBuilderVerOne() {
		String message = "Hello, ";
		message += this.name;
		message += ". Today is ";
		message += Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
		message += ".";

		return message;
	}
	
//	String concatenation with StringBuilder
	
	public String strBuilderVerTwo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello, ");
		sb.append(this.name);
		sb.append(". Today is ");
		sb.append(Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, 
				Calendar.LONG, Locale.US));
		sb.append(".");
		return sb.toString();
	}

	public void concatOperationStr() {
		int employeeId = 2812;
		int deptId = 98;
		System.out.println(employeeId + deptId); // Prints 2910
		System.out.println(employeeId + ":" + deptId); // Prints 2812:98
		System.out.println(employeeId + deptId + ":" 
		+ employeeId + deptId); // The line above prints 2910:281298
	}
	
//	Passing by value using primitive

}
