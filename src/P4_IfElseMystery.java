/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 Your expected results after the input is provided:
 
 1.10 > 2
 2.
 3. 
 4.
  
 */
public class P4_IfElseMystery {

	public static void main(String[] args) {
		// Put your call to ifElseMyster2 here
		int a = 10;
		int b = 2;
	}
	
    public static void ifElseMystery(int a, int b) {
        if (a * 2 < b) {
            a = a * 3;
            System.out.println("The test was TRUE");
        } else if (a > b){
            b = b + 3;
            System.out.println("The test was FALSE");
        }
        if (b < a) {
            b++;
            System.out.println("The test was TRUE");
        } else {
            a--;
            System.out.println(a + " " + b);
         
        }
    }

}
