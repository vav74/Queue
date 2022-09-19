import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    }

    public static List<Person> generateClients() {
        List<Person> list = new ArrayList<>();
        Person Person1 = new Person("Борис Васильев", 10);
        Person Person2 = new Person("Александра Булкина", 6);
        Person Person3 = new Person("Наталья Портамонова", 5);
        Person Person4 = new Person("Емельян Макаронов", 7);
        Person Person5 = new Person("Иннокентий Ризников", 8);
        list.add(Person1);
        list.add(Person2);
        list.add(Person3);
        list.add(Person4);
        list.add(Person5);
        return list;
    }
}
