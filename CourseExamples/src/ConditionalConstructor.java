import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConditionalConstructor {

	boolean inMaryland = false;
	boolean otherState = true;
	int myAge = 45;
	String message;
	int age;
	String otherMessage;

	public void testState() throws Exception {
		if (inMaryland) {
			System.out.println("Welcome to Maryland");
		} else if (otherState) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please, enter the state you are currently in: ");
			String currentState = reader.readLine();
			System.out.println("Welcome to " + currentState);
		} else {
			System.out.println("You are outside the US!");
		}
	}

	public void otherCond() {
//		boolean literal
		if (true) {
			System.out.println("I am in this literal boolean block!");
		}
//		boolean operator (>= is 'greater than or equal to")
//		Variable Scope
		if (myAge >= 40) {
			message = "You are 40 or older!";
		}
		System.out.print(message);
	}

//	boolean return value from a method
	public boolean doSomething() {
		return true;
	}

	public void randomExample() {
		if (age >= 25)
			message = "25 years or older.";
		otherMessage = "More text..."; // LINE A will always be executed because of lack of curly bracket.

		if (age >= 25)
			message = "25 years or older.";
		else
			message = "Younger than 25.";
		otherMessage = "More text..."; // LINE A

//	        if (age >= 25) 
//	            message = "25 years or older.";
//	            otherMessage = "More text..."; // ILLEGAL
//	        else if (age >= 20) 
//	            message = "Between 20 years and 24 years old";
//	            otherMessage = "More text..."; // ILLEGAL
//	        else
//	            message = "Younger than 20.";
//	            otherMessage = "More text..."; // LEGAL
	}

	public void testSwitchValue() {
//	Switch statements test for int,short, char, String
		String str, day = "other time";
		int j = 1, val = 3;

		switch (j) {
		case 1:
			str = "one";
			break;
		case 2:
			str = "two";
			break;
		case 3:
			str = "three";
			break;
		case 4:
			str = "four";
			break;
		default:
			str = "Unknown";
			break;
		}
		System.out.println(str);

		switch (day) {
		case "a.m":
			System.out.println("Good morning");
			break;
		case "p.m":
			System.out.println("Good evening");
			break;
		default:
			System.out.println("Good day");
			break;
		}

		switch (val) {
		case 2:
		case 4:
			System.out.println("Even value!");
			break;
		case 1:
		case 3:
			System.out.println("Odd value!");
			break;
		default:
			System.out.println("Out of range!");
			break;

		}

		switch ('a') {
		case 'a':
			System.out.println("This is a character a ");
			break;
		default:
			System.out.println("Any other character from b-z");
			break;
		}
	}

	public void doSomething(boolean isTrue) {
		if (isTrue) {
			return; // Exits the entire method
		} else {
			// Do some work...
			System.out.println("I am in this false code block!");
		}
		// Do some work if we didn't already return out of the method...
	}

	public void doSomething(int someVariable) {
//		Difference between using the return vs break.
		switch (someVariable) {
		case 0: {
			System.out.println("Status Code 0");
			return; // exits the entire method
		}
		case 1: {
			// Do some work...
			System.out.println("Status Code 1");
			break; // exits the switch
		}
		case 2: {
			// Do some work...
			System.out.println("Status Code 2");
			break; // exits the switch
		}
		}
		// If we didn't return out of the method
		// do some more work...
		System.out.println("We are outside of the switch statement.");
		
//		Variable Scope
//		switch (someVariable) {
//		  case 0: {
//		  String msg = "Hello!"; // Declaration (rather than reference)
//		  break;
//		  }
//		}
//		System.out.println(msg); // ILLEGAL
		
		String msg = null; // Declaration
		switch (someVariable) {
		  case 1: { // set the case to 0 or 1 to see the effect of the msg variable.
		  msg = "Hello!"; // Reference
		  break;
		  }
		}
		System.out.println(msg); // Legal
		
//		Completely illegal, note only the case and default statement are allowed in scope of the switch statement.
//		switch (someVariable) {
//		  String msg = "Hello"; // ILLEGAL
//		  case 0: {
//		  msg = "Hello!";
//		  break;
//		  }
//		  default: {
//		  msg = "Hey!";
//		  break;
//		  }
//		}
	}
}
