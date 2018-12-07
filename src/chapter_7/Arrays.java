package chapter_7;

import static java.lang.System.out;

public class Arrays {

	public static void main(String[] args) {
		String[] game_list = {"Skyrim", "Professor Layton & the Curious Village", 
				"Dungeons & Dragons", "Minecraft", "Oblivion", "Star Wars Legos", 
				"Mario Cart", "Guitar Hero", "Cooking Mama", "Princess Maker 2"};
		
		// top 5
		for (int i = 0; i<5; i++) {
			out.println(game_list[i]);
		}
		
		out.println();
		
		// top 3
		for (int i = 0; i<3; i++) {
			out.println(game_list[i]);
		}
		
		out.println();
		
		// last 3
		for (int i = 9; i>6; i-- ) {
			out.println(game_list[i]);
		}
		
		out.println();
		
		// middle 5
		for (int i = 2; i < 7; i++) {
			out.println(game_list[i]);
		}
		
		// decalring an array
		// elementtype[] arrrayRefVar
		
		double[] nums;					// declare array
		nums = new double[100];			// declare size of array
		out.println("\n" + nums[1]);	// automatically assigns value acc to size
		
		char[] char_list = new char[10];// space char is placeholder
		out.println(char_list[0]);
		
		int[] int_list = new int[11];
		out.println(int_list[0]);		// 0 is placeholder
		
		boolean[] boo_list = new boolean[10];
		out.println(boo_list[0]);		// false is placeholder
		
		nums[0] = 2.5;
		nums[1] = 3.7;
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Math.random() * 100;
			out.println(nums[i] + " ");
		}
		
		out.println("\n" + nums);		// memory location of the stored numbers
		
		int x = nums.length;
		out.println(x);
		
		char[] char_char = {'s', 'a', 'v', 'e', ' ', 'm', 'e'};
		out.println("\n" + char_char);
		
		// prints total of list nums
		double total = 0;
		for (int i = 0; i<nums.length; i++) {
			total = total+nums[i];
		}
		out.println("\n" + total);
		
		// new int list
		int[] my_list = new int[10];
		for (int i = 0; i < 10; i++) {
			my_list[i] = (int) (Math.random() * 100);
		}
		
		// finds 5 in list
		for (int i = 0; i < 10; i++) {
			if (my_list[i] == 5) {
				out.println("true");
				break;
			} else {
				out.println("false");
			}
		}
		
		// getting the smallest number in list
		int min = my_list[0];
		for (int i = 0; i < my_list.length; i++) {
			if (my_list[i] < min) {
				min = my_list[i];
			}
		}
		
		out.println("\n" + min);
		
		// getting the largest number in list
		int max = my_list[0];
		for (int i = 0; i < my_list.length; i++) {
			if (my_list[i] > max) {
				max = my_list[i];
			}
		}
			
		out.println(max + "\n");
		
		// prints list
		for (int i = 0; i < my_list.length; i++) {
			out.println(my_list[i]);
		}
		
		
		// i have ABSOLUTELY no idea -- sorts it...?
		int[] new_my_list = new int[10];
		for (int i = 0; i < my_list.length; i++) {
			new_my_list[i] = i;
		
		}
		
		out.println();
		
		for (int i = new_my_list.length - 1; i > 0; i--) {
			int j = (int)(Math.random()*i+1);
			int temp = new_my_list[i];
			new_my_list[i] = new_my_list[j];
			new_my_list[j] = temp;
		}
		
		out.println();
		
		for (int i = 0; i < my_list.length; i++) {
			out.println(new_my_list[i]);
		}
		
		out.println();
		
		// for each loop -- for every integer in loop, print
		for (int e: new_my_list) {
			out.println(e);
		}
		
		
		
		
		
		
		
		
		
	}

}
