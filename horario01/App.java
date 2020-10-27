package horario01;

public class App {
    public static void main(String[] args) {
        Horario horario = new Horario(12, 20, 38);

        System.out.println(horario.hora + ":" + horario.minutos + ":" + horario.segundos);

        System.out.println("Horario em segundos: " + horario.emSegundos());
    }
}
