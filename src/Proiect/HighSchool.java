package Proiect;
import Proiect.School;
public class HighSchool extends School{




    public HighSchool(String highSchoolName){
        super(highSchoolName);

    }

    @Override
    public int gradesType(){
        System.out.println("This is a HighSchool ");
        return 0;




    }
}
