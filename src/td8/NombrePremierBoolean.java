package td8;

public class NombrePremierBoolean {

	public static boolean[] NombrePremierBoolean(int limit) {
		assert limit >= 2;

		final boolean[] nonPrimes = new boolean[limit];
		nonPrimes[0] = true;
		nonPrimes[1] = true;

		int sqrt = (int) Math.sqrt(limit);
		for (int i = 2; i <= sqrt; i++) {
			if (nonPrimes[i])
				continue;
			for (int j = i; j < limit; j += i) {
				if (!nonPrimes[j] && i != j)
					nonPrimes[j] = true;
			}
		}
		return nonPrimes;
		
	}

	public static void main(String[] args) {
		NombrePremierBoolean(120);
		
		for (int i = 1; ; i++){
			System.out.println(NombrePremierBoolean[i]);
		}
	}
}
