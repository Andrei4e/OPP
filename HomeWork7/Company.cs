using System;

public class Company {
    private static Employee[] employees;

    public void AddEmployee(Employee employee){
        int n = 1;
        if (employees == null)
        {
            employees = new Employee[n];
            employees[n-1] = employee;
        }
        else
        {
            n = employees.Length;
            Employee[] figuresNew = new Employee[n+1];
            for ( int i = 0; i < n ; i++) {
                figuresNew[i] = employees [i];
            }
            figuresNew[n] = employee;
            employees = new Employee[n+1];
            Array.Copy(figuresNew, 0, employees, 0, n+1);       
        }     
    }

    public void DelEmployee(int j){
        int n = employees.Length;

        try {
            Employee[] figuresNew = new Employee[n-1];
            for ( int i = 0; i < n ; i++) {
                if (i < j)   
                    figuresNew[i] = employees [i];
                else 
                    if (i > j)
                        figuresNew [i - 1] = employees[i];          
            }  
            employees = new Employee[n-1];    
            Array.Copy(figuresNew, 0, employees, 0, n-1);  
        } 
        catch (Exception e) {
            Console.WriteLine("Нет такого Сотрудника!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        }          
    }  
    
    public static Employee[] GetEmployee(){
        return employees;
    }

    public int FindEmployee(String id){
        int result = -1;
        int i = 0;
        foreach (Employee employee in employees)
        {
            if (employee.GetId().ToString().Equals(id))
                result = i;
            i++;
        }
        return result;
    }
}
