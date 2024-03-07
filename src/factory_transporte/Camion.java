package factory_transporte;

/**
 * Clase que representa un camión como tipo de transporte para enviar un paquete.
 */
public abstract class Camion implements Transporte {
    
    @Override
    public float costeTotal(Integer cp) {
        // Lógica para calcular el costo total para enviar un paquete por camión
        // Aquí podrías implementar una lógica más compleja basada en el código postal
        return 10.0f; // Ejemplo de costo fijo
    }

    @Override
    public int tipoEmbalaje(float x, float y, float z, float peso) {
        // Lógica para determinar el tipo de embalaje para un paquete enviado por camión
        if (x * y * z < 1000 && peso < 20) {
            return 1; // Envoltorio cartón
        } else {
            return 0; // Palet
        }
    }
}
