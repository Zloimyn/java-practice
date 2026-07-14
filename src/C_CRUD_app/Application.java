package C_CRUD_app;

public class Application {
    public static void main(String[] args) {
        CatRepository repository = new CatRepository();

        // Пример: поиск по id
        System.out.println(repository.findById(4));

        // Обновление
        Cat updateCat = new Cat(3, "Wendy", "Brown");
        repository.update(updateCat);

        // Удаление
        repository.delete(2);

        // Вставка
        Cat newCat = new Cat(null, "Sky", "Blue");
        repository.insert(newCat);
        System.out.println("Вставлен кот: " + newCat);

        // Все коты
        System.out.println(repository.findAll());
    }
}
