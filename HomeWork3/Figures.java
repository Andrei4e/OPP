package HomeWork3;

public class Figures {
    private static Figure[] figures;

    public void AddFigure(Figure figure){
        int n = 1;
        if (figures == null)
        {
            figures = new Figure[n];
            figures[n-1] = figure;
        }
        else
        {
            n = figures.length;
            Figure[] figuresNew = new Figure[n+1];
            for ( int i = 0; i < n ; i++) {
                figuresNew[i] = figures [i];
            }
            figuresNew[n] = figure;
            figures = new Figure[n+1];
            System.arraycopy(figuresNew, 0, figures, 0, n+1);       
        }     
    }

    public void DelFigure(int j){
        int n = figures.length;

        try {
            Figure[] figuresNew = new Figure[n-1];
            for ( int i = 0; i < n ; i++) {
                if (i < j)   
                    figuresNew[i] = figures [i];
                else 
                    if (i > j)
                        figuresNew [i - 1] = figures[i];          
            }  
            figures = new Figure[n-1];    
            System.arraycopy(figuresNew, 0, figures, 0, n-1);  
        } 
        catch (Exception e) {
            System.out.println("Нет такоq фигуры!!!");
        }
          
    }

    public static void PrintFigureInfo(Figures figures){
        try{ 
            for (Figure figure : Figures.figures) {
                System.out.println(figure);
                System.out.println(String.format("Square: %f", figure.Square()));
                if (figure instanceof Perimeterable){
                    Perimeterable perimeterable = (Perimeterable)figure;
                    System.out.println(String.format("Perimeter: %f", perimeterable.Perimeter()));
                }
                if (figure instanceof Lengthable){
                    Lengthable lengthable = (Lengthable)figure;
                    System.out.println(String.format("Length: %f", lengthable.Length()));
                }
            }        
        } 
        catch (Exception e) {
            System.out.println("Нет фигур!!!");
        }       
    }
}
