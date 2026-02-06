package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Task8;

import java.util.Objects;

public class User {
    Long id;
    String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "User{id=" + id + ", name='" + name + "'}";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode(){
        return id.hashCode() + name.hashCode();
    }

}
