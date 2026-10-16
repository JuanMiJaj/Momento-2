
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double iva = 0.19;
        double descuento = 0.10;
        double camisaBasica = 20000;
        double camisaMedio = 60000;
        double camisaPremium = 99000;
        boolean indicador = true;
        double valorTotal = 0;
        double valorDescuento;
        double valorFinal; 

                System.out.println("Bienvenido al catalogo de prendas!");

        while (indicador == true ) {
            System.out.println("1. Ingresar producto \n 2. finalizar compra");
            String seleccionador = leer.nextLine();

            if (seleccionador.equals("1")) {
                System.out.println("Seleccione un producto \n 1. Camisa Basica (20.000) \n 2. Camisa Medio (60.000) \n 3. Camisa Premium (99.000)");
                String seleccionadorDos = leer.nextLine();

                if (seleccionadorDos.equals("1")) {
                    valorTotal += camisaBasica;
                } else if (seleccionadorDos.equals("2")) {
                    valorTotal += camisaMedio;
                } else if (seleccionadorDos.equals("3")) {
                    valorTotal += camisaPremium;
                } else {
                    System.out.println("No se ingreso un valor correcto");
                }
            } else if (seleccionador.equals("2")) {
                indicador = false;
            } else {
                System.out.println("No se ingreso un valor corrrecto");
            }
        } if (valorTotal > 100000) {
            valorDescuento = valorTotal - (valorTotal * descuento);
            valorFinal = valorDescuento + (valorDescuento * iva);
        } else {
            valorFinal = valorTotal + (valorTotal * iva);
        } System.out.println(valorFinal);
    }
}



