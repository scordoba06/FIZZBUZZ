/**
 * 
 */
package FIZZBUZZ;

public class index {

	public static void main(String[] args) {
		int contador=1;
		while(contador<=100) {
			if (contador % 3 == 0 && contador % 5 == 0)
			{
				System.out.println("fizzbuzz");
			}
			else if(contador % 3 == 0)
			{
				System.out.println("fizz");
			}
			else if(contador % 5 == 0)
			{
			
				System.out.println("buzz");
			}
			else {
				System.out.println(contador);
			}
			contador++;
	
	}

}
}
