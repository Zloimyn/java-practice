package T16_ClassString_and_more.Task11_Razdelitely.Task4;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Вероника Чехова физика — Безупречно Анна Строкова математика — Потрясающе Иван Петров геометрия — Безупречно"};


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
        for (String students : grades){
            newMassiv = students.split(" ");
            newMassiv[4] = gradeStringToInt(newMassiv[4]);

            join = String.join(",",newMassiv[0].toLowerCase(),newMassiv[1].toLowerCase(),newMassiv[2].toLowerCase(),newMassiv[4].toLowerCase());
        }
        System.out.println(join);
        return join;
    }
}
