package HomeWork5;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        AppConsole(0);
    }

    public static void AppConsole(int command){
        Company company = new Company();
        Employee employee;
        Scanner scanner = new Scanner(System.in);
        int x = 9;
        int indexEmployee;
        String id;
        String name, dateOfBirth, post, employmentDate, dateOfDismissal;
        int salary;
        switch (command) {
            case 0:
                System.out.printf("Введите номер команды:\n" +
                                "1 - Добавить нового сотрудника\n" + 
                                "2 - Удалить сотрудника\n" +
                                "3 - Изменить сотрудника\n" +
                                "4 - Вывести информацию о сотруднике\n" +
                                "5 - Вывести информацию о всех сотрудниках\n" +
                                "6 - Выйти из приложения\n");
                x = scanner.nextInt();                
                AppConsole(x);
                break;
            case 1:
                System.out.printf("Введите имя:\n");
                name = scanner.next();
                System.out.printf("Введите дату рождения:\n");
                dateOfBirth = scanner.next();
                System.out.printf("Введите должность:\n");
                post = scanner.next();
                System.out.printf("Введите дату трудоустройства:\n");
                employmentDate = scanner.next();
                System.out.printf("Введите оклад:\n");
                salary = scanner.nextInt();
                employee = new Employee(name, dateOfBirth, post, employmentDate, salary);
                company.AddEmployee(employee);
                AppConsole(0);
                break;
            case 2:
                System.out.printf("Введите ID сотрудника которого нужно удалить:\n");
                id = scanner.next();
                indexEmployee = company.FindEmployee(id);
                if (indexEmployee >= 0)
                {
                    company.DelEmployee(indexEmployee);
                }
                else                 
                    System.out.printf("Сотрудника с таким ID не существует!!!!!!!!!!!!!!!!!!!:\n");
                AppConsole(0);
                break;
            case 3:
                System.out.printf("Введите ID сотрудника которого нужно изменить:\n");
                id = scanner.next();
                indexEmployee = company.FindEmployee(id);
                if (indexEmployee >= 0)
                {
                    System.out.printf("Введите имя:\n");
                    name = scanner.next();
                    System.out.printf("Введите дату рождения:\n");
                    dateOfBirth = scanner.next();
                    System.out.printf("Введите должность:\n");
                    post = scanner.next();
                    System.out.printf("Введите дату трудоустройства:\n");
                    employmentDate = scanner.next();
                    System.out.printf("Введите дату увольнения:\n");
                    dateOfDismissal = scanner.next();
                    System.out.printf("Введите оклад:\n");
                    salary = scanner.nextInt();
                    Company.GetEmployee()[indexEmployee].EditEmployee(name, dateOfBirth, post, employmentDate, dateOfDismissal, salary);
                }
                else                 
                    System.out.printf("Сотрудника с таким ID не существует!!!!!!!!!!!!!!!!!!!:\n");
                AppConsole(0);
                break;
            case 4:
                System.out.printf("Введите ID сотрудника которого нужно просмотреть:\n");
                id = scanner.next();
                indexEmployee = company.FindEmployee(id);
                if (indexEmployee >= 0)
                {
                    Company.GetEmployee()[indexEmployee].GetInfo();;
                }
                else                 
                    System.out.printf("Сотрудника с таким ID не существует!!!!!!!!!!!!!!!!!!!:\n");
                AppConsole(0);
                break;  
            case 5:
                try{
                    for (Employee item : Company.GetEmployee()) {
                        item.GetInfo();
                    }
                }
                catch (Exception e) {
                    System.out.println("Список сотрудников пуст!!!!!!!!!!!!!!!!!!!!!!!!\n");
                }                
                AppConsole(0);
                break; 
            case 6:             
                break;
            default:
                break;
        }
        scanner.close();
    }
}
