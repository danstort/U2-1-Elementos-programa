public class Calc {

    public static void main(String[] args) {
        
        int t = 40000;
        int hora, minutos, segundos;
        hora= t/3600;
        minutos= (t/60)-(hora*60);
        segundos = t-(hora*3600)-(minutos*60);
        
        System.out.println(hora+" Horas, "+minutos+" Minutos, "+segundos+" segundos");
    }
}
