using System;

public class Program {
    public static void Main(String[] args) {
        AppConsole(0);
    }

    public static void AppConsole(int command){
        Company company = new Company();
        Employee employee;
        int x = 9;
        int indexEmployee;
        String id;
        String name, dateOfBirth, post, employmentDate, dateOfDismissal;
        int salary;
        switch (command) {
            case 0:
                Console.Write("Введите номер команды:\n" +
                                "1 - Добавить нового сотрудника\n" + 
                                "2 - Удалить сотрудника\n" +
                                "3 - Изменить сотрудника\n" +
                                "4 - Вывести информацию о сотруднике\n" +
                                "5 - Вывести информацию о всех сотрудниках\n" +
                                "6 - Выйти из приложения\n");
                
                try
                {
                    x = Convert.ToInt32(Console.ReadLine());
                }
                catch (Exception e)
                {
                    Console.WriteLine("Не введена команда");
                }
                                
                AppConsole(x);
                break;
            case 1:
                Console.Write("Введите имя:\n");
                name = Console.ReadLine();

                Console.Write("Введите дату рождения:\n");
                dateOfBirth = Console.ReadLine();
                Console.Write("Введите должность:\n");
                post = Console.ReadLine();
                Console.Write("Введите дату трудоустройства:\n");
                employmentDate = Console.ReadLine();
                Console.Write("Введите оклад:\n");
                salary = Convert.ToInt32(Console.ReadLine());
                employee = new Employee(name, dateOfBirth, post, employmentDate, salary);
                company.AddEmployee(employee);
                AppConsole(0);
                break;
            case 2:
                Console.Write("Введите ID сотрудника которого нужно удалить:\n");
                id = Console.ReadLine();
                indexEmployee = company.FindEmployee(id);
                if (indexEmployee >= 0)
                {
                    company.DelEmployee(indexEmployee);
                }
                else                 
                    Console.Write("Сотрудника с таким ID не существует!!!!!!!!!!!!!!!!!!!:\n");
                AppConsole(0);
                break;
            case 3:
                Console.Write("Введите ID сотрудника которого нужно изменить:\n");
                id = Console.ReadLine();
                indexEmployee = company.FindEmployee(id);
                if (indexEmployee >= 0)
                {
                    Console.Write("Введите имя:\n");
                    name = Console.ReadLine();
                    Console.Write("Введите дату рождения:\n");
                    dateOfBirth = Console.ReadLine();
                    Console.Write("Введите должность:\n");
                    post = Console.ReadLine();
                    Console.Write("Введите дату трудоустройства:\n");
                    employmentDate = Console.ReadLine();
                    Console.Write("Введите дату увольнения:\n");
                    dateOfDismissal = Console.ReadLine();
                    Console.Write("Введите оклад:\n");
                    salary = Convert.ToInt32(Console.ReadLine());
                    Company.GetEmployee()[indexEmployee].EditEmployee(name, dateOfBirth, post, employmentDate, dateOfDismissal, salary);
                }
                else                 
                    Console.Write("Сотрудника с таким ID не существует!!!!!!!!!!!!!!!!!!!:\n");
                AppConsole(0);
                break;
            case 4:
                Console.Write("Введите ID сотрудника которого нужно просмотреть:\n");
                id = Console.ReadLine();
                indexEmployee = company.FindEmployee(id);
                if (indexEmployee >= 0)
                {
                    Company.GetEmployee()[indexEmployee].GetInfo();;
                }
                else                 
                    Console.Write("Сотрудника с таким ID не существует!!!!!!!!!!!!!!!!!!!:\n");
                AppConsole(0);
                break;  
            case 5:
                try{
                    foreach (Employee item in Company.GetEmployee()) {
                        item.GetInfo();
                    }
                }
                catch (Exception) {
                    Console.Write("Список сотрудников пуст!!!!!!!!!!!!!!!!!!!!!!!!\n");
                }                
                AppConsole(0);
                break; 
            case 6:             
                break;
            default:
                break;
        }
    }
}
