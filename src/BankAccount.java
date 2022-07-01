/**
 * Representa una cuenta bancaria.
 */
public class BankAccount {
    /**
     * Representa el numero de cuenta.
     */
    private int accountNumber;
    /**
     * Representa si la cuenta está en estado activa o no
     */
    protected boolean activated;
    /**
     * Representa el saldo de la cuenta
     */
    public double balance;

    /**
     * Crea una instancia de la clase BankAccount dados unos valores iniciales.
     * @param accountNumber Representa el numero de cuenta.
     * @param activated Representa el estado de la cuenta.
     * @param balance Representa el saldo de la cuenta.
     */
    public BankAccount(int accountNumber,boolean activated,double balance){
        this.accountNumber=accountNumber;
        this.activated=activated;
        this.balance=balance;
    }

    /**
     * Modifica el estado de la cuenta.
     * @param activated El que será el nuevo estado de la cuenta.
     */
    public void setActivated(boolean activated){
        this.activated=activated;
    }


    /**
     * Retorna el estado de la cuenta.
     * @return Estado de la cuenta actual.
     */
    public boolean getActivated(){
        return this.activated;
    }

    /**
     * Retorna el saldo de la cuenta.
     * @return Saldo de la cuenta actual.
     */
    public double getBalance(){
        return this.balance;
    }

    /**
     * Modifica el saldo de la cuenta.
     * @param balance El que será el nuevo saldo de la cuenta.
     */
    public void setBalance(double balance){
        this.balance=balance;
    }

    /**
     * Resta una cantidad al saldo de la cuenta.
     * @param subtract Cantidad a restarle al saldo de la cuenta.
     */
    protected void subtractBalance(double subtract){
        this.balance=this.balance-subtract;
    }

    /**
     * Añade una cantidad al saldo de la cuenta.
     * @param add Cantidad a añadir al saldo de la cuenta.
     */
    protected void addBalance(double add){
        this.balance=this.balance+add;
    }
}
