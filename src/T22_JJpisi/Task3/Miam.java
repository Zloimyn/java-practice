package T22_JJpisi.Task3;

import java.sql.*;
import java.util.Scanner;

public class Miam {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "postgres";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возврат: ");
        int ageUser = scanner.nextInt();

        try (Connection connection = DriverManager.getConnection(url,user,password);
            PreparedStatement preparedStatement = connection.prepareStatement("select * from persons where age =?")){

            preparedStatement.setInt(1,ageUser);

            try (ResultSet resultSet1 = preparedStatement.executeQuery()){
                while (resultSet1.next()){
                    System.out.println("Имя: " + resultSet1.getString("first_name")
                            + " Фамилия: " + resultSet1.getString("last_name")
                            + " Почта: " + resultSet1.getString("email")
                            + " MMR: " + resultSet1.getInt("mmr")
                            + " Лет: " + resultSet1.getInt("age"));
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

