package C_CRUD_app;

import org.checkerframework.checker.units.qual.C;

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
    private static final String URL = "jdbc:postgresql://localhost:5432/MyDatabase";
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
                    return new C_CRUD_app.Cat(resultSet.getString("colour"),resultSet.getString("name"), resultSet.getInt("id"));
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
                Cat cat = new Cat(resultSet.getString("colour"), resultSet.getString("name"), resultSet.getInt("id"));
                gotovo.add(cat);
            }
            return gotovo;
        } catch (RuntimeException | SQLException e) {
            throw new RuntimeException("Ошибка при получении всех котов", e);
        }
    }

    public void insert(Cat cat) {
        String sql = ...;
        try (...) {
            ...
            ...
            ...
            if (...) {
                ... "Вставка не выполнилась, ни одной записи не добавлено" ...;
            }
            try (...) {
                if (...) {
                    ...
                } else {
                    ... "Не удалось получить сгенерированный ID" ...;
                }
            }
        } catch (...) {
            ... "Ошибка при вставке кота: " + cat ...;
        }
    }

    public void update(Cat cat) {
        if (...) {
            ... "ID кота не может быть null для обновления" ...;
        }
        String sql = ...;
        try (...) {
            ...
            ...
            ...
            ...
            if (...) {
                ... "Кот с id = " + cat.getId() + " не найден, обновление не выполнено" ...;
            }
        } catch (...) {
            ... "Ошибка при обновлении кота: " + cat ...;
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
