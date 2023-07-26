import java.util.Scanner;

class Builder{
	public static void main(String [] args){
		System.out.println("This is a build tester.");
		System.out.println("Let's test what RunJava does.");
		System.out.println("Ok, now JavaRunner.");
		System.out.println("Lastly, JavaBuildTerminus.");
		System.out.println("Please enter your name:");
		Scanner sc = new Scanner(System.in);

		// read user input
		String name = sc.nextLine();

		System.out.println("Hello " + name + ", this is the terminus feature for Sublime Text.");
	}
}