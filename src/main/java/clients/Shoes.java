package clients;

import factory.FactoryClass;

public class Shoes extends FactoryClass {

    public Shoes(String productColor, String productSize){
        this.productSize = productSize;
        this.productColor = productColor;
        System.out.println("O Tenis "+this.productColor+" tamanho "+this.productSize +" foi adicionado ao carrinho!");
    }

}
