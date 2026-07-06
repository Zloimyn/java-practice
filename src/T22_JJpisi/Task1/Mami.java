package T22_JJpisi.Task1;

import java.sql.*;
import java.util.List;

public class Mami {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "postgres";

        Connection connection = DriverManager.getConnection(url,user,password);
        PreparedStatement statement = connection.prepareStatement("select * from persons");
        ResultSet resultSet = statement.executeQuery();

        List<Person> persons = resultSet.next();

        Person person;
        for (int i = 0; i < persons.size(); i++){
            person = persons.get(i);

            System.out.println("Имя: " + person.first_name
                    + " Фамилия: " + person.last_name
                    + " Играет в доту?: без удовольствия. Почта: "
                    + person.email +
                    " MMR: " + person.mmr
                    + " Лет: " + person.age);
        }
    }
    class Person(){

    }
}
