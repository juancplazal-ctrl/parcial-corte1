package uniquindio.edu.co.model;

import java.util.List;

public class Reserva {
    private String codigo, fechaRealizacion, fechaEntrada, fechaSalida, estado, metodoPago;
    private double valorTotal;
    /**
     * Metodo constructor de la clase Reserva
     * @param codigo codigo de la reserva
     * @param fechaRealizacion fecha en que se realiza la reserva
     * @param fechaEntrada fecha de entrada del huesped
     * @param fechaSalida fecha de salida del huesped
     * @param estado estado actual de la reserva
     * @param metodoPago metodo de pago utilizado
     * @param valorTotal valor total de la reserva
     */

    public Reserva(String codigo,String fechaRealizacion, String fechaEntrada, String fechaSalida,String estado,String metodoPago,double valorTotal){
        this.codigo=codigo;
        this.fechaRealizacion=fechaRealizacion;
        this.fechaEntrada=fechaEntrada;
        this.fechaSalida=fechaSalida;
        this.estado=estado;
        this.metodoPago=metodoPago;
        this.valorTotal=valorTotal;
    }
    //relaciones
    private Huesped huesped;
    private List<Habitacion> listreservaHabitaciones;
    private List<Servicio> listreservaServicios;


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public List<Habitacion> getListreservaHabitaciones() {
        return listreservaHabitaciones;
    }

    public void setListreservaHabitaciones(List<Habitacion> listreservaHabitaciones) {
        this.listreservaHabitaciones = listreservaHabitaciones;
    }

    public List<Servicio> getListreservaServicios() {
        return listreservaServicios;
    }

    public void setListreservaServicios(List<Servicio> listreservaServicios) {
        this.listreservaServicios = listreservaServicios;
    }


}
