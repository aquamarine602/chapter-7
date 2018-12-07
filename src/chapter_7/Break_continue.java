package chapter_7;

//ACTUALLY CHAPTER 6


import static java.lang.System.out;

public class Break_continue {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		while(true) {
			num++;
			if (num == 10 || num == 11) {
				continue;
			}
			sum += num;
			out.println(num);
		}

	}
	
	
	
	/**
	 * 2
	 * 3
	 * 4
	 * 7
	 * 10
	 * 
	 * 1 true
	 * 5 false
	 * 6 45
	 * 8 true
	 * 9 true
	 * 
	 * 11
1bb
1bb3bb
1bb3bb9bb
1bb3bb9bb27bb

	 *12
int i = 100;

int j = 1;

double sol = 0;

while(i > 0) {

sol = i/j;

out.println(i + "/" + j + " = " + sol);

i--;

j++;

}
	 *
	 *13
	 *
	 *
	 */

}
