package Proiect;
import Proiect.School;
public abstract class SchoolFactory {

    public abstract School createSchool(String schoolName);
    public School giveDetailsAboutSchool(String schoolName){

        School school= createSchool(schoolName);
        school.gradesType();
        //school.detail();


        return school;

    }
}
