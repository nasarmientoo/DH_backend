package presencial.clase2_templateMethod_empleado;

public abstract class Liquidador {
    public String liquidarSueldo(Empleado empleado){
        String respuesta = "La liquidación no fue calculada";
        double sueldo = calcularSueldo(empleado);
        if(sueldo>0){
            String recibo = generarRecibo(empleado);
            String deposito = depositar(empleado);
            respuesta = recibo + " Saldo a liquidar: " + sueldo + deposito;
        }
        return respuesta;
    }
    protected abstract double calcularSueldo(Empleado empleado);
    protected abstract String generarRecibo(Empleado empleado);
    private String depositar(Empleado empleado){
        return "Deposito en la cuenta " + empleado.getNroCuenta();
    }

}
