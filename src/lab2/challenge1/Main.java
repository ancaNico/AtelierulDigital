package lab2.challenge1;

public class Main {
    public static void main(String argv[]){
        Fighter f1=new Fighter("First",100,20);
        Fighter f2=new Fighter("Second",120,15);
        BoxingMatch boxingMatch=new BoxingMatch(f1,f2);
        System.out.println("Result--"+ boxingMatch.fight());
        System.out.println(f2);
        System.out.println(f2);
        System.out.println(Fighter.getNrOfFighters());
    }
}
