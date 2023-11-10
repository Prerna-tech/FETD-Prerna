
import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

			Scanner scn = new Scanner(System.in);

			System.out.println("Enter a num");

			int n = scn.nextInt();

			if(n%2==0) {

				n+=1;
			}

			int st = 1;

			int sp = n / 2;

			String s = "FORMULAQSOLUTIONS";

			int n1 = 0;

			int n2 = n1;

			for (int i = 1; i <= n; i++) {

				int k = 0;

				boolean flag = true;

				for (int j = 1; j <= sp; j++)

					System.out.print(" ");

				int p = n1;

				int h = n2;

				for (int j = 1; j <= st; j++) {

					if (p < s.length()) {

						System.out.print(s.charAt(p));

						p++;

						flag = false;

					}else {

						if (!flag) {

							System.out.print(s.charAt(k));

							k++;

						} else {
							System.out.print(s.charAt(h));
							h++;

						}
                                        }

				}

				if (flag)

					n2++;

				n1++;

				System.out.println();

				if (i <= n / 2) {

					sp--;

					st += 2;

				} else {

					sp++;

					st -= 2;

				}

			}

		}
}
