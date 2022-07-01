
/**
 * Representa un ladrón.
 */
public class Thief {
    /**
     * Representa el nombre con el que se le conoce al ladrón.
     */
    public String alias;

    /**
     * Representa la cantidad de robos cometidos por el ladrón.
     */
    protected int robberiesCommitted;

    /**
     * Representa si el ladrón está armado
     */
    private boolean armed;

    /**
     * Crea una instancia de la clase Thief dados unos valores iniciales.
     * @param alias Representa el nombre con el que se le conoce al ladrón.
     * @param robberiesCommitted Representa la cantidad de robos cometidos por el ladrón.
     * @param armed Representa si el ladrón está armado.
     */
    public Thief(String alias,int robberiesCommitted,boolean armed){
        this.alias=alias;
        this.robberiesCommitted=robberiesCommitted;
        this.armed=armed;
    }

    /**
     * Ejecuta el robo de una cuenta bancaria dada una persona.
     * @param person Persona que sufre del robo.
     */
    protected void Robbery(Person person){
        person.getBankAccount().subtractBalance(10);
        robberiesCommitted++;
    }
}
