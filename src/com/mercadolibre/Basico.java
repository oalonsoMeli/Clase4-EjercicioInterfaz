package com.mercadolibre;

public class Basico extends Cliente{
 /*Realizan consultas de saldo, pagos de servicios y retiro de efectivo.*/
    public Basico(Double saldoEnCuenta) {
        super(saldoEnCuenta);
    }

    public void consultarSaldo(){
        ConsultaDeSaldo cs = new ConsultaDeSaldo(this);
        cs.consultarSaldo();
        System.out.println("Saldo actual: " + this.getSaldoEnCuenta());
    }

    public void pagarServicio(Double dineroAPagar){
        PagarServicio ps = new PagarServicio(this);
        ps.realizarPago(dineroAPagar);
        System.out.println("Saldo actual: " + this.getSaldoEnCuenta());
    }

    public void retirarDinero(Double dineroARetirar){
        RetiroEfectivo re = new RetiroEfectivo(this);
        re.retirarEfectivo(dineroARetirar);
        System.out.println("Saldo actual: " + this.getSaldoEnCuenta());
    }

}

