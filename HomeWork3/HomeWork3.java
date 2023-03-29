package HomeWork3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        AppConsole(0);
    }

    public static void AppConsole(int command){
        Figures figures = new Figures();
        Scanner scanner = new Scanner(System.in);
        int x = 9;
        double a, b , c;
        switch (command) {
            case 0:
                System.out.printf("Введите номер команды:\n" +
                                "1 - Вывод информации о всех периметрах, площадях и длинах окружности всех фигур\n" + 
                                "2 - Добавить новую фигуру\n" +
                                "3 - удалить фигуру (введя её номер)\n" +
                                "4 - Выйти из приложения\n");
                x = scanner.nextInt();                
                AppConsole(x);
                break;
            case 1:
                Figures.PrintFigureInfo(figures);
                AppConsole(0);
                break;
            case 2:
                System.out.printf("Введите номер фигуры, которую хотите добавить:\n" +
                                    "5 - Треугольник\n" + 
                                    "6 - Квадрат\n" +
                                    "7 - Прямоугольник\n" +
                                    "8 - Круг\n");
                x = scanner.nextInt();
                AppConsole(x);
                break;
            case 3:
                System.out.printf("Введите номер фигуры, которую хотите удалить:\n");
                x = scanner.nextInt();
                figures.DelFigure(x);
                AppConsole(0);
                break;
            case 4:                
                break;  
            case 5:
                System.out.printf("Введите сторону а:\n");
                a = scanner.nextDouble();
                System.out.printf("Введите сторону b:\n");
                b = scanner.nextDouble();
                System.out.printf("Введите сторону c:\n");
                c = scanner.nextDouble();
                Triangle triangle = new Triangle(a, b, c);
                figures.AddFigure(triangle);
                AppConsole(0);
                break; 
            case 6: 
                System.out.printf("Введите сторону а:\n");
                a = scanner.nextDouble();
                Quadrate quadrate = new Quadrate(a);
                figures.AddFigure(quadrate); 
                AppConsole(0);              
                break;  
            case 7:  
                System.out.printf("Введите сторону а:\n");
                a = scanner.nextDouble();
                System.out.printf("Введите сторону b:\n");
                b = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(a, b);
                figures.AddFigure(rectangle); 
                AppConsole(0);             
                break;  
            case 8: 
                System.out.printf("Введите радиус:\n");
                a = scanner.nextDouble();
                Circle circle = new Circle(a);
                figures.AddFigure(circle);  
                AppConsole(0);          
                break;        
            default:
                break;
        }
        scanner.close();
    }
}
