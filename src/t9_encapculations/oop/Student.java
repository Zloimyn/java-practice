package t9_encapculations.oop;

public class Student {
    private int age;
    private double grade;
    private String name;

    Student(String newName, int newAge, double newGrade){
        name = newName;
        grade = newGrade;
        age = newAge;

    }

    public void printStudentInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(grade);
    }

    public void setAge(int newAge2){
        if (newAge2 <0 || newAge2 >150){
            System.out.println("Возраст не может быть в минус");
        }else {
            age = newAge2;
        }
    }
    public void setGrade(double newGrade2){
        if (newGrade2>10.0){
            System.out.println("Оценка не может быть больше 10");
        }else {
            grade = newGrade2;
        }
    }
    public void setName(String newName2){
        if (newName2.equals("")){
            System.out.println("Имя не может быть пустым");
        }else {
            name = newName2;
        }
    }

}
