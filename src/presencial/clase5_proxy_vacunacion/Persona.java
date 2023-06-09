package presencial.clase5_proxy_vacunacion;
//1
import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private String documento;
    private Integer cantDosis;
    private String nombreVacuna;
    private Date fechaAsignada;

    public Persona(String nombre, String apellido, String documento, Integer cantDosis, String nombreVacuna, Date fechaAsignada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.cantDosis = cantDosis;
        this.nombreVacuna = nombreVacuna;
        this.fechaAsignada = fechaAsignada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getCantDosis() {
        return cantDosis;
    }

    public void setCantDosis(Integer cantDosis) {
        this.cantDosis = cantDosis;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public Date getFechaAsignada() {
        return fechaAsignada;
    }

    public void setFechaAsignada(Date fechaAsignada) {
        this.fechaAsignada = fechaAsignada;
    }
}
