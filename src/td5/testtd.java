package td5;


public class testtd {


    class Base {
    int i = 3;
    }

    class Derivee extends Base {
    int i = 4;

    public void main(String args[]) {    
      Derivee d = new Derivee();
    d.i = 7;
    d.printI();
    }
    void printI(){
    System.out.println(super.i);
    System.out.println(this.i);
    System.out.println(i);
    }
    }
  
}
