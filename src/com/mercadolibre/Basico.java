package com.mercadolibre;

public class Basico implements Transaccionable{
    /*Básico: Realizan consultas de saldo, pagos de servicios y retiro de efectivo.*/
    Integer dineroEnCuenta;

    public Basico(Integer dineroEnCuenta) {
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

    public void pagarServicio(Integer dineroAPagar){
        if(this.dineroEnCuenta >= dineroAPagar)  {
            this.dineroEnCuenta -= dineroAPagar;
            System.out.println(this.transaccionOk());
        } else {
            System.out.println(this.transaccionNoOk());
        }
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

