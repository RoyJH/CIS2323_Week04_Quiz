import java.util.Scanner;
public class MakeAPerson {
	public static void main(String[] args){
		String first;
		String last;
		int a;
		char s;
		
		Scanner inputDevice = new Scanner (System.in);
		Person person1 = new Person();
		
		System.out.println("Hello there, give me the name of a person.");
		System.out.println(" Type in a first name:");
		first = inputDevice.nextLine();
		person1.setFirst(first);
		System.out.println(" Type in a Last name:");
		last = inputDevice.nextLine();
		person1.setLast(last);
		System.out.println("How old are they?");
		System.out.println(" Enter an age (number):");
		a = inputDevice.nextInt();
		person1.setAge(a);
		System.out.println("Are they male or female?");
		System.out.println(" Enter 'M' for male or 'F' for female:");
		s = inputDevice.next().charAt(0);
		person1.setSex(s);
		System.out.println(person1.getPersonInfo());
	}
}