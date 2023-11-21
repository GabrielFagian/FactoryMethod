package decision;

import clients.*;
import factory.FactoryClass;

public class ClientConstructor {

    public FactoryClass getFactoryClass( String productId, String productColor, String productSize) {
        if (productId.equals("1")) {
            return new Cap(productColor, productSize);
        } else if (productId.equals("2")) {
            return new Shoes(productColor, productSize);
        } else if (productId.equals("3")) {
            return new Tshirt(productColor, productSize);
        } else if (productId.equals("4")) {
            return new Jeans(productColor, productSize);
        } else
            return new Sunglass(productColor, productSize);
    }
}