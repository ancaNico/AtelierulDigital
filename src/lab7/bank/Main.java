package lab7.bank;

public class Main {
    public static void main(String argv[])throws Exception{

        BanckAccount a= new BanckAccount("1",50);
        BanckAccount b = new BanckAccount("2",100);
        TransactionThread trans=null;

        for (int i=0; i <3; i++){


            trans=new TransactionThread("Transfer",a,b,20);
            trans.start();


        }
        //trans.join(300);


    }
    //System.out.println("transfer"+ name+ "executed");
}
