import java.util.*;
public final class utilnum{
private utilnum(){}
    public static Number roll(){
        int r = (int) (Math.random()*37);
        Number sel = new Number(r);
        return sel;
}
    public static Symbol rell(){
        int r = (int) (Math.random()*100);
        Symbol sel = new Symbol(r);
        return sel;
}
    public static Card rull(){
        int r = (int) (Math.random()*52);
        Card sel = new Card(r);
        return sel;
}
}
