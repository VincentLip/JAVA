package org.example.employe;

public class Technicien extends Employe{

    private int grade;

    public Technicien(int grade) {
        this.grade = grade;
    }

    public Technicien(String nom, int age, int salaire, int grade) {
        super(nom, age, salaire);
        this.grade = grade;
    }

    public int prime(){

        if(grade == 1)
        {
            return 100;
        }else if (grade == 2)
        {
            return 200;
        }else if(grade == 3)
        {
            return 300;
        }else{
            return 0;
        }
    }

    public float calculeSalaire()
    {
        return getSalaire()+prime();
    }
}
