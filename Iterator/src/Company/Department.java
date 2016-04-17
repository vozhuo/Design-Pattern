package Company;

//import java.util.Iterator;
/**
 * Created by qyz on 2016/4/16.
 */
//public interface Department {
//    public Iterator<DepartmentBranch> createIterator();
//}

import java.util.Iterator;
import java.util.ArrayList;

public class Department extends DepartmentComponent {
    ArrayList<DepartmentComponent> departmentComponents = new ArrayList();
    String name;

    public Department(String name) {
        this.name = name;
    }

    public void add(DepartmentComponent departmentComponent) {
        departmentComponents.add(departmentComponent);
    }

    public void remove(DepartmentComponent departmentComponent) {
        departmentComponents.remove(departmentComponent);
    }

    public DepartmentComponent getChild(int i) {
        return departmentComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println(getName());
        System.out.println("---------------");

        Iterator<DepartmentComponent> iterator = departmentComponents.iterator();
        while (iterator.hasNext()) {
            DepartmentComponent departmentComponent = iterator.next();
            departmentComponent.print();
        }
    }
}