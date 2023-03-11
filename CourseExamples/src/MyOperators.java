
public class MyOperators {
	int x = 8; // 0000 0000 0000 0000 0000 0000 0000 1000 in binary 32bits or 8 in decimal
	int y = -8; // 1111 1111 1111 1111 1111 1111 1111 1000 in binary 32bits or -8 in decimal

	public void bitShift() {
//		signed shift operator >> (moving right), << (moving left), unsigned shift operator <<<(moving left) or  (moving right)>>>
		x >>= 1; // 0000 0000 0000 0000 0000 0000 0000 0100 in binary 32bits or 4 in decimal
		x = x >>> 2; // 0000 0000 0000 0000 0000 0000 0000 0001 in binary 32bits or 4 in decimal
//		x = x << 3;// 0000 0000 0000 0000 0000 0000 0000 1000 in binary 32bits or 8 in decimal
		System.out.println(x);

		y >>= 1; // 1111 1111 1111 1111 1111 1111 1111 1100 equal to -4
//		y >>= 2; // 1111 1111 1111 1111 1111 1111 1111 1111 equal -1
		y >>>= 2; // 0011 1111 1111 1111 1111 1111 1111 1111 equal 1073741823
		System.out.println(y);
	}

	public void bitwise() {
		int x = 8; // 0000 0000 0000 0000 0000 0000 0000 1000
		int y = 10; // 0000 0000 0000 0000 0000 0000 0000 1010

		int and = x & y; // 0000 0000 0000 0000 0000 0000 0000 1000 or decimal 8
		System.out.println(and);
		int or = x | y; // 0000 0000 0000 0000 0000 0000 0000 1010 or decimal 10
		System.out.println(or);
		int xor = x ^ y; // 0000 0000 0000 0000 0000 0000 0000 0010 or decimal 2
		System.out.println(xor);
		int complement = ~x; // 1111 1111 1111 1111 1111 1111 1111 01111 or -9
		System.out.println(complement);
	}

	public boolean isHome() {
		System.out.println("Calling isHome() method.");
		return true;
	}

	public boolean isSleeping() {
		System.out.println("Calling isSleeping() method");
		return false;
	}

//	public void boolA() {
//		if(this.isSleeping() | this.isHome()) {
//			System.out.println("JJ is chillaxing...");
//		}
//	}

//	public void boolA() {
//		if(this.isSleeping() & this.isHome()) {
//			System.out.println("JJ is chillaxing...");
//		}
//	}

//	public void boolA() {
//	if(this.isSleeping() && this.isHome()) {
//		System.out.println("JJ is chillaxing...");
//	}
//}

	public void boolA() {
		if (this.isSleeping() || this.isHome()) {
			System.out.println("JJ is chillaxing...");
		}
	}
//	public void testStringNull() {
//		String str = null;
//		System.out.println(str.trim().length();
//	}

	public void testStringNull(String s) {
		String str = s;
		if (str != null && str.trim().length() > 0) {
			System.out.println(str);
		}
	}

	public void incrementVal() {
		int x = 0;
//		x++ [old value is 0; new value is 1; return old value]
		System.out.println("for x++ post increment is: " + x);
		System.out.println("returning old value for x++ is: " + x++);
		System.out.println("post value of x after increment is: " + x);

		System.out.println();
//		++x [old value is 0; new value is 1; return new value]
		System.out.println("Now the current value of x = " + x);
		System.out.println();
		System.out.println("for ++x pre increment is: " + x);
		System.out.println("returning old value for ++x is: " + ++x);
		System.out.println("pre value of x after increment is: " + x);
	}

	public void ternaryOp(boolean b) {
		boolean boolVal = b;
		String sleeping = boolVal ? "Yes, sleeping" : "No, not sleeping";
		System.out.println(sleeping);
	}

	public void operatorPrecedence() {
		int result = 3 * 2 + 5; // return 11
		int result1 = 3 * (2 + 5); // return 21
		System.out.println(result);
		System.out.println(result1);
	}

	@SuppressWarnings("unused")
	public void otherOperators() {
		boolean courseInSession = true;
		int lectureCount = 150;

//		Logical operators
		if (!courseInSession) {
			System.out.println("Course is not in session.");
		}

//		flip the boolean value.
		courseInSession = !courseInSession;

		if (lectureCount != 150) {
			System.out.println("The lecture count is something other than 150");
		}
		if (lectureCount == 150) {
			System.out.println("The lecture count is 150");
		}
		
		if( lectureCount < 10 ) {
			  System.out.println("Lecture count is less than 10");
			} else if( lectureCount >= 20 && lectureCount <= 30 ) {
			  System.out.println("Lecture count is between 20 and 30 [inclusive]");
			} else if( lectureCount > 100 ) {
			  System.out.println("Lecture count is 101 or greater.");
			}
		
//		if(10 % 2 == 0) {
//					//(10 / 2 == 5 with a remainder of 0)
//					System.out.println("10 / 2 == 5 with a remainder of 0");
//				}
//	
//
//				if(10 % 4 == 2) { 
//					//(10 / 4 == 2 with a remainder of 2)
//					System.out.println("10 / 4 == 2 with a remainder of 2");
//					return;	
//				}
		
		int x= 0;
		x = x + 5; 
		x += 5;
		System.out.println(x);
		
//		Other Arithmetic examples
		x -= 5; // Same as x = x - 5;
		System.out.println(x);
		x *= 5; // Same as x = x * 5;
		System.out.println(x);
		x /= 5; // Same as x = x / 5;
		System.out.println(x);
		x %= 5; // Same as x = x % 5;

	}
}
