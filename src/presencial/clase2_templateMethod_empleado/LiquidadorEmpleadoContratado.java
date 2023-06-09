package presencial.clase2_templateMethod_empleado;

public class LiquidadorEmpleadoContratado extends Liquidador {
    @Override
    protected double calcularSueldo(Empleado empleado) {
        double respuesta = 0;
        if(empleado instanceof EmpleadoContratado){
            EmpleadoContratado empleadoContratado = (EmpleadoContratado) empleado;
            respuesta = empleadoContratado.getCantHoras()*empleadoContratado.getValorHoras();
        }
        return respuesta;
    }

    @Override
    protected String generarRecibo(Empleado empleado) {
        return "La liquidación generada es un documento digital";
    }
}
