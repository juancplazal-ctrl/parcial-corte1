package uniquindio.edu.co;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombreComercial, nit, direccion, telefono, paginaWeb;

    /**
     * Metodo constructor de la clase Hotel
     *
     * @param nombreComercial nombre comercial del hotel
     * @param nit             NIT del hotel
     * @param direccion       direccion del hotel
     * @param telefono        telefono del hotel
     * @param paginaWeb       pagina web del hotel
     */

    public Hotel(String nombreComercial, String nit, String direccion, String telefono, String paginaWeb) {
        this.nombreComercial = nombreComercial;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;
        this.listhotelHuesped = new ArrayList<>();
        this.listhotelHabitaciones = new ArrayList<>();
        this.listhotelReservas = new ArrayList<>();
        this.listhotelservicios = new ArrayList<>();
    }


    //relaciones
    private List<Huesped> listhotelHuesped;
    private List<Habitacion> listhotelHabitaciones;
    private List<Reserva> listhotelReservas;
    private List<Servicio> listhotelservicios;

    /**
     * Metodo que permite registrar un huesped en el hotel
     *
     * @param nombreCompleto     nombre completo del huesped
     * @param documentoIdentidad documento de identidad del huesped
     * @param telefono           telefono del huesped
     * @param correoElectronico  correo electronico del huesped
     * @param paisProcedencia    pais de procedencia del huesped
     * @return
     */

    public boolean registrarHuesped(String nombreCompleto, int documentoIdentidad, String telefono, String correoElectronico, String paisProcedencia) {
        boolean existe = false;
        Huesped huesped = buscarHuesped(documentoIdentidad);
        if (huesped == null) {
            Huesped huespedNuevo = new
                    Huesped(nombreCompleto, documentoIdentidad, telefono, correoElectronico, paisProcedencia);
            listhotelHuesped.add(huespedNuevo);
            existe = true;

        }
        return existe;
    }
    /**
     * Metodo que permite actualizar el estado de una habitacion.
     */
    public boolean actualizarEstadoHabitacion(String numeroHabitacion, String estado){
        return false;
    }
    /**
    *metodo que permite registrar una reserva
    */
    public boolean registrarReserva(String codigoReserva, String fechaRealizacion,
                                    String fechaEntrada, String fechaSalida,
                                    String estado, String metodoPago,
                                    double valorTotal){
        return false;}
        /**
         * Metodo que permite agregar una habitacion a una reserva.
         */
        public void agregarHabitacionReserva(String codigoReserva, String numeroHabitacion){

        }

        /**
         * Metodo que permite agregar un servicio a una reserva.
         */
        public void agregarServicioReserva(String codigoReserva, String codigoServicio){

        }

    /**
     * Metodo que permite registrar un servicio adicional.
     */
    public boolean registrarServicio(String codigo, String nombre,
                                     String descripcion, double precio,
                                     boolean disponibilidad){
        return false;
    }
    /**
     * Metodo que permite aplicar un descuento a un huesped frecuente.
     */
    public double aplicarDescuentoHuespedFrecuente(int documentoIdentidad) {
        return 0;
    }

     /**
     * Metodo que permite buscar un huesped
     *
     * @param documentoIdentidad documento del huesped a buscar
     * @return
     */

    public Huesped buscarHuesped(int documentoIdentidad) {
        Huesped encontrado = null;
        for (int i = 0; i < listhotelHuesped.size(); i++) {
            Huesped huesped = listhotelHuesped.get(i);

            if (huesped.getDocumentoIdentidad() == documentoIdentidad) {
                encontrado = huesped;
                break;
            }
        }

        return encontrado;
    }


    public List<Servicio> getListhotelservicios() {
        return listhotelservicios;
    }

    public void setListhotelservicios(List<Servicio> listhotelservicios) {
        this.listhotelservicios = listhotelservicios;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Huesped> getListhotelHuesped() {
        return listhotelHuesped;
    }

    public void setListhotelHuesped(List<Huesped> listhotelHuesped) {
        this.listhotelHuesped = listhotelHuesped;
    }

    public List<Habitacion> getListhotelHabitaciones() {
        return listhotelHabitaciones;
    }

    public void setListhotelHabitaciones(List<Habitacion> listhotelHabitaciones) {
        this.listhotelHabitaciones = listhotelHabitaciones;
    }

    public List<Reserva> getListhotelReservas() {
        return listhotelReservas;
    }

    public void setListhotelReservas(List<Reserva> listhotelReservas) {
        this.listhotelReservas = listhotelReservas;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }
}

