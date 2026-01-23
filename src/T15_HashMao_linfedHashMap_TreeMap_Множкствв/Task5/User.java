package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Task5;

public class User {
    Integer id;
    String name;
    String email;

    public User(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString(){
        return "Имя: " + name + ". Email: " + email + ". Id: " + id;
    }
}
