import java.util.Scanner;
/**
 * 
 * @author Akira Morales
 * 03 OCT 2018 Homework
 */
public class StringAssignMain {

	public static void main(String[] args) {
		Scanner nameIn = new Scanner(System.in);
		Scanner numIn = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String name = "" + nameIn.nextLine();
		System.out.print("Please enter a 10 digit telephone number: ");
		String number = "" + numIn.nextLong();
		numIn.nextLine();
		
		String sub1 = number.substring(0,3);
		String sub2 = number.substring(3,6);
		String sub3 = number.substring(6);
		
		System.out.printf("%-20s\t (%3s) %3s-%4s", name, sub1, sub2, sub3);

	}

}
