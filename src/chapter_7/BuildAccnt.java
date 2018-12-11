package chapter_7;

import static java.lang.System.out;

public class BuildAccnt {

	public static void main(String[] args) {
		ClassExample my_account = new ClassExample();		// import my acct
		ClassExample your_account = new ClassExample();		// import your acct
		
		// dot notation to access the fields in Class Examples
		my_account.name = "Chloe Spilker";
		your_account.name = "Gargion Brandibus";
		
		my_account.address = "136 Lakeview";
		your_account.address = "221 Coccyx Ave";
		
		my_account.balance = 232342542.45;
		your_account.balance = 1337;
		
		my_account.phone = "(123)456-7890";
		your_account.phone = "(ABC)DEF-GHIJ";
		
		// prints assigned values
		out.println(my_account.name + "\t\t" + your_account.name);
		out.println(my_account.address + "\t\t" + your_account.address);
		out.println(my_account.balance + "\t\t" + your_account.balance);
		out.println(my_account.phone + "\t\t" + your_account.phone);

	}

}
