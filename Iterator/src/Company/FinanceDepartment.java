package Company;

import java.util.Iterator;
/**
 * Created by qyz on 2016/4/16.
 */
//public class FinanceDepartment {
//    static final int MAX_BRANCHES = 4;
//    int numberOfBranches = 0;
//    DepartmentBranch[] branches;
//
//    public FinanceDepartment() {
//        branches = new DepartmentBranch[MAX_BRANCHES];
//        addBranch("Manager Office", 1);
//        addBranch("Accounting Service", 10);
//        addBranch("Audit Service", 10);
//    }
//    private void addBranch(String name, int staff) {
//        DepartmentBranch departmentBranch = new DepartmentBranch(name, staff);
//        if(numberOfBranches >= MAX_BRANCHES) {
//            System.err.println("Branch is full!");
//        } else {
//            branches[numberOfBranches] = departmentBranch;
//            numberOfBranches += 1;
//        }
//    }
//
//    public DepartmentBranch[] getBranches() {
//        return branches;
//    }
//
////    public Iterator<DepartmentBranch> createIterator() {
////        return new FinanceIterator(branches);
////    }
//}
