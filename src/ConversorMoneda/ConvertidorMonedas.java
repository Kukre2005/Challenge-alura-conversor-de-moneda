package ConversorMoneda;

import javax.swing.JOptionPane;


public class ConvertidorMonedas {
    
    public static void main(String[] args) {
       

        String[] menu =  {
            "Seleccione...",
            "Conversor de Moneda"
        };
        
        String[] tipoMoneda = {
            "De Pesos Argentinos a Dolar Blue",
            "De Pesos Argentinos a Euro",
            "De Pesos Argentinos a Libras",
            "De Pesos Argentinos a Yen",
            "De Pesos Argentinos a Won",
            
            "De Dolar Blue a Pesos Argentinos",
            "De Euro a Pesos Argentinos",
            "De Libras a Pesos Argentinos",
            "De yen a Pesos Argentinos",
            "De Won a Pesos Argentinos"
        };
        
        
        String opcionElejida,
                dineroIngresado,
                monedaAConvertir;
        double dineroConvertido = 0;
        int inicio = 0; 
        
        
        Monedas moneda = new Monedas();
        
 
        while (inicio != 1) {
            opcionElejida = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", 
                    JOptionPane.DEFAULT_OPTION, null, menu, menu[0]);
            
            try {
                switch (opcionElejida) {
                    case "Conversor de Moneda":
                        dineroIngresado = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir", 
                                "Input", JOptionPane.QUESTION_MESSAGE);
                        
               
                        if (!dineroIngresado.isEmpty()) {
                            dineroConvertido = Double.parseDouble(dineroIngresado);

                            monedaAConvertir = (String) JOptionPane.showInputDialog(null,
                                "Elija la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.DEFAULT_OPTION, null, 
                                tipoMoneda, tipoMoneda[0]
                            );

                            if (monedaAConvertir.equalsIgnoreCase("De Pesos Argentinos a Dolar Blue")) {
                                moneda.PesosArg_DolarBlue(dineroConvertido);
                            }

                            if (monedaAConvertir.equalsIgnoreCase("De Dolar Blue a Pesos Argentinos")) {
                                moneda.DolarBlue_PesosArg(dineroConvertido);
                            }
                            
                            if (monedaAConvertir.equalsIgnoreCase("De Pesos Argentinos a Euro")) {
                                moneda.PesosArg_Euro(dineroConvertido);
                            }
                            
                            if (monedaAConvertir.equalsIgnoreCase("De Euro a Pesos Argentinos")) {
                                moneda.Euro_PesosArg(dineroConvertido);
                            }
                            
                            if (monedaAConvertir.equalsIgnoreCase("De Pesos Argentinos a Libras")) {
                                moneda.PesosArg_LibrasEsterlinas(dineroConvertido);
                            }
                            
                            if (monedaAConvertir.equalsIgnoreCase("De Libras a Pesos Argentinos")) {
                                moneda.LibrasEsterlinas_PesosArg(dineroConvertido);
                            }
                            
                            if (monedaAConvertir.equalsIgnoreCase("De Pesos Argentinos a Yen")) {
                                moneda.PesosArg_YenJapones(dineroConvertido);
                            }
                            
                            if (monedaAConvertir.equalsIgnoreCase("De Yen a Pesos Argentinos")) {
                                moneda.YenJapones_PesosArg(dineroConvertido);
                            }
                            
                            if (monedaAConvertir.equalsIgnoreCase("De Pesos Argentinos a Won")) {
                                moneda.PesosArg_WonSurCoreano(dineroConvertido);
                            }
                            
                            if (monedaAConvertir.equalsIgnoreCase("De Won a Pesos Argentinos")) {
                                moneda.WonSurCoreano_PesosArg(dineroConvertido);
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Debes ingresar un valor, para continuar", 
                                    "Aviso", JOptionPane.WARNING_MESSAGE);
                        }
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Ups la opción no es valida, intenta nuevamente", 
                                "Message", JOptionPane.WARNING_MESSAGE);
                }
               

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, comuniquese con su administrador", 
                        "Message", JOptionPane.ERROR_MESSAGE);
                System.err.println(e.getMessage());
                break;
            }
            
            
            inicio = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", "Conversor de Moneda",
                    JOptionPane.YES_NO_OPTION);
            if (inicio == 1) {
                JOptionPane.showMessageDialog(null, "Programa Finalizado", "Challenge Alura", 
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

}
