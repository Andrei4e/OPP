package HomeWork2;
import java.util.Scanner;

public class Program {

    public static void main(String[] args)
    {
        AppConsole(0);
        //Cat cat = new Cat(25, 5, "Зелёные", "Бобока", "Ашера", true, "Серая", "07.07.2017", true);
        //Chicken chicken = new Chicken(30, 4, "White", 0);
        //Wolf wolf = new Wolf(95, 45, "Серые", "Сибирь", "28.02.2023", true);

        //Zoo zoo = new Zoo();

        //zoo.AddAnimal(cat);
        //zoo.AddAnimal(chicken);
        //zoo.AddAnimal(wolf);
        //zoo.GetInfoAll();
        //zoo.MakeSoundAll();
        //zoo.KillAnimal(1);
        //zoo.GetInfoAll();
        //zoo.MakeSoundAll();

    }

    public static void AppConsole(int command){
        Zoo zoo = new Zoo();
        Scanner scanner = new Scanner(System.in);
        int x = 9;
        int height, weight, flightAltitude;
        String eyeColor, nickname, breed, coatColor, dateOfBirth, habitat, dateFound;
        Boolean vaccinations, isCoat, training, leader;
        switch (command) {
            case 0:
                System.out.printf("Введите номер команды:\n" +
                                "1 - Добавить новое животное в зоопарк\n" + 
                                "2 - Убрать животное из зоопарка\n" +
                                "3 - Напечатать информацию о животном (введя его номер)\n" +
                                "4 - Напечатать информацию о всех животных в зоопарке\n" +
                                "5 - Заставить животное издавать звук(введя его животное)\n" +
                                "6 - Заставить всех животных в зоопарке издать звук\n" + 
                                "7 - Выйти из приложения\n");
                x = scanner.nextInt();                
                AppConsole(x);
                break;
            case 1:
                System.out.printf("Введите номер типа животного, которое хотите добавить:\n" +
                                "10 - Кошка\n" + 
                                "11 - Тигр\n" +
                                "12 - Собака\n" +
                                "13 - Волк\n" + 
                                "14 - Курица\n" +
                                "15 - Аист\n");
                x = scanner.nextInt();
                AppConsole(x);
                break;
            case 2:
                System.out.printf("Введите номер животного, которое хотите убрать из зоопарка:\n");
                x = scanner.nextInt();
                zoo.KillAnimal(x);
                AppConsole(0);
                break;
            case 3:
                System.out.printf("Введите номер животного, для печати информации о нём:\n");
                x = scanner.nextInt();
                zoo.GetInfo(x);
                AppConsole(0);
                break;
            case 4:
                zoo.GetInfoAll();
                AppConsole(0);
                break;
            case 5:
                System.out.printf("Введите номер животного, чтобы оно издало звук:\n");
                x = scanner.nextInt();
                zoo.MakeSound(x);
                AppConsole(0);
                break;
            case 6:
                zoo.MakeSoundAll();
                AppConsole(0);
                break;
            case 7:                
                break;
            case 10:
                System.out.printf("Введите рост кошки:\n");
                height = scanner.nextInt();
                System.out.printf("Введите вес кошки:\n");
                weight = scanner.nextInt();
                System.out.printf("Введите цвет глаз кошки:\n");
                eyeColor = scanner.next();
                System.out.printf("Введите кличку кошки:\n");
                nickname = scanner.next();
                System.out.printf("Введите породу кошки:\n");
                breed = scanner.next();
                System.out.printf("Укажите вакцинирована ли кошка (true или false):\n");
                vaccinations = scanner.nextBoolean();
                System.out.printf("Введите цвет шерсти кошки:\n");
                coatColor = scanner.next();
                System.out.printf("Введите дату рождения кошки:\n");
                dateOfBirth = scanner.next();
                System.out.printf("Укажите наличие шерсти у кошки (true или false):\n");
                isCoat = scanner.nextBoolean();
                Cat cat = new Cat(height, weight, eyeColor, nickname, breed, vaccinations, coatColor, dateOfBirth, isCoat);
                zoo.AddAnimal(cat);
                AppConsole(0);
                break;
            case 11:  
                System.out.printf("Введите рост тигра:\n");
                height = scanner.nextInt();
                System.out.printf("Введите вес тигра:\n");
                weight = scanner.nextInt();
                System.out.printf("Введите цвет глаз тигра:\n");
                eyeColor = scanner.next();
                System.out.printf("Введите место обитания тигра:\n");
                habitat = scanner.next();
                System.out.printf("Введите дату нахождения тигра:\n");
                dateFound = scanner.next();
                Tiger tiger = new Tiger(height, weight, eyeColor, habitat, dateFound);
                zoo.AddAnimal(tiger);
                AppConsole(0);              
                break;
            case 12:   
                System.out.printf("Введите рост собаки:\n");
                height = scanner.nextInt();
                System.out.printf("Введите вес собаки:\n");
                weight = scanner.nextInt();
                System.out.printf("Введите цвет глаз собаки:\n");
                eyeColor = scanner.next();
                System.out.printf("Введите кличку собаки:\n");
                nickname = scanner.next();
                System.out.printf("Введите породу собаки:\n");
                breed = scanner.next();
                System.out.printf("Укажите вакцинирована ли собаки (true или false):\n");
                vaccinations = scanner.nextBoolean();
                System.out.printf("Введите цвет шерсти собаки:\n");
                coatColor = scanner.next();
                System.out.printf("Введите дату рождения собаки:\n");
                dateOfBirth = scanner.next();
                System.out.printf("Укажите наличие дрессировки у собаки (true или false):\n");
                training = scanner.nextBoolean();
                Dog dog = new Dog(height, weight, eyeColor, nickname, breed, vaccinations, coatColor, dateOfBirth, training);
                zoo.AddAnimal(dog);
                AppConsole(0);
                break;
            case 13:   
                System.out.printf("Введите рост волка:\n");
                height = scanner.nextInt();
                System.out.printf("Введите вес волка:\n");
                weight = scanner.nextInt();
                System.out.printf("Введите цвет глаз волка:\n");
                eyeColor = scanner.next();
                System.out.printf("Введите место обитания волка:\n");
                habitat = scanner.next();
                System.out.printf("Введите дату нахождения волка:\n");
                dateFound = scanner.next();
                System.out.printf("Укажите является ли волк вожаком стаи (true или false):\n");
                leader = scanner.nextBoolean();
                Wolf wolf = new Wolf(height, weight, eyeColor, habitat, dateFound, leader);
                zoo.AddAnimal(wolf);
                AppConsole(0);             
                break;
            case 14: 
                System.out.printf("Введите рост курицы:\n");
                height = scanner.nextInt();
                System.out.printf("Введите вес курицы:\n");
                weight = scanner.nextInt();
                System.out.printf("Введите цвет глаз курицы:\n");
                eyeColor = scanner.next();
                System.out.printf("Укажите высоту полета курицы:\n");
                flightAltitude = scanner.nextInt();
                Chicken chicken = new Chicken(height, weight, eyeColor, flightAltitude);
                zoo.AddAnimal(chicken);
                AppConsole(0);                
                break;
            case 15:  
                System.out.printf("Введите рост аиста:\n");
                height = scanner.nextInt();
                System.out.printf("Введите вес аиста:\n");
                weight = scanner.nextInt();
                System.out.printf("Введите цвет глаз аиста:\n");
                eyeColor = scanner.next();
                System.out.printf("Укажите высоту полета аиста:\n");
                flightAltitude = scanner.nextInt();
                Stork stork = new Stork(height, weight, eyeColor, flightAltitude);
                zoo.AddAnimal(stork);
                AppConsole(0);              
                break;
            default:
                break;
        }
    }
}