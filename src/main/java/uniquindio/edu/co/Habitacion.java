package uniquindio.edu.co;

import java.util.List;

public class Habitacion {
    private String numeroHabitacion, tipo, estado;
    private int capacidadMaxima;
    private double precioNoche;
    private boolean disponibilidad;

    /**
     * Metodo constructor de la clase Habitacion
     * @param numeroHabitacion numero de la habitacion
     * @param tipo tipo de habitacion
     * @param capacidadMaxima capacidad maxima de la habitacion
     * @param precioNoche precio de la habitacion por noche
     * @param disponibilidad disponibilidad de la habitacion
     * @param estado estado actual de la habitacion
     */
    public Habitacion(String numeroHabitacion, String tipo, int capacidadMaxima,
                      double precioNoche, boolean disponibilidad, String estado) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.capacidadMaxima = capacidadMaxima;
        this.precioNoche = precioNoche;
        this.disponibilidad = disponibilidad;
        this.estado = estado;
    }
    //relaciones
    private List<Reserva> listhabitacionReservas;


    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public List<Reserva> getListhabitacionReservas() {
        return listhabitacionReservas;
    }

    public void setListhabitacionReservas(List<Reserva> listhabitacionReservas) {
        this.listhabitacionReservas = listhabitacionReservas;
    }


}
