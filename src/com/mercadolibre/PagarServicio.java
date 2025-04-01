package com.mercadolibre;

public class PagarServicio extends Transaccion{

    public PagarServicio(Cliente cliente) {
        super(cliente);
    }

    public void realizarPago(Double dineroAPagar){
        if(this.cliente.getSaldoEnCuenta() >= dineroAPagar){
            this.cliente.setSaldoEnCuenta(this.cliente.getSaldoEnCuenta() - dineroAPagar);
            System.out.println(transaccionOk());
        } else {
            System.out.println(transaccionNoOk());
        }
    }
}
