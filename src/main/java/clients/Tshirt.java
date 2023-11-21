package clients;

import factory.FactoryClass;

public class Tshirt extends FactoryClass {

    public Tshirt(String productColor, String productSize){
        this.productSize = productSize;
        this.productColor = productColor;
        System.out.println("A Camiseta "+this.productColor+" tamanho "+this.productSize +" foi adicionado ao carrinho!");
    }

}
