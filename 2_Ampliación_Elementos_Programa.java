import java.lang.Math;

/**
 *
 * @author danielsotoortiz
 */
public class Tex {

    public static void main(String[] args) {

        int a1, a2, a3, a4, a5, a6, a7, a8, b2, b3, b4, b5, b6, b7;

        int cant = 232;
        a1 = cant / 500;
        a2 = (cant - (a1 * 500)) / 200;
        b2 = (cant - (a1 * 500)) % 200;
        a3 = (b2) / 100;
        b3 = (b2) % 100;
        a4 = (b3) / 50;
        b4 = (b3) % 50;
        a5 = (b4) / 20;
        b5 = (b4) % 20;
        a6 = (b5) / 10;
        b6 = (b5) % 10;
        a7 = (b6) / 5;
        b7 = (b6) % 5; //Dinero sobrante

    
        System.out.print("El número de billetes es Billetes de 500:"+a1+"\n"
                + "Billetes de 200: " + a2 + "\n"
                + "Billetes de 100: "+a3+"\n"
                + "Billetes de 50: "+a4+"\n"
                + "Billetes de 20: "+a5+"\n"
                + "Billetes de 10: "+a6+"\n"
                + "Billetes de 5: "+a7+"\n"
                + "Y sobran "+b7+"€");

    }
}
