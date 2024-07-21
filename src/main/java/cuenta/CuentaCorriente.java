//paquete contenedor
package cuenta;



//clase
public class CuentaCorriente {
    String titular;
    Integer numeroCuenta;
    Integer saldo;

    //constructor con saldo
    public CuentaCorriente(String titular, Integer numeroCuenta, Integer saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //constructor sin saldo
    public CuentaCorriente(String titular, Integer numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    //Metodo get titular
    public String getTitular() {
        return titular;
    }

    //Metodo get titular
    public Integer getnumeroCuenta() {
        return numeroCuenta;
    }

    //Metodo get saldo
    public Integer getSaldo() {
        return saldo;
    }

    //Metodo set titular
    public void setTitular(String titular) {
        this.titular = titular;
        System.out.println("El nombre del titular ingresado es: " + titular);
    }

    //Metodo set saldo
    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
        System.out.println("El saldo de la cuenta es: " + saldo);
    }

    @Override
    public String toString() {
        return "Cuenta Corriente [titular: " + titular + ", numero de cuente: " +numeroCuenta + ", saldo: " + saldo + "]";
    }

    //METODO ABONAR
    public void abonar(Integer monto) {
        if (monto <=0) {
            System.out.println("El monto debe ser mayor a cero para realizar un abono. Su saldo es de: " +saldo);
        } else {
            this.saldo += monto;
            System.out.println("Se ha realizado un abono de: " + monto);
            System.out.println("Su nuevo saldo es de: " + saldo);
        }
    }

    //METODO CARGO
    public void cargar(Integer cargo) {
        if (cargo > saldo) {
            saldo = 0;
            System.out.println("Su saldo es de: " + saldo);
        } else {
            this.saldo -= cargo;
            System.out.println("Se ha realizado un cargo de: " + cargo);
            System.out.println("Su nuevo saldo es de: " + saldo);
        }
    }
}


