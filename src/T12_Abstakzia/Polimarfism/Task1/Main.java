package T12_Abstakzia.Polimarfism.Task1;

class Can implements Openable {
    public void open() {
        System.out.println("Чтобы открыть жестяную банку, нужно потянуть кольцо-ключ.");
    }
}

interface Openable {
    void open();
}

class Window implements Openable {
    public void open() {
        System.out.println("Чтобы открыть окно, нужно повернуть ручку.");
    }
}

public class Main {
    public static void main(String[] args) {
        Openable can = new Can();
        can.open();

        Openable window = new Window();
        window.open();
    }
}

