package com.mercadolibre;

public abstract class Transaccion implements Transaccionable{
    Cliente cliente;

    public Transaccion(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String transaccionOk() {
        return null;
    }

    @Override
    public String transaccionNoOk() {
        return null;
    }
}
