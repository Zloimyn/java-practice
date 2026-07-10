package T22_JJpisi.Task1;

public class Person{
    private String first_name;
    private String last_name;
    private String email;
    private Integer mmr;
    private Integer age;

    public Person(String first_name, String last_name, String email, Integer mmr, Integer age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.mmr = mmr;
        this.age = age;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getMmr() {
        return mmr;
    }

    public Integer getAge() {
        return age;
    }
}
