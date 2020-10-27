package grafico01;

public class Grafico {
    boolean filled;
    char carac;

    Grafico(boolean filled, char carac){
        this.filled = filled;
        this.carac = carac;
    }

    void plot(int v){
        for(int i = 1; i < v; i++){
            System.out.print((filled) ? carac : ' ');
        }
        System.out.println(carac);
    }
}