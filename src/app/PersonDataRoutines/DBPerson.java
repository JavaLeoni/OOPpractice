package app.PersonDataRoutines;


public class DBPerson {

    public Person[] getData() {
        return new Person[]{
                new Person("John", 30, "Інженер"),
                new Person("Mary", 25, "Вчитель"),
                new Person("Bob", 35, "Лікар"),
                new Person("Alice", 28, "Архітектор")
        };
    }
}
