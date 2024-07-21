package cuenta;

public class Main {
    public static void main(String[] args) {
        // Crear dos instancias de CuentaCorriente
        CuentaCorriente cuenta1 = new CuentaCorriente("Andres", 1990182 ,1000);
        CuentaCorriente cuenta2 = new CuentaCorriente("Valeria", 342219 );
        System.out.println();

        // Verificar instancias creadas
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println();

        // Verificar método set para titular para primera instancia
        cuenta1.setTitular("Marcos");
        System.out.println();

        // Verificar método set para saldo para primera instancia
        cuenta1.setSaldo(9990);
        System.out.println(cuenta1);
        System.out.println();

        // Verificar método set para titular para segunda instancia
        cuenta2.setTitular("Constanza");
        System.out.println();

        // Verificar método set para saldo para segunda instancia
        cuenta2.setSaldo(11990);
        System.out.println(cuenta2);
        System.out.println();

        // Pruebas de métodos abonar y cargar para primera instancia
        // Verificar método abonar con número positivo
        System.out.println("PRUEBA ABONAR CON NÚMERO POSITIVO");
        cuenta1.abonar(1000);
        System.out.println();

        // Verificar método abonar con número negativo
        System.out.println("PRUEBA ABONAR CON NÚMERO NEGATIVO");
        cuenta1.abonar(-100000);
        System.out.println();

        // Verificar método cargar con monto menor al saldo
        System.out.println("PRUEBA CARGAR CON MONTO MENOR AL SALDO");
        cuenta1.cargar(2000);
        System.out.println();

        // Verificar método cargar con monto mayor al saldo
        System.out.println("PRUEBA CARGAR CON MONTO MAYOR AL SALDO");
        cuenta1.cargar(2000000000);
        System.out.println();

        // Pruebas métodos abonar y cargar para segunda instancia
        // Verificar método abonar
        System.out.println("PRUEBA ABONAR PARA SEGUNDA INSTANCIA");
        cuenta2.abonar(3000);
        System.out.println();

        // Verificar método cargar
        System.out.println("PRUEBA CARGAR PARA SEGUNDA INSTANCIA");
        cuenta2.cargar(10000000);
    }
}