package Company;

import java.util.Iterator;
/**
 * Created by qyz on 2016/4/16.
 */
public abstract class DepartmentComponent {

    public void add(DepartmentComponent departmentComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(DepartmentComponent departmentComponent) {
        throw new UnsupportedOperationException();
    }
    public DepartmentComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }
    public int getStaff() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}