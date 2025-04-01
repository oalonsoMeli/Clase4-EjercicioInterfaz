package com.mercadolibre;

public class Ejecutivo extends Cliente{


    public Ejecutivo(Double saldoEnCuenta) {
        super(saldoEnCuenta);
    }

    public void realizarDeposito(Double dineroAIngresar){
        Deposito deposito = new Deposito(this);
        deposito.realizarDeposito(dineroAIngresar);
    }

    public void realizarTransferencia(Double dineroATransferir){
        Transferencia transferencia = new Transferencia(this);
        transferencia.realizarTransferencia(dineroATransferir);
    }
}
