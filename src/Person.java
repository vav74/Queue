public class Person {
    private final String name;
    private int numTickets;

    public Person(String name, int numTickets) {
        this.name = name;
        this.numTickets = numTickets;
    }

    public String getName() {
        return name;
    }

    public int getNumTickets() {
        return numTickets;
    }

    public void setNumTickets(int numTickets) {
        this.numTickets = numTickets;
    }
}