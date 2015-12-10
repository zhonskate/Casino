public class Card{
    private String value;
    private char sym;
    private int num, real;
    
    public Card(int n){
    if (n>=0 && n<13){num = n%13 + 1; sym= '♠';
    value = num + "";
    if (num == 11) value = "J";
    if (num == 12) value = "Q";
    if (num == 13) value = "k";
    real = num;
    if (real>10) real=10;
    if (real == 1) real=11;}
    if (n>=13 && n<26){num = n%13 + 1; sym= '♥';
    value = num + "";
    if (num == 11) value = "J";
    if (num == 12) value = "Q";
    if (num == 13) value = "k";
    real = num;
    if (real>10) real=10;
    if (real == 1) real=11;}
    if (n>=26 && n<39){num = n%13 + 1; sym= '♦';
    value = num + "";
    if (num == 11) value = "J";
    if (num == 12) value = "Q";
    if (num == 13) value = "k";
    real = num;
    if (real>10) real=10;
    if (real == 1) real=11;}
    if (n>=39 && n<52){num = n%13 + 1; sym= '♣';
    value = num + "";
    if (num == 11) value = "J";
    if (num == 12) value = "Q";
    if (num == 13) value = "k";
    real = num;
    if (real>10) real=10;}
    if (real == 1) real=11; 
    }
    
    public char getSuit(){return sym;}
    public String getValue(){return value;}
    public int getReal(){return real;}
    public String toString(){String st1 = value + sym; return st1;}
    public boolean equals(Card c){ return c.num==this.num && c.sym==this.sym;}

   
}
