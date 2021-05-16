package reposit;
import models.Person;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
public class StaffRepository {
    private static List<Person> rep = new LinkedList<>();
    public void remove(Person p) {
        rep.remove(p);
    }
    public void add(Person person) {
        rep.add(person);
    }
}
