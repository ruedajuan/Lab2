import java.util.Random;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numerocuenta;

    public CuentaCorriente(String nombreTitular,double saldo){
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        Random r = new Random();
        this.numerocuenta = r.nextLong();
    }
    public String getNombreTitular(){
        return nombreTitular;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setIngreso(double ingreso){
        this.saldo=saldo+ingreso;
    }
    public void setReintegro (double reintegro){
        this.saldo=saldo-reintegro;
    }
    public void transferencias(double montoATransferir,double montoARecibir){
        if(montoATransferir>montoARecibir) {
            if (saldo > montoATransferir) {
                this.saldo = saldo - montoATransferir;

            } else {
                System.out.println(getNombreTitular() + ": Su cuenta no tiene suficiente dinero, para realizar la transferencia");
                System.exit(0);
            }
        }
        else if(montoATransferir<montoARecibir){
            this.saldo = saldo+montoARecibir;
        }
    }
}
