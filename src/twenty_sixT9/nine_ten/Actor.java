package twenty_sixT9.nine_ten;

import java.util.Objects;

public class Actor {
    String firstName;
    String lastName;
    Actor(String newFirstName,String newLestName){
        firstName = newFirstName;
        lastName = newLestName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(firstName, actor.firstName) && Objects.equals(lastName, actor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
