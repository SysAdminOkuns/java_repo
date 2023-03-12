
public class VarDeclaration {

	/*
	 * boolean = 1 bit byte = 8 bits char = 16 bits short = 16 bits int = 32 bits
	 * float = 32 bits long = 64 bits double = 64 bits
	 * 
	 * Default values: boolean = false; byte, short, int, long = 0; float, double
	 * =0.0' char = '\u0000';
	 * 
	 */
//	Wide vs narrow conversion
//Effect of overflow vs underflow
//	
//	narrow conversion with type casting
//	Field value range 128, 129, 130,... and see the effect.
	int x = 128;
	byte y = (byte) x;

//	Wide conversion
	short x1 = 200;
	int y1 = x1;

	public void returnY() {
		System.out.println(y);
	}

	public void returnY1() {
		System.out.println(y1);
	}

}
