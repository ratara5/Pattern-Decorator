package com.raymond.interf.impl;

import com.raymond.interf.ICuentaBancaria;
import com.raymond.model.Cuenta;
import jdk.swing.interop.SwingInterOpUtils;

public class CuentaAhorro implements ICuentaBancaria {

    @Override
    public void abrirCuenta(Cuenta c) {
        System.out.println("---------------------------");
        System.out.println("Se abrió una cuenta de ahorros");
        System.out.println("Cliente: "+c.getCliente());
    }
}
