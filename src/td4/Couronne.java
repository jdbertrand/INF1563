package td4;


public class Couronne{
  
  private double petitRayon;
  private double grandRayon;
  private double pointX;
  private double pointY;
  
  public Couronne(double ptX, double ptY, double pr, double gr){
    this.petitRayon = pr;
    this.grandRayon = gr;
    this.pointX = Math.abs(ptX);
    this.pointY = Math.abs(ptY);
    
  }

  public static boolean isInsideCircle(Couronne c){
    
    //(x - center_x)^2 + (y - center_y)^2 < radius^2
    
    boolean insideBigCircle = Math.pow(c.pointX, 2) + Math.pow(c.pointY, 2) < Math.pow(c.grandRayon, 2);
    boolean outsideSmallCircle = Math.pow(c.pointX, 2) + Math.pow(c.pointY, 2) > Math.pow(c.petitRayon, 2);
    
    boolean isInsideCircle = insideBigCircle && outsideSmallCircle;
    
    return isInsideCircle;
  }
  
  
  public static void main(String[] args) {
    
    Couronne c = new Couronne(10,5,8,12);
  
    System.out.println("Point X: " + (int)c.pointX);
    System.out.println("Point Y: " + (int)c.pointY);
    System.out.println("Petit R: " + (int)c.petitRayon);
    System.out.println("Grand R: " + (int)c.grandRayon);
    System.out.println("Les coordonnées sont dans la couronne: " + isInsideCircle(c));
    
    
  }



}
