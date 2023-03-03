import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Employee>> employeesByDepartment = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        Employee employee;
        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            employee = new Employee(name, salary, position, department);

            if (input.length == 5) {

                Pattern pattern = Pattern.compile("^\\d+$");
                Matcher matcher = pattern.matcher(input[4]);
                if (matcher.find()) {
                    employee.setAge(Integer.parseInt(input[4]));
                } else {
                    employee.setEmail(input[4]);
                }
            } else if (input.length == 6) {

                employee.setEmail(input[4]);
                employee.setAge(Integer.parseInt(input[5]));
            }

            List<Employee> employees;
            if (!employeesByDepartment.containsKey(department)) {
                employees = new ArrayList<>();
            } else {
                employees = employeesByDepartment.get(department);
            }
            employees.add(employee);
            employeesByDepartment.put(department, employees);
        }
        employeesByDepartment.entrySet()
                .stream()
                .sorted((d1, d2) -> Double.compare(
                        (d2.getValue().stream().mapToDouble(e -> e.getSalary()).sum() / d2.getValue().size()),
                        (d1.getValue().stream().mapToDouble(e -> e.getSalary()).sum() / d1.getValue().size())))
                .limit(1)
                .forEach(d -> {
                    System.out.println("Highest Average Salary: " + d.getKey());

                    d.getValue().stream()
                            .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                            .forEach(e -> {
                                System.out.println(e);
                            });
                });
    }
}