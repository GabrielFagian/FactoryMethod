package clients;

import factory.FactoryClass;

public class Sunglass extends FactoryClass {

    public Sunglass(String productColor, String productSize){
        this.productSize = productSize;
        this.productColor = productColor;
        System.out.println("O Óculos de sol "+this.productColor+" tamanho "+this.productSize +" foi adicionado ao carrinho!");
    }

}
