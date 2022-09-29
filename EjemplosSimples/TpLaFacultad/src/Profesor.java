public class Profesor extends Persona{
    private double basico;
    private int antiguedad;

    public Profesor(String nombre, String apellido, int legajo,double basico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.basico=basico;
        this.antiguedad=antiguedad;
    }


    public void calcularSueldo(double basico, int antiguedad){
        double sueldo = antiguedad*(basico*0.1)+basico;
        System.out.println("El sueldo del profesor "+ getApellido()+" es: "+ sueldo);
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + super.getNombre() + '\'' +
                ", apellido='" + super.getApellido() + '\'' +
                ", legajo=" + super.getLegajo() + '\'' +
                "basico=" + basico +
                ", antiguedad=" + antiguedad +
                '}';
    }
}
