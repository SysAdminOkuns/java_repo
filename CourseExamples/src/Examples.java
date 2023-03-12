
public class Examples {

	public static void main(String[] args) {
//		Working with variables
//		VarDeclaration vd = new  VarDeclaration();
//		vd.returnY();
//		vd.returnY1();
//
		//		Understanding conditional Construct.
//		ConditionalConstructor cc = new ConditionalConstructor();
//
//		try {
//			cc.testState();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		boolean return value from method
//		if(cc.doSomething()) {
//			System.out.println("I am returning this from a method called doSomething!");
//		}
		
//		cc.testSwitchValue();
//		cc.doSomething(false);
//		cc.doSomething(1);
		
//		Understanding Operators in java
//		Shift operator
		MyOperators op = new MyOperators();
//		op.bitShift();
//		// bitwise operator
//		op.bitwise();
//		
		// Testing &, | operators
//		op.boolA(); // test with "&"
//		op.boolA(); // test with "|"
		// Short Circuiting meaning check the left hand side of the condition is true otherwise don't resolve both sides of the conditions
//		op.boolA(); // test with "&&"
//		op.boolA(); // test with "||"
//		op.testStringNull(); // returns an exception java.lang.NullPointerException meaning it's not pointing to any object in the heap
//		op.testStringNull("Hello World");
//		
//		//Increment
//		op.incrementVal();
//		
//		//Use of ternary operator x = condition? x : y;
//		op.ternaryOp(true); // in the case true
////		op.ternaryOp(false); // in the case false
//		
////		operator Precedence BODMAS or PEMDAS
//		op.operatorPrecedence();
		
		//Logic operator and other operators
//		op.otherOperators();
		
//		Working with loops: while, do...while, for 
//		MYLoops lp = new MYLoops();
////		lp.loopsy();
//		lp.loopContinueBreakLabel();
		
//		Practice Enumeration or Emuns
//		DaysEnum en = new DaysEnum();
//		en.testingEnum();
		
//		Working with the string class
//		MyStringClass strObj = new  MyStringClass();
//		strObj.mySubStr();
//		String testStr = strObj.strBuilderVerOne();
//		System.out.println(testStr);
//		String testStr1 = strObj.strBuilderVerTwo();
//		System.out.println(testStr1);
		
//		Passing by value: Bank class
//		Account myAcct = new Account();
//		double proposedLoan = 250.0;
//		String customerName = "Jason Shapiro";
////		Passing by value using primitive value
////		Bank.ndiscountLoan(proposedLoan);
//		proposedLoan = Bank.ndiscountLoan(proposedLoan);
//		System.out.println(proposedLoan);
//		Bank.debitFee(myAcct);
//		System.out.println(myAcct.balance);
//		
//		Bank.salutation(customerName);
//		System.out.println(customerName);
		
//		Instantiating the Instructor class
		Instructor i =  new Instructor();
		i.sayHello();
		System.out.println(Instructor.str1);
		
//		NOTE: If another Instructor object is instantiated, the static blocks 
//		would be skipped, since that only happens once during the life of the class.
		
	}

}
