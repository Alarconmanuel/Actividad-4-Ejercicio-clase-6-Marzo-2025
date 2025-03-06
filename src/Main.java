import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int min = 1, max = 6, dado, vidas = 5, puntos = 0, ronda = 1;
        Random ale = new Random();

        System.out.println("Dado del Destino");
        System.out.println("Tienes 5 vidas \n" +
                "si sale 1 pierdes una vida \n" +
                "si sale el 6 ganas 3 puntos \n" +
                "si sale el 2 o 4 ganas 1 punto \n" +
                "si sale 3 o 5 no pasa nada \n" +
                "Se acaba al tener más de 10 puntos o al quedarte sin vidas");

        while (vidas > 0 && puntos <= 10) {
            dado = ale.nextInt((max - min + 1)) + min;

            System.out.println("Ronda: " + ronda);
            switch (dado) {
                case 6 -> {
                    puntos += 3;
                    System.out.println("¡Ganaste 3 puntos!");
                }
                case 1 -> {
                    vidas -= 1;
                    System.out.println("Perdiste una vida.");
                }
                case 2, 4 -> {
                    puntos += 1;
                    System.out.println("Ganaste 1 punto.");
                }
                case 3, 5 -> System.out.println("No pasa nada.");
            }

            System.out.println("Cara del dado:" + dado + " Vidas:" + vidas + " Puntos:" + puntos);
            ronda++;
        }

        if (vidas == 0) {
            System.out.println("Se acabó el juego, te quedaste sin vidas.");
        } else if (puntos > 10) {
            System.out.println("Felicitaciones ganaste!");
        }
    }
}
