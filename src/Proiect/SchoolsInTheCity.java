package Proiect;

public class SchoolsInTheCity extends SchoolFactory{


        public School createSchool(String schName){



            School school=null;
                if (schName.contains("Gradinita")){

                    school = new KindergartenSchool(schName);
                }
                else {
                    if (schName.contains("Primara")) {

                        school = new PrimarySchool(schName);
                    } else {
                        if (schName.contains("Liceu")){

                            school = new HighSchool(schName);


                        }
                    }
                }

                    return school;



        }}

