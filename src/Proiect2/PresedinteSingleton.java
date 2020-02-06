package Proiect2;

import java.lang.reflect.Array;
import java.util.ArrayList;



public final class PresedinteSingleton {


        private static PresedinteSingleton instance;
        public ArrayList<String> value = new ArrayList<String>();


        private PresedinteSingleton() {
                    }

        public static PresedinteSingleton getInstance() {
            if (instance == null) {
                instance = new PresedinteSingleton();
            }
            return instance;
        }
        public void acceptaLege(String lege){
            this.value.add(lege);

        }
        public void verificaLege(String lege){
            if ((!(value.contains(lege))) && (!(lege.contains("scaderea")))){
                this.acceptaLege(lege);

            }

        }

}
