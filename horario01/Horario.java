package horario01;

public class Horario {
    int hora, minutos, segundos;

    Horario(int hora, int minutos, int segundos){
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    int emSegundos(){
        int hora_sec = hora * 3600;
        int minutos_sec = minutos * 60;
        
        return hora_sec + minutos_sec + segundos;
    }
}