
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
        double valorDescuento = 0;
        double valorFinal;
        int contadorBasica = 0;
        int contadorMedio = 0;
        double contadorPremium = 0;
        double contadorTotal = 0;
        double porcentajePremium;

                System.out.println("Bienvenido al catalogo de prendas!");

        while (indicador == true ) {
            System.out.println("1. Ingresar producto \n 2. finalizar compra");
            String seleccionador = leer.nextLine();

            if (seleccionador.equals("1")) {
                System.out.println("Seleccione un producto \n 1. Camisa Basica (20.000) \n 2. Camisa Medio (60.000) \n 3. Camisa Premium (99.000)");
                String seleccionadorDos = leer.nextLine();

                if (seleccionadorDos.equals("1")) {
                    valorTotal += camisaBasica;
                    contadorBasica++;
                } else if (seleccionadorDos.equals("2")) {
                    valorTotal += camisaMedio;
                    contadorMedio++;
                } else if (seleccionadorDos.equals("3")) {
                    valorTotal += camisaPremium;
                    contadorPremium++;
                } else {
                    System.out.println("No se ingreso un valor incorrecto");
                }
            } else if (seleccionador.equals("2")) {
                indicador = false;
            } else {
                System.out.println("No se ingreso un valor incorrrecto");
            }
        } if (valorTotal > 100000) {
            valorDescuento = valorTotal - (valorTotal * descuento);
            valorFinal = valorDescuento + (valorDescuento * iva);
        } else {
            valorFinal = valorTotal + (valorTotal * iva);
        } contadorTotal = contadorBasica + contadorMedio + contadorPremium; 
        porcentajePremium = 100 * (contadorPremium / contadorTotal);

        System.out.println("=============== FACTURA ===============");
        System.out.println("Cantidad de camisas basicas: " + contadorBasica);
        System.out.println("Cantidad de camisas Medio: " + contadorMedio);
        System.out.println("Cantidad de camisas Premium: " + contadorPremium);
        System.out.println("Cantidad de prendas adquiridas: " + contadorTotal);
        System.out.println("Valor Bruto de las prendas: " + valorTotal );
        if (valorTotal > 100000) {
            System.out.println("Valor Con descuento: " + valorDescuento);
        } else{
        } System.out.println("Valor con IVA: " + valorFinal);
        System.out.println("El porcentaje de prendas Premium es de: " + porcentajePremium + "%");
        System.out.println("========== GRACIAS POR TU COMPRA ==========");
    leer.close();
    }
}



