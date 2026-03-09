package T16_ClassString_and_more.Task11_Razdelitely.Task3;

public class Main {
    public static void main(String[] args) {
        String stringiki = "вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5";
        gradeBeautifier(stringiki);
    }
    private static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    private static String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public static void gradeBeautifier(String grades) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] students = grades.split(";");
        for (String name2 : students){
            String[] name3;
            name3 = name2.split(",");
            capitalize(name3);
            name3.toLowerCase();
            gradeToString(name3);
            stringBuilder.append(name3);
        }

        System.out.println(name);// реализуйте метод здесь
    }
}
