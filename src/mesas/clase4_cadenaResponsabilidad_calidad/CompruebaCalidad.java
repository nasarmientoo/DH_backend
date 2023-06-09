package mesas.clase4_cadenaResponsabilidad_calidad;

public class CompruebaCalidad {
    private AnalistaCalidad inicial;
     public CompruebaCalidad(){
         inicial = new AnalistaCalidadLote();
         AnalistaCalidad analistaPeso = new AnalistaCalidadPeso();
         AnalistaCalidad analistaEnvase = new AnalistaCalidadEnvase();

        inicial.setSiguienteAnalistaCalidad(analistaPeso);
        analistaPeso.setSiguienteAnalistaCalidad(analistaEnvase);
     }

     public String compruebaCalidad(Articulo articulo){
         return inicial.comprobarCalidad(articulo);
     }

    public AnalistaCalidad getInicial() {
        return inicial;
    }

    public void setInicial(AnalistaCalidad inicial) {
        this.inicial = inicial;
    }
}
