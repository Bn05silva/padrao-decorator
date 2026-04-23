package app;

import bebidas.Bebida;
import bebidas.Cafe;
import bebidas.Cha;
import decoradores.Chantilly;
import decoradores.Chocolate;
import decoradores.Leite;

public class App {
    public static void main(String[] args) {
        Bebida pedido1 = new Leite(new Cafe());
        System.out.println(pedido1.getDescricao() + " - R$" + pedido1.getPreco());

        Bebida pedido2 = new Chantilly(new Chocolate(new Cha()));
        System.out.println(pedido2.getDescricao() + " - R$" + pedido2.getPreco());
    }
}
