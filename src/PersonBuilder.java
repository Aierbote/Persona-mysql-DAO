/**
 * @author Alberto Cangialosi
 *
 * Per costruiere un'instanza di Persona con il Design Pattern **Builder**
 * <br>
 * SOURCE:
 * <a href="https://italiancoders.it/builder-pattern-un-ottima-alternativa-al-costruttore/">...</a>
 */
public class PersonBuilder {
  protected  Integer ID;
  protected  String nome;
  protected  String cognome;
  protected  Integer età;
  protected  String email;
  protected  String num_telefono;

//  protected PersonBuilder(Integer ID) {
//    this.ID = ID;
//  }

//  ""Setters""

  public PersonBuilder newBuilder(Integer ID) {
//    return new PersonBuilder(ID);
    this.ID = ID;
    return this;
  }

  public PersonBuilder name(String nome) {
    this.nome = nome;
    return this;
  }

  public PersonBuilder surname (String cognome) {
    this.cognome = cognome;
    return this;
  }

  public PersonBuilder age (Integer età) {
    this.età = età;
    return this;
  }

  public  Person build() {
    if (email.isEmpty()) {
      throw new IllegalArgumentException("Email field is required, please fill in, thank you.");
    }
    if (num_telefono.length() < 11 ) {
      // TODO: 27/10/23 : devo validare il numero di telefono se inizia per +39 seguito dai 10 digits successivi (length of 13) oppure con i soli 10 digits, ERGO modificare il campo nel DB

      throw new IllegalArgumentException("Phone Number not full, please double check to put the correct number of digits");
    }

    return new Person(
        ID,
        nome,
        cognome,
        età,
        email,
        num_telefono
    );
  }


  public PersonBuilder email (String email) {
    this.email = email;
    return this;
  }

  public PersonBuilder phoneNumber (String num_telefono) {
    this.num_telefono = num_telefono;
    return this;
  }




  // TEST

  /*
   * NOTE: per usare qyesto DEBUG ci si deve assicurare di aver tutti statici per essere referiti da un punto di vista statico
   * @param args
   */
//  public static void main(String[] args) {
//    PersonBuilder persBuilder = PersonBuilder
//        .newBuilder(1)
//        .name("Nano")
//        .surname("Gigante")
//        .age(130)
//        .email("tall.dwarf@gmail.com")
//        .phoneNumber("+0923551108");
//
//    Person persConBuilder = personBuilder.build();
//
//    System.out.println("built persConBuilder:\n\t" + persConBuilder);
//  }


}
