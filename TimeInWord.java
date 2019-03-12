import java.util.Scanner;

public class the_time_in_words {

  private static final String[] tensNames = {
       "",
       "ten ",
       "twenty ",
       "thirty ",
   };

   private static final String[] numNames = {
       "",
       "one ",
       "two ",
       "three ",
       "four ",
       "five ",
       "six ",
       "seven ",
       "eight ",
       "nine ",
       "ten ",
       "eleven ",
       "twelve ",
       "thirteen ",
       "fourteen ",
       "fifteen ",
       "sixteen ",
       "seventeen ",
       "eighteen ",
       "nineteen "
   };


  public static void main(String[] args) {
    int H,M;
    Scanner sc = new Scanner(System.in);
    H = sc.nextInt();
    M = sc.nextInt();
    if(M<30) {
      if(M==0) {
        the_time_in_words.prt(H);
        System.out.println("o' clock");
      } else if (M==15) {
        System.out.print("quarter past ");
        the_time_in_words.prt(H);
      } else {
        the_time_in_words.prt(M);
        if(M==1){
          System.out.print("minute past ");
        } else {
          System.out.print("minutes past ");
        }
        the_time_in_words.prt(H);
      }


    }
    else if(M>=30){
      if(M==30) {
        System.out.print("half past ");
        the_time_in_words.prt(H);
      } else if (60-M==15) {
        System.out.print("quarter to ");
        the_time_in_words.prt(H+1);
      }
      else {
        the_time_in_words.prt(60-M);
        if( 60-M == 1){
          System.out.print("minute to ");
          the_time_in_words.prt(H+1);
        } else {
          System.out.print("minutes to ");
          the_time_in_words.prt(H+1);
        }
      }
    }
  }

  private static void prt(int num) {
    if(num<20) {
      System.out.print(numNames[num]);
    }
    else {
      System.out.print(tensNames[num/10]);
      System.out.print(numNames[num%10]);
    }
  }
}