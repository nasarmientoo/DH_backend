package presencial.clase2_templateMethod_empleado;

public class EmpleadoContratado extends Empleado{

    private int cantHoras;
    private double valorHoras;
    public EmpleadoContratado(String nombre, String apellido, String nroCuenta, int cantHoras, double valorHoras) {
        super(nombre, apellido, nroCuenta);
        this.cantHoras = cantHoras;
        this.valorHoras = valorHoras;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }
}
