public class Symbol{
    private int set;
    private char sym;
    
    public Symbol(int n){
    if (n>=0 && n<50){set=1; sym= '■';}
    if (n>=50 && n<83){set=2; sym= '❤';}
    if (n>=83 && n<93){set=3; sym= '7';}
    if (n>=93 && n<98){set=5; sym= '▲';}
    if (n>=98 && n<100){set=0; sym= 'X';}
    }
    
    public int getSet(){return set;}
    public char getSym(){return sym;}
   
}
