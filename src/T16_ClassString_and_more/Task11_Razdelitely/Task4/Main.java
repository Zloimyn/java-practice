package T16_ClassString_and_more.Task11_Razdelitely.Task4;

import static java.lang.String.join;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Вероника Чехова физика — Безупречно", "Анна Строкова математика — Потрясающе", "Иван Петров геометрия — Безупречно"};

        serializeGrades(students);
    }
    private static String gradeStringToInt(String grade) {
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
        String[] newMassiv = new String[grades.length];
        String join = "";
        String temp = "";
        for (int i = 0; i < grades.length; i++) {
            newMassiv = grades[i].split(" ");
            newMassiv[4] = gradeStringToInt(newMassiv[4]);


            join = join(",",newMassiv[0].toLowerCase(),newMassiv[1].toLowerCase(),newMassiv[2].toLowerCase(),newMassiv[4].toLowerCase());
            grades[i] = join;
        }

//        for (String students : grades){
//            newMassiv = students.split(" ");
//            newMassiv[4] = gradeStringToInt(newMassiv[4]);
//
//            join += String.join(",",newMassiv[0].toLowerCase(),newMassiv[1].toLowerCase(),newMassiv[2].toLowerCase(),newMassiv[4].toLowerCase());
//            temp += join;
//            if (temp == join){
//                join += ";";
//            }else {
//                join
//            }
//
//        }

        System.out.println(join(";",grades));
        return join(";",grades);
    }
}
