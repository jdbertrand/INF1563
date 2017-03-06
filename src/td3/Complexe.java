package td3;

public class Complexe {

  private double re;
  private double im;
  
  public Complexe(double re, double im){
    this.im = im;
    this.re = re;    
    
  }
  
  public double getReel(){
    return re;
  }
  
  public double getImag(){
    return im;
  }

  public static Complexe additionner(Complexe c1, Complexe c2){
    //additionner(Complexe); (a+bi) + (c+di) = (a+c) + (b+d)i
    return new Complexe(c2.re + c1.re, c1.im + c2.im);
  }
  
  public Complexe additionner(Complexe c2){
    return additionner(this, c2);
  }
  
  public static Complexe soustraire(Complexe c1, Complexe c2){
    return new Complexe(c1.re - c2.re, c1.im - c2.im);
  }
  public Complexe soustraire(Complexe c2){
    //soustraire(Complexe); (a+bi) - (c+di) = (a-c) + (b-d)i
     return soustraire(this, c2);
  }
  
  /*public static Complexe multiplier(Complexe c1, Complexe c2){
    return new Complexe(c1.);
  }
  public Complexe multiplier(Complexe re, Complexe im){
    //multiplier(Complexe); (a+bi) * (c+di) = (ac - bd) + (ad + bc)i
    
    return 0;
  }
  */
  public String toString() {
    String s = "" + re;
    if (im > 0.0)
        s = s + '+';
      s = s + im + 'i';
      
      return s;
    
  }
  public static void main(String[] args) {
    
    Complexe c = new Complexe(3, 5);
    Complexe d = new Complexe(2, -2);
    
    System.out.println("new Complexe(3,5) = " + c.toString());
    
    System.out.println("new Complexe(3,5).getReel() = " + c.getReel());
    System.out.println("new Complexe(3,5).getImag() = " + c.getImag());

    /*System.out.println("new Complexe(3,5) + new Complexe(2,-2) = " + c.additionner(re, im));
    System.out.println("new Complexe(3,5) + new Complexe(2,-2) = " + c.soustraire(re, im));
    System.out.println("new Complexe(3,5) + new Complexe(2,-2) = " + c.multiplier(re, im));*/
    
    
  }
}
