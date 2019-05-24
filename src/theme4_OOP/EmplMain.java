package theme4_OOP;

public class EmplMain {
    public static void main(String[] args) {
        Employee[] arrayEmpl = new Employee[5];

        arrayEmpl [0] = new Employee("Sotrudnik1", "driver", "sotr1@email.org",
                89019871221L, 55000.00, 25);
        arrayEmpl [1] = new Employee("Sotrudnik2", "specialist", "sotr2@email.org",
                89019881451L, 65000.00, 30);
        arrayEmpl [2] = new Employee("Sotrudnik3", "manager", "sotr3@email.org",
                89019771331L, 75000.00, 35);
        arrayEmpl [3] = new Employee("Sotrudnik4", "topmanager", "sotr4@email.org",
                89019772221L, 85000.00, 45);
        arrayEmpl [4] = new Employee("Sotrudnik5", "boss", "sotr5@email.org",
                89019777777L, 95000.00, 50);

        for (Employee e : arrayEmpl) {
            if (e.age > 30)
                e.print();
        }
    }
}
