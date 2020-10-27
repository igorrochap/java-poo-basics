package grafico01;

public class AppGrafico01 {
    public static void main(String[] args) {
        int a = 12;
        int b = -2;
        int c = 6;
        SegundoGrau f = new SegundoGrau(a, b, c);
        Grafico g = new Grafico(true, '*');

        f.conn(g);
        f.show();
    }
}