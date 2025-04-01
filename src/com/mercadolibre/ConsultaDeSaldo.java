package com.mercadolibre;

public class ConsultaDeSaldo extends Transaccion{
    public ConsultaDeSaldo(Cliente cliente) {
        super(cliente);
    }

    public Double consultarSaldo(){
        transaccionOk();
        return this.cliente.getSaldoEnCuenta();
    }
}
