package uniquindio.edu.co.model;

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

    public boolean registrarHuesped(String nombreCompleto, String documentoIdentidad, String telefono, String correoElectronico, String paisProcedencia) {
        boolean existe = false;
        Huesped huesped = buscarHuesped(Integer.parseInt(documentoIdentidad));
        if (huesped == null) {
            Huesped huespedNuevo = new
                    Huesped(nombreCompleto, documentoIdentidad, telefono, correoElectronico, paisProcedencia);
            listhotelHuesped.add(huespedNuevo);
            existe = true;

        }
        return existe;
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

            if (huesped.getDocumentoIdentidad().equals(documentoIdentidad)) {
                encontrado = huesped;
                break;
            }
        }

        return encontrado;
    }

    public boolean registrarHabitacion(String numeroHabitacion, String tipo, int capacidadMaxima,
                                       double precioNoche) {
        boolean existe = false;
        Habitacion habitacion = buscarHabitacion(numeroHabitacion);
        if (habitacion == null) {
            Habitacion nuevaHabitacion = new
                    Habitacion(numeroHabitacion, tipo, capacidadMaxima, precioNoche);
            listhotelHabitaciones.add(nuevaHabitacion);
            existe = true;

        }
        return existe;
    }

    public Reserva buscarReserva(String codigo) {
        Reserva encontrada = null;
        for (int i = 0; i < listhotelReservas.size(); i++) {
            Reserva reserva = listhotelReservas.get(i);
            if (reserva.getCodigo().equals(codigo)) {
                encontrada = reserva;
                break;
            }
        }
        return encontrada;
    }

    public Habitacion buscarHabitacion(String numeroHabitacion) {
        Habitacion encontrado = null;
        for (int i = 0; i < listhotelHabitaciones.size(); i++) {
            Habitacion habitacion = listhotelHabitaciones.get(i);

            if (habitacion.getNumeroHabitacion().equals(numeroHabitacion)) {
                encontrado = habitacion;
                break;
            }
        }

        return encontrado;
    }

    public double calcularIngresosPorFecha(String fecha) {
        double total = 0;
        for (int i = 0; i < listhotelReservas.size(); i++) {
            Reserva reserva = listhotelReservas.get(i);
            if (reserva.getFechaRealizacion().equals(fecha)) {
                total += reserva.getValorTotal();
            }
        }
        return total;
    }

    public boolean actualizarEstadoHabitacion(String numeroHabitacion, String estado){
        return false;
    }
    public List<Servicio> getListhotelservicios() {
        return listhotelservicios;
    }

    public void setListhotelservicios(List<Servicio> listhotelservicios) {
        this.listhotelservicios = listhotelservicios;
    }

    public boolean registrarReserva(String codigoReserva, String fechaRealizacion,
                                    String fechaEntrada, String fechaSalida,
                                    String estado, String metodoPago,
                                    double valorTotal){
        return false;
    }

    public void agregarHabitacionReserva(String codigoReserva, String numeroHabitacion){
    }

    public void agregarServicioReserva(String codigoReserva, String codigoServicio){
    }

    public boolean registrarServicio(String codigo, String nombre,
                                     String descripcion, String precio,
                                     String disponibilidad){
        return false;
    }

    public double aplicarDescuentoHuespedFrecuente(int documentoIdentidad) {
        return 0;
    }

    public Huesped buscarHuesped(String documentoIdentidad) {
        Huesped encontrado = null;
        for (int i = 0; i < listhotelHuesped.size(); i++) {
            Huesped huesped = listhotelHuesped.get(i);

            if (huesped.getDocumentoIdentidad().equals(documentoIdentidad)) {
                encontrado = huesped;
                break;
            }
        }

        return encontrado;
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

    public void registrarHabitacion(Habitacion nuevaHabitacion) {
        listhotelHabitaciones.add(nuevaHabitacion);
    }
}

