package Company;

public class Main {

    public static void main(String[] args) {

        /* Before adding Composite Pattern
        FinanceDepartment financeDepartment = new FinanceDepartment();
        MarketDepartment marketDepartment = new MarketDepartment();
        Subsidiary subsidiary = new Subsidiary();

        Chairman chairman = new Chairman(financeDepartment, marketDepartment, subsidiary);
        chairman.printDepartment();
        */
        //三部门
        DepartmentComponent financeDepartment =
                new Department("Finance Department");
        DepartmentComponent marketDepartment =
                new Department("Market Department");
        DepartmentComponent subsidiary =
                new Department("Subsidiary");
        //分公司
        DepartmentComponent BJstudio =
                new Department("Beijing Studio");
        DepartmentComponent SHstudio =
                new Department("Shanghai Studio");
        DepartmentComponent SDstudio =
                new Department("Shandong studio");

        DepartmentComponent allMenus = new Department("ALL DEPARTMENT");

        allMenus.add(financeDepartment);
        allMenus.add(marketDepartment);
        allMenus.add(subsidiary);

        financeDepartment.add(new DepartmentBranch("Manager Office", 1));
        financeDepartment.add(new DepartmentBranch("Accounting Service", 10));
        financeDepartment.add(new DepartmentBranch("Audit Service", 10));

        marketDepartment.add(new DepartmentBranch("Manager Office", 1));
        marketDepartment.add(new DepartmentBranch("Advertisement Service", 20));
        marketDepartment.add(new DepartmentBranch("Design Service", 5));

        subsidiary.add(BJstudio);
        BJstudio.add(new DepartmentBranch("Finance Department", 50));
        BJstudio.add(new DepartmentBranch("Market Department", 20));
        System.out.println();
        subsidiary.add(SHstudio);
        SHstudio.add(new DepartmentBranch("Finance Department", 30));
        SHstudio.add(new DepartmentBranch("Market Department", 30));
        System.out.println("\n");
        subsidiary.add(SDstudio);
        SDstudio.add(new DepartmentBranch("Finance Department", 200));
        SDstudio.add(new DepartmentBranch("Market Department", 50));

        Chairman chairman = new Chairman(allMenus);

        chairman.printCompany();
    }
}