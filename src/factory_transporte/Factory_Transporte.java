/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory_transporte;

/**
 *
 * @author Usuario
 */
public class Factory_Transporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Transporte camion = new Camion() {};
        float costoCamion = camion.costeTotal(28001);
        int tipoEmbalajeCamion = camion.tipoEmbalaje(20, 30, 40, 15);
        
        System.out.println("Costo total por camión: " + costoCamion);
        System.out.println("Tipo de embalaje por camión: " + tipoEmbalajeCamion);
        
        Transporte bicicleta = new Bicicleta() {};
        float costoBicicleta = bicicleta.costeTotal(28001);
        int tipoEmbalajeBicicleta = bicicleta.tipoEmbalaje(15, 25, 35, 8);
        
        System.out.println("Costo total por bicicleta: " + costoBicicleta);
        System.out.println("Tipo de embalaje por bicicleta: " + tipoEmbalajeBicicleta);
    }
}