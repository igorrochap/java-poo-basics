package grafico01;

public class SegundoGrau {
    int a, b, c;
    Grafico saida;

    SegundoGrau(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        saida = null;
    }

    void conn(Grafico saida){
        this.saida = saida;
    }

    void show(){
        if(saida != null){
            for(int i = 1; i <= a; i++){
                saida.plot(i);
            }
            for(int i = a; i > 0; i--){
                saida.plot(i);
            }
        }
    }
}