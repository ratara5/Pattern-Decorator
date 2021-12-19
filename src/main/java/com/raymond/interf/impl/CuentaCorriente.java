package com.raymond.interf.impl;

import com.raymond.interf.ICuentaBancaria;
import com.raymond.model.Cuenta;

public class CuentaCorriente implements ICuentaBancaria {
    @Override
    public void abrirCuenta(Cuenta c) {
        System.out.println("--------------------");
        System.out.println("Se abrió una cuenta corriente");
        System.out.println("Cliente: "+c.getCliente());
    }
}
