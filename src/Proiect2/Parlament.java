package Proiect2;
import Proiect2.PresedinteSingleton;

import java.util.ArrayList;

public class Parlament {
    ArrayList<String> legi = new ArrayList<String>();
    public Parlament(){};
    public void  creeazaLege(String lege){
        PresedinteSingleton presedinte=PresedinteSingleton.getInstance();
        presedinte.verificaLege(lege);

    }



}
