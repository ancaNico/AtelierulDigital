package lab1;





public class Main {

    void fizzBuzz(){
        int i=1;
        for (i=1;i<=100;i++){
            if (i%3==0){

                System.out.println("Fizz");
            }
            else{

                if (i%5==0){

                    System.out.println("Buzz");
                }else{

                    System.out.println(i);
                }
            }


        }


    }

    public static void main(String args[]){

        System.out.println("Atelier 2019");
        Main a= new Main();
        a.fizzBuzz();
    }

}
