import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 Your expected result:
 
 1.True
 2.False
 3. False
 4.True
 
 5.False
 6.True
 7.True
  
 */
public class P3_ConditionalExpressions {

	public static void main(String[] args) {
		int x = 4;
		int y = -3;
		int z = 4;

		// Replace "YOUR EXPRESSION HERE" with the expression you're validating
		System.out.println("Expression evaluates to: " + ("YOUR EXPRESSION HERE"));

		if (x == 4) {
			System.out.println("The test was TRUE");
		} else {
			System.out.println("The test was FALSE");

		}
		if (x != z) {
			System.out.println("The test was TRUE");
		} else {
			System.out.println("The test was FALSE");
		}

		if (z == y) {
			System.out.println("The test was TRUE");
		} else {
			System.out.println("The test was FALSE");
		}

		if (x + y > 0) {
			System.out.println("The test was TRUE");
		} else {
			System.out.println("The test was FALSE");
		}
		if (y * y <= z) {
			System.out.println("The test was TRUE");
		} else {
			System.out.println("The test was FALSE");

			if (y/y == 1) {
				System.out.println("The test was TRUE");
			} else {
				System.out.println("The test was FALSE");
			}
			if (x * (y+2) > y - (y+z) * 2) {
				System.out.println("The test was TRUE");
			} else {
				System.out.println("The test was FALSE");
		}
	}
}
}