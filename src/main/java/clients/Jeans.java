package clients;

import factory.FactoryClass;

public class Jeans extends FactoryClass {

    public Jeans(String productColor, String productSize){
        this.productSize = productSize;
        this.productColor = productColor;
        System.out.println("O Jeans "+this.productColor+" tamanho "+this.productSize +" foi adicionado ao carrinho!");
    }

}
