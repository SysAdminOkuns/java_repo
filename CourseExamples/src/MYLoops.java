
public class MYLoops {
	int x = 0;

	public void loopsy() {
//		While loop
		System.out.println("while...loop:-");
		while (x <= 20) {
			if (x % 2 == 0) {
				System.out.print(x + "\t");
			}
			x++;
		}
		System.out.println();
		this.x = 0;
		System.out.println("do..while loop:-");

		// do...while loop
		do {
			if (x % 2 == 0) {
				System.out.print(x + "\t");
			}
			x++;
		} while (x <= 20);

		System.out.println();
		this.x = 0;
		System.out.println("for...loop:-");

		// for loop
		for (int x = 0; x <= 20; x++) {
			if (x % 2 == 0) {
				System.out.print(x + "\t");
			}
		}
	}

	public void loopContinueBreakLabel() {
//		Understanding the use of break with loops
//		while(true) {
//			if(this.x > 3) {
//				break;
//			}
//			System.out.println(this.x++);
//		}

//		Understanding the use of continue with loops.
//		for(int x = 0; x <= 100; x++) {
//			if(x % 7 == 0) {
//				continue;
//			}
//			System.out.println(x + " is not divisible by 7");
//		}
//		
//		Understanding the use of labels
		outer_loop:
		while (true) {
			int z = 0;
			while (true) {
				if (z >= 10) {
					break outer_loop;
				}
				System.out.println(z++);
			}
		}
	}
}
