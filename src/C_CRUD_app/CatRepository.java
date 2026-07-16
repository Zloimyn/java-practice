package C_CRUD_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CatRepository {

    // Параметры подключения – вынесите в константы для удобства
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }

    // CRUD методы
    public Cat findById(int id) {
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement("select * from cat where id =?")) {
            preparedStatement.setInt(1,id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return new C_CRUD_app.Cat(resultSet.getInt("id"),resultSet.getString("name"), resultSet.getString("colour"));
                }
                return null;
            }
        } catch (RuntimeException | SQLException e) {
            throw new RuntimeException("Ошибка при поиске кота по id = " + id, e);
        }
    }

    public List<Cat> findAll() {
        List<Cat> gotovo = new ArrayList<>();
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement("select * from cat"); ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()){
                Cat cat = new Cat(resultSet.getInt("id"),resultSet.getString("name"), resultSet.getString("colour"));
                gotovo.add(cat);
            }
            return gotovo;
        } catch (RuntimeException | SQLException e) {
            throw new RuntimeException("Ошибка при получении всех котов", e);
        }
    }

    public void insert(Cat cat) {
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement("insert into cat(name,colour) values(?,?)", Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, cat.getColour());
            preparedStatement.setString(2, cat.getName());
            int execute = preparedStatement.executeUpdate();
            if (execute == 0) {
                throw new RuntimeException("Вставка не выполнилась, ни одной записи не добавлено");
            }
            try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                if (resultSet.next()) {
                    cat.setId(resultSet.getInt("id"));
                    System.out.println("Вставка выполнилась");
                } else {
                    System.out.println("Не удалось получить сгенерированный ID");
                }
            }
        } catch (RuntimeException | SQLException e) {
            throw new RuntimeException("Ошибка при вставке кота: " + cat, e);
        }
    }

    public void update(Cat cat) {
        if (cat.getId() == null) {
            throw new RuntimeException("ID кота не может быть null для обновления");
        }
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement("update cat set name = ?, colour = ? where id =?")) {
            preparedStatement.setInt(3, cat.getId());
            preparedStatement.setString(1, cat.getName());
            preparedStatement.setString(2, cat.getColour());
            if (preparedStatement.executeUpdate() == 0) {
                throw new RuntimeException("Кот с id = " + cat.getId() + " не найден, обновление не выполнено");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Ошибка при обновлении кота: " + cat, e);
        }
    }

    public void delete(int id) {
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement("delete from Cat where id =?")) {
            preparedStatement.setInt(1,id);
            if (preparedStatement.executeUpdate() == 0) {
                throw new RuntimeException("Кот с id = " + id + " не найден, удаление не выполнено");
            }
        } catch (SQLException e) {
           throw new RuntimeException("Ошибка при удалении кота с id = " + id, e);
        }
    }
}
