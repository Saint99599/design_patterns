public class App {
    public static void main(String[] args) {
        Employee CEO = new Employee("Settha", "CEO", 500000);
        Employee Head_Sales = new Employee("Kamphaka", "Head Sales", 300000);
        Employee Head_Marketing = new Employee("UngInk", "Head Marketing", 300000);
        CEO.children.add(Head_Sales);
        CEO.children.add(Head_Marketing);
        Employee Sales_1 = new Employee("Wiroj", "Sales", 150000);
        Employee Sales_2 = new Employee("Weeranan", "Sales", 100000);
        Head_Sales.children.add(Sales_1);
        Head_Sales.children.add(Sales_2);
        Employee Marketing_1 = new Employee("Oak,", "Sales", 200000);
        Employee Marketing_2 = new Employee("Aem,", "Sales", 250000);
        Head_Marketing.children.add(Marketing_1);
        Head_Marketing.children.add(Marketing_2);
        printAllEmployee(CEO);
    }
    public static void printAllEmployee(Employee CEO) {
        System.out.println(CEO);
        
    }
}
