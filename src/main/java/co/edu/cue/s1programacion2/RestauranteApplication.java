package co.edu.cue.s1programacion2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class RestauranteApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RestauranteApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre:");
        String cedula = JOptionPane.showInputDialog("Por favor ingrese su cédula:");

        JOptionPane.showMessageDialog(null, "¡Bienvenido " + nombre + "!");

        int codMenuPpal = 0;
        int codmenuTipico = 0;
        int codmenuCarta = 0;
        int codmenuInternacional = 0;
        int platosTipicos = 0;
        int platosCarta = 0;
        int platosInternacionales = 0;

        List<String> recibo = new ArrayList<>();
        double totalPagar = 0;

        do {
            String menu = "¿Qué desea ordenar?\n\n";
            menu += "1. Plato típico\n";
            menu += "2. Plato a la carta\n";
            menu += "3. Plato internacional\n";
            menu += "4. Salir \n\n";
            menu += "Por favor seleccione una opción\n";

            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (codMenuPpal) {
                case 1:
                    String menuTipico = "Menú Platos Típicos\n";
                    menuTipico += "1. Bandeja Paisa, Precio $18.000\n";
                    menuTipico += "2. Sanchocho de Gallina, Precio $13.000\n";
                    menuTipico += "3. Consomé, Precio $11.000";
                    codmenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));
                    switch (codmenuTipico) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "En breve te llevaremos tu platillo. ¡Buen provecho!");
                            recibo.add("Bandeja Paisa: $18.000");
                            totalPagar += 18000;
                            platosTipicos++;
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "En breve te llevaremos tu platillo. ¡Buen provecho!");
                            recibo.add("Sanchocho de Gallina: $13.000");
                            totalPagar += 13000;
                            platosTipicos++;
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "En breve te llevaremos tu platillo. ¡Buen provecho!");
                            recibo.add("Consomé: $11.000");
                            totalPagar += 11000;
                            platosTipicos++;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Por favor ingresa una opción válida", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                    break;
                case 2:
                    String menuCarta = "Menú Platos a la Carta\n";
                    menuCarta += "1. Spaguetis a la boloñesa, Precio $25.000\n";
                    menuCarta += "2. Churrasco con ensalada, Precio $45.000\n";
                    menuCarta += "3. Lomo de cerdo asado, arroz y ensalada, Precio $30.000";
                    codmenuCarta = Integer.parseInt(JOptionPane.showInputDialog(menuCarta));
                    switch (codmenuCarta) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "En breve te llevaremos tu platillo. ¡Buen provecho!");
                            recibo.add("Spaguetis a la boloñesa: $25.000");
                            totalPagar += 25000;
                            platosCarta++;
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "En breve te llevaremos tu platillo. ¡Buen provecho!");
                            recibo.add("Churrasco con ensalada: $45.000");
                            totalPagar += 45000;
                            platosCarta++;
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "En breve te llevaremos tu platillo. ¡Buen provecho!");
                            recibo.add("Lomo de cerdo asado, arroz y ensalada: $30.000");
                            totalPagar += 30000;
                            platosCarta++;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Por favor ingresa una opción válida", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                    break;
                case 3:
                    String menuInternacional = "Platos Internacionales\n";
                    menuInternacional += "1. Sushi (Japón), Precio $53.000\n";
                    menuInternacional += "2. Paella (España), Precio $60.000\n";
                    menuInternacional += "3. Tacos (México), Precio $30.000";
                    codmenuInternacional = Integer.parseInt(JOptionPane.showInputDialog(menuInternacional));
                    switch (codmenuInternacional) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "En breve te llevaremos tu platillo. ¡Buen provecho!");
                            recibo.add("Sushi (Japón): $53.000");
                            totalPagar += 53000;
                            platosInternacionales++;
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "En breve te llevaremos tu platillo. ¡Buen provecho!");
                            recibo.add("Paella (España): $60.000");
                            totalPagar += 60000;
                            platosInternacionales++;
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "En breve te llevaremos tu platillo. ¡Buen provecho!");
                            recibo.add("Tacos (México): $30.000");
                            totalPagar += 30000;
                            platosInternacionales++;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Por favor ingresa una opción válida", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios, ¡Vuelva pronto!");

                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea un recibo?", "Recibo", JOptionPane.YES_NO_OPTION);
                    if (respuesta == JOptionPane.YES_OPTION) {
                        StringBuilder reciboMensaje = new StringBuilder("Recibo de Compra:\n\n");
                        for (String item : recibo) {
                            reciboMensaje.append(item).append("\n");
                        }
                        reciboMensaje.append("\nTotal a pagar: $").append(totalPagar);
                        JOptionPane.showMessageDialog(null, reciboMensaje.toString());
                    }

                    JOptionPane.showMessageDialog(null, "Total de platos procesados:\n" +
                            "Platos Típicos: " + platosTipicos + "\n" +
                            "Platos a la Carta: " + platosCarta + "\n" +
                            "Platos Internacionales: " + platosInternacionales);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Por favor ingrese una opción válida", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuPpal != 4);
    }
}





