package T16_ClassString_and_more.Task10StringBuilder;

public class Main {
    public static void main(String[] args) {
        String start = "Привет! Меня зовут ";

        StringBuilder hello = new StringBuilder(start); // создайте StringBuilder с началом start

        hello.append("Сергей "); // добавьте подстроку "<ваше имя>"
        hello.append(".Я из города - "); // добавьте подстроку ". Я из города "
        hello.append("Астана"); // добавьте подстроку "<ваш город>."

        String asString = hello.toString();
        System.out.println(asString);
    }
}
