package mesas.clase3_templateMethod_menuComida;

public class Infantil extends Menu{
    private Integer cantJuguetes;

    public Infantil(Double precioBase, Integer cantJuguetes) {
        super(precioBase);
        this.cantJuguetes = cantJuguetes;
    }

    public Integer getCantJuguetes() {
        return cantJuguetes;
    }

    public void setCantJuguetes(Integer cantJuguetes) {
        this.cantJuguetes = cantJuguetes;
    }
}
