package t9_encapculations.oop;

public class oop {
    public static void main(String[] args) {
        //Наследование - это возможность создания класса на основе существующего extends
        //Дочерний  класс - подкласс
        //Родительский класс - суперкласс


        // Создаем объект класса Student
        Student student = new Student("Алексей", 20, 8.5);

        // Выводим информацию о студенте
        student.printStudentInfo();

        // Пытаемся установить некорректные значения
        student.setAge(-5);          // Некорректный возраст
        student.setGrade(11.0);      // Некорректный средний балл
        student.setName("");         // Пустое имя
        // Выводим информацию после попытки изменить данные
        student.printStudentInfo();
        System.out.println();


        // Устанавливаем корректные значения
        student.setAge(22);
        student.setGrade(9.0);
        student.setName("Мария");

        // Выводим обновленную информацию
        student.printStudentInfo();
    }
}
