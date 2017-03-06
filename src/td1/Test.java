package td1;

public class Test {
  public static void afficherSomme(int i, int j) {
    i = i + j;
    System.out.println(i);
  }
  
  public static void main(String[] args) {
    int k = 1, m = 2;
    afficherSomme(k, m);
    System.out.println(k); // k == 1
  }
}
