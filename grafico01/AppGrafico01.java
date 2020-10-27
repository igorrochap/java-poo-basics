package grafico01;

public class AppGrafico01 {
    public static void main(String[] args) {
        SegundoGrau f = new SegundoGrau(12);
        Grafico g = new Grafico(true, '*');

        f.conn(g);
        f.show();
    }
}