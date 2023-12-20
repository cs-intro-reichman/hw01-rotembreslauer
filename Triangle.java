/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
		public class Triangle{
    public static void main(String[] args) {
        Integer a = Integer.parseInt(args[0]);
        Integer b = Integer.parseInt(args[1]);
        Integer c = Integer.parseInt(args[2]);

        boolean i = ((a + b) > c && (a + c) > b && (b + c) > a);
           System.out.println(a + " , " + b + " , " + c +": " + i);
     
    
	}
}
