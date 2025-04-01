package com.mercadolibre;

public class Cobrador implements Transaccionable{
    /* Cobradores: Realizan retiro de efectivo y consulta de saldos.*/
    Integer dineroEnCuenta;

    public Cobrador(Integer dineroEnCuenta) {
        this.dineroEnCuenta = dineroEnCuenta;
    }

    public Integer getDineroEnCuenta() {
        return dineroEnCuenta;
    }

    public void setDineroEnCuenta(Integer dineroEnCuenta) {
        this.dineroEnCuenta = dineroEnCuenta;
    }

    public void realizarConsultaDeSaldo(){
        System.out.println("Su saldo en cuenta es: $" + this.dineroEnCuenta);
    }

    public void retiroDeEfectivo(Integer dineroARetirar){
        if(this.dineroEnCuenta >= dineroARetirar)  {
            this.dineroEnCuenta -= dineroARetirar;
            System.out.println(this.transaccionOk());
        } else {
            System.out.println(this.transaccionNoOk());
        }
    }


    @Override
    public String transaccionOk() {
        String messsage = "La transacción se ha realizado con éxito";
        return messsage;
    }

    @Override
    public String transaccionNoOk() {
        String messsage = "La transacción no se pudo realiar";
        return messsage;
    }
}
