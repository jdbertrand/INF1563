package exercices;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 8; 
	     int width = 10;
	     String board = "";

	     for (int y = 0; y < height; y++) {   
	    	   for (int x = 0; x < width; x++)
	    	   {
	    	     if (x == width - 1) {
	    	       board += "\n";
	    	     } else if ((x + y) % 2 == 0){
	    	       board += " ";
	    	     }
	    	     else {
	    	       board += (char)9632;
	    	     }
	    	   }
	    	}
	     

	     System.out.print(board);
	}

}
