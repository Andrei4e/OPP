package HomeWork5;
import java.util.UUID;

public class Employee {
    private UUID id;
    private String name;
    private String dateOfBirth;
    private String post;
    private String employmentDate;
    private String dateOfDismissal;
    private int salary;

    public Employee(String name, String dateOfBirth, String post, String employmentDate, String dateOfDismissal, int salary) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.post = post;
        this.employmentDate = employmentDate;
        this.dateOfDismissal = dateOfDismissal;
        this.salary = salary;
    }

    public Employee(String name, String dateOfBirth, String post, String employmentDate, int salary) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.post = post;
        this.employmentDate = employmentDate;
        this.salary = salary;
    }

    public void GetInfo(){
        System.out.println("Идентификатор сотрудника: " + id + "\n" +
                            "Имя: " + name + "\n" +
                            "Дата рождения: " + dateOfBirth + "\n" +
                            "Должность: " + post + "\n" +
                            "Дата трудоустройства: " + employmentDate + "\n" +
                            "Дата увольнения: " + dateOfDismissal + "\n" +
                            "Оклад: " + salary + "\n");
    }

    public UUID GetId(){
        return this.id;
    }

    public void EditEmployee(String name, String dateOfBirth, String post, String employmentDate, String dateOfDismissal, int salary){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.post = post;
        this.employmentDate = employmentDate;
        this.dateOfDismissal = dateOfDismissal;
        this.salary = salary;
    }
}
