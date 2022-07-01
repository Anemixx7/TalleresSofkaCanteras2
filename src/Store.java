import java.util.ArrayList;

/**
 * Representa un almacén de frutas.
 */
public class Store {
    /**
     * Representa una lista de frutas contenidas en el almacén.
     */
    protected ArrayList<Fruit> inventory;

    /**
     * Representa la ubicación del almacén.
     */
    public String location;

    /**
     * Representa el código del almacén
     */
    private int storeCode;

    /**
     * Crear una instancia de la clase Store dados unos valores iniciales.
     * @param inventory Representa una lista de frutas contenidas en el almacén.
     * @param location Representa la ubicación del almacén.
     * @param storeCode Representa el código del almacén.
     */
    public Store(ArrayList<Fruit> inventory,String location,int storeCode){
        this.inventory=inventory;
        this.location=location;
        this.storeCode=storeCode;
    }

    /**
     * Añade una fruta a la lista de frutas contenidas en el almacén.
     * @param fruit La fruta a añadir.
     */
    protected void addFruit(Fruit fruit){
        this.inventory.add(fruit);
    }

    /**
     * Remueve una fruta de la lista de frutas contenidas en el almacén.
     * @param fruit Fruta a remover.
     */
    protected void removeFruit(Fruit fruit){
        this.inventory.remove(fruit);
    }

    /**
     * Retorna la lista de frutas contenidas en el almacén.
     * @return Lista de frutas.
     */
    public ArrayList<Fruit> getInventory(){
        return this.inventory;
    }

    /**
     * Retorna la ubicación del almacén.
     * @return Ubicación del almacén.
     */
    protected String getLocation(){
        return this.location;
    }
}
