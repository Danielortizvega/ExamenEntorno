package Ejercicio3;

public class Cuenta {
	
	    private double saldo;

	    public Cuenta(double saldo) {
	        this.saldo = saldo;
	    }

	    public int ExceptionSaldoInsuficiente(double cantidad) {
	        if (cantidad > saldo) return -1;
	        else { saldo -= cantidad; return 0; }
	    }
	}
