package T16_ClassString_and_more.Task11_Razdelitely.Task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Вероника Чехова физика — Безупречно", "Анна Строкова математика — Потрясающе", "Иван Петров геометрия — Безупречно"};

        serializeGrades(students);
    }
    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public static String serializeGrades(String[] grades) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] newMassiv = new String[grades.length];
        for (String students : grades){
            String[] newMassiv = students.split(" ");
            newMassiv[3] = "";
        }
        System.out.println(newMassiv);
        return stringBuilder.toString();
    }
}
