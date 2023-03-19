package HomeWork2;

public class Zoo {
    private static Animal[] zoo;

    public void AddAnimal(Animal animal){
        int n = 1;
        if (zoo == null)
        {
            zoo = new Animal[n];
            zoo[n-1] = animal;
        }
        else
        {
            n = zoo.length;
            Animal[] zooNew = new Animal[n+1];
            for ( int i = 0; i < n ; i++) {
                zooNew[i] = zoo [i];
            }
            zooNew[n] = animal;
            zoo = new Animal[n+1];
            System.arraycopy(zooNew, 0, zoo, 0, n+1);       
        }     
    }

    public void KillAnimal(int j){
        int n = zoo.length;

        try {
            Animal[] zooNew = new Animal[n-1];
            for ( int i = 0; i < n ; i++) {
                if (i < j)   
                    zooNew[i] = zoo [i];
                else 
                    if (i > j)
                        zooNew [i - 1] = zoo[i];          
            }  
            zoo = new Animal[n-1];    
            System.arraycopy(zooNew, 0, zoo, 0, n-1);  
        } 
        catch (Exception e) {
            System.out.println("Нет такого животного в зоопарке!!!");
        }
          
    }

    public void GetInfo(int i){
        try {
            zoo[i].PrintInfo();  
        } 
        catch (Exception e) {
            System.out.println("Нет такого животного в зоопарке!!!");
        }
    }

    public void MakeSound(int i){           
        try {
            zoo[i].MakeSound();  
        } 
        catch (Exception e) {
            System.out.println("Нет такого животного в зоопарке!!!");
        }
    }

    public void GetInfoAll(){
        try {
            for (Animal animal : zoo) {
                animal.PrintInfo();
            } 
        } 
        catch (Exception e) {
            System.out.println("Нет животных в зоопарке!!!");
        }         
    }

    public void MakeSoundAll(){         
        try {
            for (Animal animal : zoo) {
                animal.MakeSound();
            } 
        } 
        catch (Exception e) {
            System.out.println("Нет животных в зоопарке!!!");
        }     
    }
}
