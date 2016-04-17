package Company;

import java.util.Iterator;
/**
 * Created by qyz on 2016/4/16.
 */
public class DepartmentBranch extends DepartmentComponent {
    String name;
    int staff;

    public DepartmentBranch(String name, int staff) {
        this.name = name;
        this.staff = staff;
    }

    public String getName() {
        return name;
    }

    public int getStaff() {
        return staff;
    }

    public void print() {
        System.out.print(getName());
        System.out.println(" - " + getStaff());
    }
}