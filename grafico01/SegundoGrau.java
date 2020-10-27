package grafico01;

public class SegundoGrau {
    int a;
    Grafico saida;

    SegundoGrau(int a){
        this.a = a;
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