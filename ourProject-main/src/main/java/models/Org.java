package models;
import reposit.StaffRepository;

import java.util.LinkedList;
import java.util.List;
public class Org {
    StaffRepository staff;
    public Org() {
        staff = new StaffRepository();
    }
    public StaffRepository getStaff() {
        return staff;
    }
}
