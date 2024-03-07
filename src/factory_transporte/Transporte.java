package factory_transporte;

/**
 * Interfaz que define los métodos comunes para diferentes tipos de transporte.
 */
public interface Transporte {
    
    /**
     * Calcula el costo total para enviar un paquete en función del código postal.
     *
     * @param cp El código postal de destino del paquete.
     * @return El costo total para enviar el paquete.
     */
    float costeTotal(Integer cp);
    
    /**
     * Determina el tipo de embalaje para un paquete basado en sus dimensiones y peso.
     *
     * @param x     La dimensión x del paquete.
     * @param y     La dimensión y del paquete.
     * @param z     La dimensión z del paquete.
     * @param peso  El peso del paquete.
     * @return El tipo de embalaje para el paquete (0 para palet, 1 para envoltorio cartón, 2 para caja de madera).
     */
    int tipoEmbalaje(float x, float y, float z, float peso);
}
