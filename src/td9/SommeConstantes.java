package td9;

public class SommeConstantes {

	private final static double EPS = 0.00001;
	private final static double MAX = 100000;

	public static void main(String[] args) {
		double results;
		double counter = 1;
		for (counter; 100000; counter++){
			
			results = results + (counter * EPS);
		}
		System.out.println(results);
		
		double counter2=MAX;
		double results2;
		do{
			results2 = results2 + (counter2 * EPS);
		}while (counter2 > 0);
		
		System.out.println(results2);
	}

}
