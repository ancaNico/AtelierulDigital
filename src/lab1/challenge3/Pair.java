package lab1.challenge3;
import java.lang.Math;
public class Pair {

    void findPairs(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == 0) {

                    System.out.println(numbers[i] + "  " + numbers[j]);
                }
            }

        }
    }

    void compute(int nr) {
        int lng=0;
        int n=0;
        if ((nr% 3 == 0)&(nr % 5 == 0)&(nr % 7 == 0)){
            System.out.print ("FooBarQix");
        }
        else if ((nr% 3 == 0)&(nr % 5 == 0)&!(nr % 7 == 0)){
            System.out.print ("FooBar");
        }
        else if ((nr% 3 == 0)&!(nr % 5 == 0)&(nr % 7 == 0)){
            System.out.print ("FooQix");
        }
        else if (!(nr% 3 == 0)&(nr % 5 == 0)&(nr % 7 == 0)){
            System.out.print ("BarQix");
        }
        else if (nr% 3 == 0) {
            System.out.print ("Foo");


        } else if (nr % 5 == 0) {
            System.out.print  ("Bar");

        } else if (nr % 7 == 0) {
            System.out.print("Qix");

        }
        else{
            do {
                n = nr % 10;
                if (n==0){
                    System.out.print("*");
                    nr = nr / 10;}
                else{
                    System.out.print(n);
                    nr = nr / 10;
                }
            }
           while(nr>0);
        }
        if (nr/10>0){
            lng+=1;
            nr=nr/10;
        }

        while(nr>0) {

                n = nr % 10;
            if (n == 0) {
                System.out.print("*");
                nr = nr / 10;

                } else if (n == 5) {
                    System.out.print("Bar");
                    nr = nr / 10;
                } else if (n == 7) {
                    System.out.print("Qix");
                    nr = nr / 10;
                } else if (n == 3) {
                System.out.print("Foo");
                nr = nr / 10;

                }




    }}


public static void main(String[] args) {
    Pair p = new Pair();
    int num[] = new int[5];
    num[0] = 1;
    num[1] = 2;
    num[2] = 3;
    num[3] = -2;
    num[4] = -3;

    p.findPairs(num);


    Pair homework=new Pair();
    homework.compute(303);
}}