package Proiect;
import Proiect.School;
public class KindergartenSchool extends School {


    public KindergartenSchool(String kindergartenSchoolName){
        super(kindergartenSchoolName);

    }

    @Override
    public int gradesType(){
        System.out.println("This is a KindergartenSchool ");
        return 0;

    }


}
