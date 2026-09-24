package uniquindio.edu.co;

public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel(
                "Hotel StayPlus",
                "9001456",
                "Armenia",
                "3001234777",
                "stayplus.com"
        );

        boolean registrado = hotel.registrarHuesped(
                "Juan lopez",
                123456789,
                "3001234567",
                "juan@gmail.com",
                "Colombia"
        );

        System.out.println("Huesped registrado: " + registrado);

        Huesped huesped = hotel.buscarHuesped(123456789);

        System.out.println("Huesped encontrado: " + huesped);
    }
}
