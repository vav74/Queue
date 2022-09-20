import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<Person> crowd = generateClients();
        Queue<Person> visitorsQueue = new LinkedList<>(crowd);
        while (!visitorsQueue.isEmpty()) {
            Person currentVisitor = visitorsQueue.poll();
            currentVisitor.setNumTickets(currentVisitor.getNumTickets() - 1);
            System.out.println(currentVisitor.getName() + " прокатился на аттракционе (осталось " + currentVisitor.getNumTickets() + " билетов)");
            if (currentVisitor.getNumTickets() != 0) {
                visitorsQueue.offer(currentVisitor);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Борис Васильев", 2));
        list.add(new Person("Александра Булкина", 3));
        list.add(new Person("Наталья Портамонова", 4));
        list.add(new Person("Емельян Макаронов", 5));
        list.add(new Person("Иннокентий Ризников", 6));
        return list;
    }
}