package td8;

public class Division {
	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (i % j == 0 || j % i == 0)
					System.out.print("x ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
