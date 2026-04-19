package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.VentanaPrincipalView;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        VentanaPrincipalView menu = new VentanaPrincipalView();
        menu.setVisible(true);
        Persistencia.inicializar();
      
    }
}
