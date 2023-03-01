import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Employee>> departmentSalaries = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            Employee employee = new Employee(name, salary, position, department);

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
            if (!departmentSalaries.containsKey(department)) {
                employees = new ArrayList<>();
            } else {
                employees = departmentSalaries.get(department);
            }
            employees.add(employee);
            departmentSalaries.put(department, employees);
        }






    }
}