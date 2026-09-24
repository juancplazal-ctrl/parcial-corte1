package uniquindio.edu.co;

public class Huesped {
    private String nombreCompleto, telefono, correoElectronico, paisProcedencia;
    private int documentoIdentidad;

    public Huesped (String nombreCompleto,String telefono, String correoElectronico,String paisprocedencia, int documentoIdentidad ){
        this.nombreCompleto=nombreCompleto;
        this.telefono=telefono;
        this.correoElectronico=correoElectronico;
        this.paisProcedencia=paisprocedencia;
        this.documentoIdentidad=documentoIdentidad;
    }
}
