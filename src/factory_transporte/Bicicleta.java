package factory_transporte;

/**
 * Clase que representa una bicicleta como tipo de transporte para enviar un paquete.
 */
public abstract class Bicicleta implements Transporte {
    
    @Override
    public float costeTotal(Integer cp) {
        // Lógica para calcular el costo total para enviar un paquete en bicicleta
        // Aquí podrías implementar una lógica más compleja basada en el código postal
        return 5.0f; // Ejemplo de costo fijo
    }

    @Override
    public int tipoEmbalaje(float x, float y, float z, float peso) {
        // Lógica para determinar el tipo de embalaje para un paquete enviado en bicicleta
        if (x * y * z < 500 && peso < 10) {
            return 2; // Caja de madera
        } else {
            return 1; // Envoltorio cartón
        }
    }
}
