import java.util.ArrayList;

/**
 * Representa una fruta.
 */
public class Fruit {
    /**
     * Representa el nombre de la fruta.
     */
    public String name;

    /**
     * Representa el peso promedio de la fruta.
     */
    private float averageWeight;

    /**
     * Representa una lista de colores que la fruta puede adoptar.
     */
    public ArrayList<String> colors;

    /**
     * Representa el precio de la fruta.
     */
    public double price;

    /**
     * Crea una instancia de la clase Fruit, dados unos valores iniciales.
     * @param name Representa el nombre de la fruta.
     * @param averageWeight Representa el peso promedio de la fruta.
     * @param colors Representa una lista de colores que la fruta puede adoptar.
     * @param price Representa el precio de la fruta.
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors,double price){
        this.name=name;
        this.averageWeight=averageWeight;
        this.colors=colors;
        this.price=price;
    }

    /**
     * Añade un nuevo color a la lista de colores de la fruta.
     * @param name Nuevo color a añadir
     */
    public void setColor(String name){
        this.colors.add(name);
    }

    /**
     * Retorna la lista de colores que la fruta puede adoptar.
     * @return Lista de colores.
     */
    public ArrayList<String> getColors(){
        return this.colors;
    }
}
