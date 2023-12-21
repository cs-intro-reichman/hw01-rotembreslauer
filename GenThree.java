/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int maxRange = Math.max(a, b);
        int minRange = Math.min(a, b);
        
        int randomNumber1 = (int)(Math.random() * (maxRange - minRange)) + minRange;
        int randomNumber2 = (int)(Math.random() * (maxRange - minRange)) + minRange;
        int randomNumber3 = (int)(Math.random() * (maxRange - minRange)) + minRange;

        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);

        int i = Math.min(randomNumber1, Math.min(randomNumber2, randomNumber3));

        System.out.println("The minimal generated number was " + i);

        //prints
       
	}
}
