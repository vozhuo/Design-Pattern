package Company;

import java.util.Iterator;
/**
 * Created by qyz on 2016/4/16.
 */
public class Chairman {
//    Department finance;
//    Department market;
//    Department subsidiary;
//
//    public Chairman(Department finance, Department market, Department subsidiary) {
//        this.finance = finance;
//        this.market = market;
//        this.subsidiary = subsidiary;
//    }
//
//    public void printDepartment() {
//        Iterator financeIterator = finance.createIterator();
//        Iterator marketIterator = market.createIterator();
//        Iterator subsidiaryIterator = subsidiary.createIterator();
//
//        System.out.println("Company\n-------\nFinance Department");
//        printDepartment(financeIterator);
//        System.out.println("\nMarket department");
//        printDepartment(marketIterator);
//        System.out.println("\nSubsidiaries");
//        printDepartment(subsidiaryIterator);
//    }
//
//    private void printDepartment(Iterator iterator) {
//        while (iterator.hasNext()) {
//            DepartmentBranch branches = (DepartmentBranch) iterator.next();
//            System.out.print(branches.getName() + " - ");
//            System.out.println(branches.getStaff());
//        }
//    }
    DepartmentComponent allDepartment;

    public Chairman(DepartmentComponent allDepartment) {
        this.allDepartment = allDepartment;
    }
    public void printCompany() {
        allDepartment.print();
    }
}
