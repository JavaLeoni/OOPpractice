package app;


import app.PersonDataRoutines.Person;
import app.PersonDataRoutines.DBPerson;

public class Main {

    public static void main(String[] args) {

        Person[] personList = new DBPerson().getData();

        System.out.println("Список контактів");
        viewPersonList(personList);
        System.out.println("");

        System.out.println("Контакт до і після змін посади");
        viewPerson(3, personList);
        updatePersonPosition(personList[3],"Дизайнер");
        viewPerson(3, personList);
    }

    private static void viewPersonList(Person[] personList) {
        int count = 0;
        for (Person person : personList) {
            count++;
            System.out.println(count + ") " + person.toString());
        }
    }

    private static Person updatePersonPosition(Person person, String newPosition) {
      person.setPosition(newPosition);
      return person;
    }

    private static void viewPerson(int index, Person[] personList) {
        System.out.println(personList[index].toString());
    }

}

