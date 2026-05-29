package T18_Sql.Task2.Task3;

public class ThirdtCurrent_task {
    public static void main(String[] args) {
        try (Resource1 resource1 = new Resource1(); Resource2 resource2 = new Resource2()) {
            System.out.println("WW");
        }
    }
}
class Resource1 implements AutoCloseable{
    @Override
    public void close(){
        System.out.println("Метод");
    }
}
class Resource2 implements AutoCloseable{
    @Override
    public void close(){
        System.out.println("Метод2");
    }
}

