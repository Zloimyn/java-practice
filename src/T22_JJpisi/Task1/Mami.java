package T22_JJpisi.Task1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Mami {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "postgres";

        Connection connection = DriverManager.getConnection(url,user,password);
        PreparedStatement statement = connection.prepareStatement("select * from public.persons");
        ResultSet resultSet = statement.executeQuery();

        List<Person> persons = new ArrayList<>();

        while (resultSet.next()){
            Person person = new Person();

            person.first_name = resultSet.getString("first_name");
            person.last_name = resultSet.getString("last_name");
            person.email = resultSet.getString("email");
            person.mmr = resultSet.getInt("mmr");
            person.age = resultSet.getInt("age");

            persons.add(person);
        }

        Person person;
        for (int i = 0; i < persons.size(); i++){
            person = persons.get(i);

            System.out.println("Имя: " + person.first_name
                    + " Фамилия: " + person.last_name
                    + " Почта: " + person.email
                    + " MMR: " + person.mmr
                    + " Лет: " + person.age);
        }
    }
    static class Person{
        String first_name;
        String last_name;
        String email;
        Integer mmr;
        Integer age;
    }
}
