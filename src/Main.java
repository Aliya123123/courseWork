import java.util.Random;

public class Main {

    private static Random random = new Random();
    private static final String[] name = {"Арина", "Карина", "Марина", "Оксана", "Анфиса"};
    private static final String[] surname = {"Королевна", "Петрова", "Самойлова", "Хасаншина", "Сафиуллина"};
    private static final String[] patronymic = {"Олеговна", "Андреевна", "Рамилевна", "Равилевна", "Александровна"};
    private static Employee[] employees = new Employee[10];

    public static void initEmployees() {
        for (int i = 0; i < employees.length; i++) {
            String fullName = surname[random.nextInt(0, surname.length)] + " " +
                    name[random.nextInt(0, name.length)] + " " +
                    patronymic[random.nextInt(0, patronymic.length)];
            employees[i] = new Employee(fullName, random.nextInt(1, 6), random.nextInt(20_000, 70_000));
        }
    }

    public static void print() {
        for (Employee employees : employees) {
            System.out.println(employees);
        }
    }

    private static int lateSalor() {
        int sum = 0;
        for (Employee employees : employees) {
            sum += employees.getSalary();
        }
        return sum;
    }

    private static Employee peopleMinSalary() {
        Employee peopleMinSalary = null;
        for (Employee employees : employees) {
            if (peopleMinSalary == null || employees.getSalary() < peopleMinSalary.getSalary()) {
                peopleMinSalary = employees;
            }
        }
        return peopleMinSalary;
    }

    private static Employee peopleMaxSalary() {
        Employee peopleMaxSalary = null;
        for (Employee employees : employees) {
            if (peopleMaxSalary == null || employees.getSalary() > peopleMaxSalary.getSalary()) {
                peopleMaxSalary = employees;
            }
        }
        return peopleMaxSalary;
    }

    private static double averageSalor() {
        return (double) lateSalor() / employees.length;
    }

    public static void printFullName() {
        for (Employee employees : employees) {
            System.out.println(employees.getFullName());
        }
    }

    public static void main(String[] args) {
        initEmployees();
        print();
        System.out.println("Сумма ЗП сотрудников = " + lateSalor());
        System.out.println("Сотрудник с минимальной зарплатой = " + peopleMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой = " + peopleMaxSalary());
        System.out.println("Средняя зарплата = " + averageSalor());
        printFullName();
    }
}




