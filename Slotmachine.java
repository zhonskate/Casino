import java.util.*;
public class SlotMachine{
    public static void main(String [] args){ 
   Scanner kbd = new Scanner(System.in).useLocale(Locale.US); 
   int money,bet,selection;
   Symbol s1,s2,s3;
   selection = 0 ;
   System.out.println("WELCOME TO THE SLOT MACHINE");
   System.out.println("input the amount of chips you want to have");
   money = kbd.nextInt(); 
     while (selection <1 && money >0){
   System.out.println("input 0 to play and 1 to exit");
   selection=kbd.nextInt();
   if(selection==0){
   System.out.println("input your bet");
   bet = kbd.nextInt();
   while (bet> money){
        System.out.println("you have " + money + " chips, you cannot bet more than you have");
        System.out.println("input the amount of chips you want to bet");
        bet = kbd.nextInt();
    }
    money -= bet;
   s1= utilnum.rell();
   System.out.print(s1.getSym() + "\t");
   s2= utilnum.rell();
   System.out.print(s2.getSym() + "\t");
   s3= utilnum.rell();
   System.out.println(s3.getSym());
   if (s1.getSet()==1 && s2.getSet()== 1 && s3.getSet()==1){money+=bet*8;System.out.println("you won the bet, now you have " + money + " chips");}
   if (s1.getSet()==2 && s2.getSet()== 2 && s3.getSet()==2){money+=bet*27;System.out.println("you won the bet, now you have " + money + " chips");}
   if (s1.getSet()==3 && s2.getSet()== 3 && s3.getSet()==3){money+=bet*125;System.out.println("you won the bet, now you have " + money + " chips");}
   if (s1.getSet()==4 && s2.getSet()== 4 && s3.getSet()==4){money+=bet*8000;System.out.println("you won the bet, now you have " + money + " chips");}
   if (s1.getSet()!=s2.getSet()||s1.getSet()!=s3.getSet()){System.out.println("you lose the bet, now you have " + money + " chips");}
   
}
}
}
}
