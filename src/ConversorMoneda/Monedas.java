package ConversorMoneda;

import javax.swing.JOptionPane;


public class Monedas {
    
    private double resultado = 0;
    
    public void PesosArg_DolarBlue(double pesosArg) {
        resultado = pesosArg / 292;
        JOptionPane.showMessageDialog(null, "Tienes U$S" + String.format("%.2f", resultado) + " Dolar Blue", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void DolarBlue_PesosArg(double dolarBlue) {
        resultado = dolarBlue *  288;
        JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Pesos Argentinos", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public void PesosArg_Euro(double pesosArg) {
        resultado = pesosArg / 298;
        JOptionPane.showMessageDialog(null, "Tienes €" + String.format("%.2f", resultado) + " Euros", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void Euro_PesosArg(double euro) {
        resultado = euro *  294;
        JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Pesos Argentinos", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public void PesosArg_LibrasEsterlinas(double pesosArg) {
        resultado = pesosArg / 275.30;
        JOptionPane.showMessageDialog(null, "Tienes £" + String.format("%.2f", resultado) + " Libras Esterlinas", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void LibrasEsterlinas_PesosArg(double libras_esterlinas) {
        resultado = libras_esterlinas * 269.70;
        JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Pesos Argentinos", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public void PesosArg_YenJapones(double pesosArg) {
        resultado = pesosArg / 1.01;
        JOptionPane.showMessageDialog(null, "Tienes ¥" + String.format("%.2f", resultado) + " Yen Japónes", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void YenJapones_PesosArg(double yen_japones) {
        resultado = yen_japones * 1.01;
        JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Pesos Argentinos", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public void PesosArg_WonSurCoreano(double pesosArg) {
        resultado = pesosArg / 0.70;
        JOptionPane.showMessageDialog(null, "Tienes ￦" + String.format("%.2f", resultado) + " Won SurCoreano", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void WonSurCoreano_PesosArg(double won) {
        resultado = won *  0.70;
        JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " Pesos Argentinos", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
}