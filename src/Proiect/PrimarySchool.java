package Proiect;
import Proiect.School;
public class PrimarySchool extends School{




        public PrimarySchool(String primarySchoolName){
            super(primarySchoolName);

        }

        @Override
        public int gradesType(){
            System.out.println("This is a PrimarySchool ");
            return 0;





    }
}
