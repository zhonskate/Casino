import java.util.*;
public class Roulettetest{
    public static void main(String [] args){ 
       Scanner kbd = new Scanner(System.in).useLocale(Locale.US); 
        int money,selection,guess,bet;
        String co,ev;
        Number n1;
        selection = 0;
   System.out.println("WELCOME TO THE ROULETTE");
   System.out.println("input the amount of chips you want to have");
   money = kbd.nextInt();
   while (selection < 5 && money >0){
   System.out.println("Select your type of bet:");
   System.out.println("1: Number (Number from 0 to 36)");
   System.out.println("2: Color (red or black)");
   System.out.println("3: Odd/even ");
   System.out.println("4: Dozens ( 1st, 2nd or 3rd dozen)");
   System.out.println("5: EXIT");
   selection = kbd.nextInt();
   if (selection ==1){
    System.out.println("input the number you have chosen");
    guess = kbd.nextInt();
    System.out.println("input the amount of chips you want to bet");
    bet = kbd.nextInt();
    while (bet> money){
        System.out.println("you have " + money + " chips, you cannot bet more than you have");
        System.out.println("input the amount of chips you want to bet");
        bet = kbd.nextInt();
    }
    money -= bet;
    n1 = utilnum.roll();
    System.out.println(n1.toString());
    if (n1.getNumber()==guess){ 
        money += bet*36;
        System.out.println("you won the bet, now you have " + money + " chips");}
    else System.out.println("you lose the bet, now you have " + money + " chips");
}
   if (selection ==2){
    System.out.println("input the color you have chosen");
    co = kbd.next();
    System.out.println("input the amount of chips you want to bet");
    bet = kbd.nextInt();
    while (bet> money){
        System.out.println("you have " + money + " chips, you cannot bet more than you have");
        System.out.println("input the amount of chips you want to bet");
        bet = kbd.nextInt();
    }
    money -= bet;
    n1 = utilnum.roll();
    System.out.println(n1.toString());
    if (n1.getColor().equals(co.trim().toLowerCase())){
        money += bet*2;
        System.out.println("you won the bet, now you have " + money + " chips");}       
    else System.out.println("you lose the bet, now you have " + money + " chips");
}
   if (selection ==3){
    System.out.println("input if you have chosen odd or even");
    ev = kbd.next();
    System.out.println("input the amount of chips you want to bet");
    bet = kbd.nextInt();
    while (bet> money){
        System.out.println("you have " + money + " chips, you cannot bet more than you have");
        System.out.println("input the amount of chips you want to bet");
        bet = kbd.nextInt();
    }
    money -= bet;
    n1 = utilnum.roll();
    System.out.println(n1.toString());
    if (n1.getOdd().equals(ev.trim().toLowerCase())){ 
        money += bet*2;    
        System.out.println("you won the bet, now you have " + money + " chips");}
   else System.out.println("you lose the bet, now you have " + money + " chips");     
}
   if (selection ==4){
    System.out.println("input 1 if you chose the first dozen, 2 for the second and 3 for the third");
    guess = kbd.nextInt();
    System.out.println("input the amount of chips you want to bet");
    bet = kbd.nextInt();
    while (bet> money){
        System.out.println("you have " + money + " chips, you cannot bet more than you have");
        System.out.println("input the amount of chips you want to bet");
        bet = kbd.nextInt();
    }
    money -= bet;
    n1 = utilnum.roll();
    System.out.println(n1.toString());
    if (n1.getPlace()==guess){
        money += bet*3;    
        System.out.println("you won the bet, now you have " + money + " chips");}
    else System.out.println("you lose the bet, now you have " + money + " chips");    
}
}
}
}
