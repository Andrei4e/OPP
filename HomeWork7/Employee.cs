using System;
public class Employee 
{
    private Guid id;
    private String name;
    private String dateOfBirth;
    private String post;
    private String employmentDate;
    private String dateOfDismissal;
    private int salary;

    public Employee(String name, String dateOfBirth, String post, String employmentDate, String dateOfDismissal, int salary) 
    {
        this.id = Guid.NewGuid();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.post = post;
        this.employmentDate = employmentDate;
        this.dateOfDismissal = dateOfDismissal;
        this.salary = salary;
    }

    public Employee(String name, String dateOfBirth, String post, String employmentDate, int salary) 
    {
        this.id = Guid.NewGuid();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.post = post;
        this.employmentDate = employmentDate;
        this.salary = salary;
    }

    public void GetInfo()
    {
        Console.WriteLine("Идентификатор сотрудника: " + id + "\n" +
                            "Имя: " + name + "\n" +
                            "Дата рождения: " + dateOfBirth + "\n" +
                            "Должность: " + post + "\n" +
                            "Дата трудоустройства: " + employmentDate + "\n" +
                            "Дата увольнения: " + dateOfDismissal + "\n" +
                            "Оклад: " + salary + "\n");
    }

    public Guid GetId()
    {
        return this.id;
    }

    public void EditEmployee(String name, String dateOfBirth, String post, String employmentDate, String dateOfDismissal, int salary)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.post = post;
        this.employmentDate = employmentDate;
        this.dateOfDismissal = dateOfDismissal;
        this.salary = salary;
    }
}