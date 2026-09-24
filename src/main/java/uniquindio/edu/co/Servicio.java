package uniquindio.edu.co;

public class Servicio {
    private String codigo, nombre, descripcion;
    private double  precio;
    private boolean disponibilidad;

    public Servicio(String codigo,String nombre,String descripcion,double precio,boolean disponibilidad){
        this.codigo=codigo;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
        this.disponibilidad=disponibilidad;
    }

}
