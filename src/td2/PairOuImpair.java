package td2;
import java.util.Scanner;
//Exercice No 9


class PairOuImpair 
{
   public static void main(String args[])
   {
     int inputNumber;
     System.out.println("Veuillez entrer un nombre: ");
     Scanner in = new Scanner(System.in);
     inputNumber = in.nextInt();
     boolean resultat = EstPaire(inputNumber);
     System.out.println(resultat);
   }
   
   public static boolean EstPaire(int h)
   {

     if ( h % 2 == 0 )
     {
       System.out.println("Vous avez entré un nombre pair.");
       return true;
     }
       
     else
     {
        System.out.println("Vous avez entré un nombre impair.");
        return false;
     }
   }
   
}