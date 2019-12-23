import java.util.Arrays;
import java.util.Scanner;

public class anagrams_sample {

	public static void check_anagrams(String s1, String s2) {
		int count = 0;
		if (s1.length() == s2.length()) {
			char tempArray1[] = s1.toCharArray();

			Arrays.sort(tempArray1);
			char tempArray2[] = s2.toCharArray();
			Arrays.sort(tempArray2);
			for (int i = 0; i < tempArray1.length; i++) {
				if (tempArray1[i] == tempArray2[i]) {
					count++;
				}
			}
			if (count == tempArray1.length) {
				System.out.println("Strings are  anagrams");
			} else
				System.out.println("Strings are not anagrams");

		} else {
			System.out.println("both strings are not anagrams");
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("pls enter  first string");
		String s1 = in.nextLine();
		System.out.println("pls enter second  string");
		String s2 = in.nextLine();
		check_anagrams(s1, s2);
		/*
		 * char tempArray1[] = s1.toCharArray(); Arrays.sort(tempArray1);
		 * for(int i=0;i<tempArray1.length;i++) System.out.println(
		 * "after sorting"+tempArray1[i]);
		 */

		/*
		 * System.out.println("second string"); char tempArray2[] =
		 * s2.toCharArray(); Arrays.sort(tempArray2); for(int
		 * i=0;i<tempArray2.length;i++) System.out.println("after sorting"
		 * +tempArray2[i]);
		 */
	}

}
