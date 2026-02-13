package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Множества.TreeSet.Task1;


public class Ticket {
    public String from;
    public String to;
    public int priceInUsd;

    public Ticket(String from, String to, int priceInUsd) {
        this.from = from;
        this.to = to;
        this.priceInUsd = priceInUsd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (priceInUsd != ticket.priceInUsd) return false;
        if (!from.equals(ticket.from)) return false;
        if (!to.equals(ticket.to)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = from.hashCode();
        result = 31 * result + to.hashCode();
        result = 31 * result + priceInUsd;
        return result;
    }

    @Override
    public String toString() {
        return "Ticket{from=" + from + ", to=" + to + ", priceInUsd=" + priceInUsd + '}';
    }

}