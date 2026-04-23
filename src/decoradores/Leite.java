package decoradores;

import bebidas.Bebida;

public class Leite extends BebidaDecorator{
    public Leite(Bebida bebida){
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + "com leite";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.5;
    }
}
