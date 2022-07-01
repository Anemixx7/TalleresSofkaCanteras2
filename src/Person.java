import java.util.Date;

/**
 * Representa a una persona.
 */
public class Person {
    /**
     * Representa el nombre de la persona.
     */
    public String name;

    /**
     * Representa el primer apellido de la persona.
     */
    public String lastName1;

    /**
     * Representa el segundo apellido de la persona.
     */
    public String lastName2;

    /**
     * Representa la fecha de nacimiento de la persona.
     */
    public Date dateBirth;

    /**
     * Representa la altura de la persona.
     */
    public float height;

    /**
     * Representa la cuenta bancaria de la persona
     */
    private BankAccount bankAccount;
    

    /**
     * Crea una instancia de la clase Person dados unos valores iniciales.
     * @param name Representa el nombre de la persona.
     * @param lastName1 Representa el primer apellido de la persona.
     * @param lastName2 Representa el segundo apellido de la persona.
     * @param dateBirth Representa la fecha de nacimiento de la persona.
     * @param height Representa la altura de la persona
     * @param bankAccount Representa la cuenta bancaria de la persona.
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height, BankAccount bankAccount){
        this.name=name;
        this.lastName1=lastName1;
        this.lastName2=lastName2;
        this.dateBirth=dateBirth;
        this.height=height;
        this.bankAccount=bankAccount;
    }

    /**
     * Modifica el nombre de la persona.
     * @param name El que será el nuevo nombre de la persona.
     */
    public void setName(String name){
        this.name=name;
    }

    /**
     * Retorna el nombre de la persona.
     * @return Nombre de la persona actual.
     */
    public String getName(){
        return this.name;
    }

    /**
     * Retorna la cuenta bancaria de la persona.
     * @return Cuenta bancaria de la persona.
     */
    public BankAccount getBankAccount(){
        return this.bankAccount;
    }

    /**
     * Reemplaza la cuenta bancaria de la persona por otra.
     * @param cuentaBancaria La que será la nueva cuenta bancaria de la persona.
     */
    public void setBankAccount(BankAccount cuentaBancaria){
        this.bankAccount=cuentaBancaria;
    }
}