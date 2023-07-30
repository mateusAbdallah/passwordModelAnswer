import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		passwordModel();
	}

	static void passwordModel() {
		Scanner input = new Scanner(System.in);

		String aString = "";
		final int UPPER = 2;
		final int LOWER = 2;
		final int DIGIT = 1;
		final int COUNT = 6;
		StringBuilder strBuild = new StringBuilder("!@#$%^&*()-+?_=,<>/");
		boolean detect = false;
		int upper = 0;
		int lower = 0;
		int digit = 0;
		int count = 0;

		while(upper < UPPER || lower < LOWER || digit < DIGIT || aString.length() < 6 || detect == false) {
			System.out.println("Enter the password");
			aString = input.nextLine();
			for(int i = 0; i < aString.length(); i++) {
				char ch = aString.charAt(i);
				String cha = String.valueOf(ch);
				count++;

				if(Character.isUpperCase(ch)) {
					upper++;
				}
				else if(Character.isLowerCase(ch)) {
					lower++;
				}
				else if(Character.isDigit(ch)) {
					digit++;
				}
				else if(strBuild.toString().contains(cha)) {
					detect = true;
				}

			}


			if(upper >= UPPER && lower >= LOWER && digit >= DIGIT && aString.length() >= 8 && detect == true) {
				System.out.println("Valid password");
			}
			else {
				System.out.println("The password does not have the following");
			}

			if(upper < UPPER) {
				System.out.println("* uppercase letters *");
				System.out.println("It has " + upper + " uppercase letters, you should enter at least 2");
			}

			if(lower < LOWER) {
				System.out.println("* lower letters *");
				System.out.println("It has " + lower + " lower letters, you should enter at least 2");
			}

			if(digit < DIGIT) {
				System.out.println("* digits *");
				System.out.println("It has " + digit + " digits");
			}

			if(aString.length() < COUNT) {
				System.out.println("Minimum password length should be 6");
			}

			if(detect == false) {
				System.out.println("* special characters *");
				System.out.println("It has no special characters, you should enter at least 1");
			}

			upper = 0;
			lower = 0;
			digit = 0;
			count = 0;
		}
	}

}
