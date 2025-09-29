package twenty_six.twenti_nain;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Jack",25);
        doctor.display();

        Surgeon surgeon = new Surgeon("Вадим",33);
        surgeon.display();

        Waiter waiter = new Waiter("Jon",18);
        waiter.display();

    }
}
