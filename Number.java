
public class Number
{
    private int num,place;
    private String col,odd;
    
    public Number(int n){
        if (n>=0 && n<37){num = n;}
        if (num>0 && num<13){place = 1;}
        if (num>12 && num<25){place = 2;}
        if (num>24 && num<37){place = 3;}
        if (num==0)place = 0;
        if (num==1 || num==3 || num==5 || num==7 || num==9 || num==12 || num==14|| num==16 || num==18 || 
        num==19 || num==21 || num==23 || num==25 || num==27 || num==30 || num==32 || num==34 || num==36) col = "red";
        else col = "black";
        if (num==0) col = "green";
        if (num%2==0) odd= "even";
        else odd= "odd";
    }

    public int getNumber(){return num;}
    public int getPlace(){return place;}
    public String getColor(){return col;}
    public String getOdd(){return odd;}
    public String toString(){String st1 = num + ", " + odd + ", " + col +  ", from the dozen number " + place ;
    return st1;}
    
}
