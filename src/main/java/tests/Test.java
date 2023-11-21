package tests;
import decision.ClientConstructor;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {

        ClientConstructor clientConstructor = new ClientConstructor();


        System.out.println("\nQual produto deseja adicionar ao carrinho? \n Digite '1' para Boné:\n" +
                " Digite '2' para Tenis: \n Digite '3' para Camiseta:" +
                " \n Digite '4' para Jeans: \n Digite '5' para Óculos de sol:\n");

        clientConstructor.getFactoryClass("1", "Branco","Único");
        clientConstructor.getFactoryClass("2", "Verde","41");
        clientConstructor.getFactoryClass("3", "Vermelho","M");
        clientConstructor.getFactoryClass("4", "Azul","M");
        clientConstructor.getFactoryClass("5", "Cinza","P");


        long start = System.nanoTime();
        long elapsedTime = System.nanoTime() - start;

        double seconds = TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
        double secondDecimalPrecision = (double)elapsedTime / 1000000000.0;
        double ms = TimeUnit.MILLISECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
        double minutes = TimeUnit.MINUTES.convert(elapsedTime, TimeUnit.NANOSECONDS);

        System.out.printf("\n\nNanoseconds: %d ms\n", elapsedTime );
        System.out.printf("Miliseconds: %f ms\n", ms );
        System.out.printf("Seconds: %f ms\n", seconds);
        System.out.printf("Seconds2: %f ms\n", secondDecimalPrecision);
        System.out.printf("MInutes: %f ms\n", minutes);
    }
}
