public class UsoCuenta {

    public static void main(String[] args) {
	// write your code here
        CuentaCorriente Cuenta1 = new CuentaCorriente("Juan Ignacio",20000.0);
        CuentaCorriente Cuenta2 = new CuentaCorriente("Rodrigo",5000.5);
    //transferencia
        Cuenta1.transferencias(2500,0);
        Cuenta2.transferencias(0,2500);
        System.out.println("Titular:" + Cuenta1.getNombreTitular());
        System.out.println("Saldo: $ " + Cuenta1.getSaldo());
        System.out.println("Titular:" + Cuenta2.getNombreTitular());
        System.out.println("Saldo: $ " + Cuenta2.getSaldo());

    }
}
