package com.raymond;

import com.raymond.decorador.BlindajeDecorador;
import com.raymond.interf.ICuentaBancaria;
import com.raymond.interf.impl.CuentaAhorro;
import com.raymond.model.Cuenta;

public class App {

    public static void main(String[] args){

        Cuenta c=new Cuenta(1,"Raymond");

        ICuentaBancaria cuenta=new CuentaAhorro();
        ICuentaBancaria cuentaBlindada=new BlindajeDecorador(cuenta);

        //cuenta.abrirCuenta(c);
        cuentaBlindada.abrirCuenta(c);

    }
}
