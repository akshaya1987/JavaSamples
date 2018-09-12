package samples;

public class JavaPractice {
    public static void main(String[] args) {
        Person firstPerson = new Person(31, "Akshay");
        Person secondPerson = new Person(37, "Amar");

        fun(firstPerson, secondPerson);
        System.out.println(firstPerson);
        System.out.println(secondPerson);
    }

    public static void fun(Person x, Person y){
        x = new Person (45, "Puneeth");
        y = new Person (43, "Jayaram");
    }
}

class Person
{
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}