package Proiect2;
import Proiect2.PresedinteSingleton;
public class MainSingleton {

    public static void main(String argv[]){
        System.out.println("Singleton");


        Parlament parlamentulTarii= new Parlament();
        parlamentulTarii.creeazaLege("Cresterea alocatiilor");
        Parlament parlamentulEuropean=new Parlament();
        parlamentulEuropean.creeazaLege("Legea pentru scaderea pensiilor");
        parlamentulEuropean.creeazaLege("Legea pentru scaderea salariului mediu pe economie");
        parlamentulTarii.creeazaLege("Legea pentru cresterea bugetului anual ");
        System.out.println(PresedinteSingleton.getInstance().value);


    }
}
