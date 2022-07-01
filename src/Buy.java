import java.util.Date;

/**
 * Representa la compra de una fruta, realizada por una persona.
 */
public class Buy {
    /**
     * Representa la persona que realiza la compra.
     */
    public Person person;

    /**
     * Representa la fruta comprada.
     */
    public Fruit fruit;

    /**
     * Representa el codigo de la compra.
     */
    private int buyCode;

    /**
     * Representa la fecha de la compra.
     */
    protected Date buyDate;

    /**
     * Crea una instancia de la clase Buy dados unos valores iniciales.
     * @param person Representa la persona que realiza la compra.
     * @param fruit Representa la fruta comprada.
     * @param buyCode Representa el codigo de la compra.
     * @param buyDate Representa la fecha de la compra.
     */
    public Buy(Person person,Fruit fruit,int buyCode,Date buyDate){
        this.person=person;
        this.fruit=fruit;
        this.buyCode=buyCode;
        this.buyDate=buyDate;
    }

    /**
     * Realiza una compra dado un almacén del cual extraer la fruta a vender y además
     * resta el precio de la fruta a la cuenta bancaria de la persona.
     * @param store Almacen del cual vender la fruta.
     */
    protected void Purchase(Store store){
        store.removeFruit(fruit);
        person.getBankAccount().subtractBalance(fruit.price);
    }

    /**
     * Modifica la fecha de compra.
     * @param date La que será la nueva fecha de compra.
     */
    private void changeDate(Date date){
        this.buyDate=date;
    }


}
