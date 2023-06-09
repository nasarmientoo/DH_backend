package mesas.clase3_templateMethod_menuComida;

public class Vegetariano extends Menu{
 private Boolean tieneEspecias;
 private Integer cantSalsas;

 public Vegetariano(Double precioBase, Boolean tieneEspecias, Integer cantSalsas) {
  super(precioBase);
  this.tieneEspecias = tieneEspecias;
  this.cantSalsas = cantSalsas;
 }

 public Boolean getTieneEspecias() {
  return tieneEspecias;
 }

 public void setTieneEspecias(Boolean tieneEspecias) {
  this.tieneEspecias = tieneEspecias;
 }

 public Integer getCantSalsas() {
  return cantSalsas;
 }

 public void setCantSalsas(Integer cantSalsas) {
  this.cantSalsas = cantSalsas;
 }
}
