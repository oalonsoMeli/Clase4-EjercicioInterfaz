package com.mercadolibre;

public class Ejecutivo implements Transaccionable{
   private Integer dineroEnCuenta;


    public Ejecutivo(Integer dineroEnCuenta) {
        this.dineroEnCuenta = dineroEnCuenta;
    }

    public Integer getDineroEnCuenta() {
        return dineroEnCuenta;
    }

    public void setDineroEnCuenta(Integer dineroEnCuenta) {
        this.dineroEnCuenta = dineroEnCuenta;
    }

    public void realizarDeposito(Integer dineroAIngresar){
        System.out.println("Se esta intentando realizar la operación . . .");
        this.dineroEnCuenta += dineroAIngresar;
        System.out.println(this.transaccionOk());
    }

    public void transferirDinero(Integer dineroATransferir){
        if(this.dineroEnCuenta >= dineroATransferir)  {
            this.dineroEnCuenta -= dineroATransferir;
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
