package app.PersonDataRoutines;

public class Person {

    private String name;
    private int numYearsOld;
    private String position;

    public Person(String name, int numYearsOld, String position) {
        this.name = name;
        this.numYearsOld = numYearsOld;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getNumYearsOld() {
        return numYearsOld;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumYearsOld(int numYearsOld) {
        this.numYearsOld = numYearsOld;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return  "Ім'я: " + name + ", " +
                "Вік: " + numYearsOld + ", " +
                "Професія: " + position;
    }


}
