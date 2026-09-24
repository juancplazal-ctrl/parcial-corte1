package uniquindio.edu.co;

import java.util.List;

public class Huesped {
    private String nombreCompleto, telefono, correoElectronico, paisProcedencia;
    private int documentoIdentidad;
    /**
     * Metodo constructor de la clase Huesped
     * @param nombreCompleto nombre completo del huesped
     * @param documentoIdentidad documento de identidad del huesped
     * @param telefono telefono del huesped
     * @param correoElectronico correo electronico del huesped
     * @param paisprocedencia pais de procedencia del huesped
     */
    public Huesped (String nombreCompleto,String telefono, String correoElectronico,String paisprocedencia, int documentoIdentidad ){
        this.nombreCompleto=nombreCompleto;
        this.telefono=telefono;
        this.correoElectronico=correoElectronico;
        this.paisProcedencia=paisprocedencia;
        this.documentoIdentidad=documentoIdentidad;
    }
    //relaciones
    private List<Reserva> listhuespedReservas;


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public int getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(int documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public List<Reserva> getListhuespedReservas() {
        return listhuespedReservas;
    }

    public void setListhuespedReservas(List<Reserva> listhuespedReservas) {
        this.listhuespedReservas = listhuespedReservas;
    }


}
