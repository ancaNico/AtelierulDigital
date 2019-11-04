package lab2.challenge1;

public class Fighter
{
    private String name;
    private int health;
    private int demagePerAtack;
    private static int nrOfFighters=0;

    public Fighter(String name, int health, int damage){
        this.name=name;
        this.health=health;
        demagePerAtack=damage;//pt ca u are denumire si compilatorul stie despre cine e vorba
        nrOfFighters++;

    }

    public void attack(Fighter opponent){
        opponent.health=opponent.health-this.demagePerAtack;


    }
    public static int getNrOfFighters(){

        return nrOfFighters;
    }
    public String toString(){
        return "Name:"+ name+"health"+health+"damagePerAtack"+demagePerAtack;

    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
}

