/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasdao.objetos;

/**
 *
 * @author Arguello Leonel
 */
public class Categoria {
   private Integer id;
   private String denominacion;
   private String descripcion;

    public Categoria() {
    }
   

    public Categoria(String denominacion, String descripcion) {
        this.denominacion = denominacion;
        this.descripcion = descripcion;
    }
   
   

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return denominacion; //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
