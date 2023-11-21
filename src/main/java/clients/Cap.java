package clients;

import factory.FactoryClass;

public class Cap extends FactoryClass {

    public Cap(String productColor, String productSize){
        this.productSize = productSize;
        this.productColor = productColor;
        System.out.println("O Boné "+this.productColor+" tamanho "+this.productSize +" foi adicionado ao carrinho!");
    }

}
