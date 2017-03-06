package td6;

public class PlusPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		int x=1, y=3, z=5, total=10;
		
		total = total + x;
		//ou 
		total += x;

		z = x + y;
		y++;
		//ou
		z = x + y++;
		
		x--;
		total = total - x;
		//ou
		total -= --x;
		
		int modulo = x%y;
		x = modulo;
		//ou
		x %= y;
		
		
		
	}

}
