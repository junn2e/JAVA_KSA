package cal;

import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		StackPriority st = new StackPriority();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		st.makeStack(str);
		
		scan.close();

	}

}
