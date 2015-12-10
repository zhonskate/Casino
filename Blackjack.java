import java.util.*;
public class BlackJack{
    public static void main(String [] args){ 
   Scanner kbd = new Scanner(System.in).useLocale(Locale.US);
   System.out.println("INPUT YOUR MONEY");
   int money = kbd.nextInt();
   int bet;
   int selection = 1;
   while (selection == 1){
  System.out.println("input your bet");
   bet = kbd.nextInt();
   while (bet> money){
        System.out.println("you have " + money + " chips, you cannot bet more than you have");
        System.out.println("input the amount of chips you want to bet");
        bet = kbd.nextInt();
    }
   money-=bet;
   Card c1 = utilnum.rull();
   Card c2 = utilnum.rull();
   while (c1.equals(c2)){c2 = utilnum.rull();}
   System.out.println("THE DEALER HOLDS " + c1.toString() + " - ");
   Card c3 = utilnum.rull();
   while (c3.equals(c2) || c3.equals(c1)){c3 = utilnum.rull();}
   Card c4 = utilnum.rull();
   while (c4.equals(c3) || c4.equals(c2) || c4.equals(c1)){c4 = utilnum.rull();}
   String hand = "YOU HOLD " +c3.toString() + " "+ c4.toString();
   System.out.println(hand);
   int points = c3.getReal()+c4.getReal();
   System.out.println("you have " + points + " points");
   System.out.println("Input 0 to STAND");
   System.out.println("Input 1 to HIT");
   System.out.println("Input 2 to DOUBLE DOWN");
   int choice = kbd.nextInt();
   if (choice == 0){
    int dpoints = c1.getReal() + c2.getReal();
    String result = "THE DEALER HOLDS " + c1.toString() + " "+ c2.toString();
    System.out.println(result);
    System.out.println("WHICH ARE " + dpoints + " POINTS");
    while (dpoints<=15) {
       Card c5 = utilnum.rull();
       while (c5.equals(c4) || c5.equals(c3) || c5.equals(c2) || c5.equals(c1)){c5 = utilnum.rull();}
       dpoints += c5.getReal();
       result = result + " " + c5.toString();
       System.out.println(result);
       
        if (dpoints>21){
       if (c1.getReal()==11 || c2.getReal()==11 || c5.getReal()==11) dpoints -= 10;
       }
       System.out.println("WHICH ARE " + dpoints + " POINTS");
    }

      if (points<22){
      if (dpoints>21){ 
          if (points == 21){ System.out.println("BLACKJACK!, AND THE HOUSE BUSTED, YOU WIN");money += bet*3;}
          if (points <21){ System.out.println("THE HOUSE BUSTED, YOU WIN");money += bet*2;} }
      if (dpoints ==21){
          if (points == 21){  System.out.println("DOUBLE BLACKJACK, TIE");money += bet;}
          if (points < 21)  System.out.println("YOU LOSE"); }
      if (dpoints<21){
          if (points == 21) {System.out.println("BLACKJACK, YOU WIN!");money += bet*3;}
          if (points < 21){
              if (dpoints > points) System.out.println("YOU LOSE");
              if (dpoints == points){ System.out.println("TIE");money += bet;}
              if (points > dpoints){ System.out.println("YOU WIN");money += bet*2;}}}
    }
   }
    if (choice == 1){
      while (choice == 1) {
       Card c6 = utilnum.rull();
      while (c6.equals(c4) || c6.equals(c3) || c6.equals(c2) || c6.equals(c1)){c6 = utilnum.rull();}
       points += c6.getReal();
       hand = hand + " " + c6.toString();
       System.out.println(hand);
       
        if (points>21){
       if (c3.getReal()==11 || c4.getReal()==11 || c6.getReal()==11) points -= 10;
       }
       System.out.println("WHICH ARE " + points + " POINTS");
       if (points>21) break;
       System.out.println("INPUT 1 TO HIT AGAIN");
       System.out.println("INPUT 0 TO STAND");
       choice = kbd.nextInt();
     }   
     int dpoints = c1.getReal() + c2.getReal();
     String result = "THE DEALER HOLDS " + c1.toString() + " "+ c2.toString();
    System.out.println(result);
     System.out.println("WHICH ARE " + dpoints + " POINTS");
     while (dpoints<=15) {
       Card c5 = utilnum.rull();
       while (c5.equals(c4) || c5.equals(c3) || c5.equals(c2) || c5.equals(c1) ){c5 = utilnum.rull();}
       dpoints += c5.getReal();
       result = result + " " + c5.toString();
       System.out.println(result);
       
        if (dpoints>21){
       if (c1.getReal()==11 || c2.getReal()==11 || c5.getReal()==11) dpoints -= 10;
       }
       System.out.println("WHICH ARE " + dpoints + " POINTS");
     }
      if (points<22){
      if (dpoints>21){ 
          if (points == 21){ System.out.println("BLACKJACK!, AND THE HOUSE BUSTED, YOU WIN");money += bet*3;}
          if (points <21){ System.out.println("THE HOUSE BUSTED, YOU WIN");money += bet*2;} }
      if (dpoints ==21){
          if (points == 21){  System.out.println("DOUBLE BLACKJACK, TIE");money += bet;}
          if (points < 21)  System.out.println("YOU LOSE"); }
      if (dpoints<21){
          if (points == 21) {System.out.println("BLACKJACK, YOU WIN!");money += bet*3;}
          if (points < 21){
              if (dpoints > points) System.out.println("YOU LOSE");
              if (dpoints == points){ System.out.println("TIE");money += bet;}
              if (points > dpoints){ System.out.println("YOU WIN");money += bet*2;}}}
     }
      if (points>21)    System.out.println("YOU BUSTED, YOU LOSE");
   }
   if (choice == 2){
       money -=bet;
       bet = bet*2;
       Card c6 = utilnum.rull();
      while (c6.equals(c4) || c6.equals(c3) || c6.equals(c2) || c6.equals(c1)){c6 = utilnum.rull();}
       points += c6.getReal();
       hand = hand + " " + c6.toString();
       System.out.println(hand);
       System.out.println("WHICH ARE " + points + " POINTS");
     int dpoints = c1.getReal() + c2.getReal();
     String result = "THE DEALER HOLDS " + c1.toString() + " "+ c2.toString();
     System.out.println(result);
     System.out.println("WHICH ARE " + dpoints + " POINTS");
     while (dpoints<=15) {
       Card c5 = utilnum.rull();
       while (c5.equals(c4) || c5.equals(c3) || c5.equals(c2) || c5.equals(c1) ){c5 = utilnum.rull();}
       dpoints += c5.getReal();
       result = result + " " + c5.toString();
       System.out.println(result);
       
        if (dpoints>21){
       if (c1.getReal()==11 || c2.getReal()==11 || c5.getReal()==11) dpoints -= 10;
       }
       System.out.println("WHICH ARE " + dpoints + " POINTS");
     }
    if (points<22){
      if (dpoints>21){ 
          if (points == 21){ System.out.println("BLACKJACK!, AND THE HOUSE BUSTED, YOU WIN");money += bet*3;}
          if (points <21){ System.out.println("THE HOUSE BUSTED, YOU WIN");money += bet*2;} }
      if (dpoints ==21){
          if (points == 21){  System.out.println("DOUBLE BLACKJACK, TIE");money += bet;}
          if (points < 21)  System.out.println("YOU LOSE"); }
      if (dpoints<21){
          if (points == 21) {System.out.println("BLACKJACK, YOU WIN!");money += bet*3;}
          if (points < 21){
              if (dpoints > points) System.out.println("YOU LOSE");
              if (dpoints == points){ System.out.println("TIE");money += bet;}
              if (points > dpoints){ System.out.println("YOU WIN");money += bet*2;}}}
     if (points>21)    System.out.println("YOU BUSTED, YOU LOSE");
    }
   }
  System.out.println("YOU HAVE "+money+" CHIPS"); 
  System.out.println("INPUT 1 TO PLAY AGAIN OR 0 TO EXIT");
  selection = kbd.nextInt();
  
}
}
}
