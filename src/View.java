import java.util.Scanner;

/**
 * @author  Alberto Cangialosi
 *
 * class View
 * showMenu() - metodo per mostrare all'utente un menu di opzioni. All'utente
 * deve essere richiesto di inserire esattamente una delle opzioni elencate di
 * seguito, che viene restituita come stringa. La formulazione del menu è a
 * discrezione dell'utente. Il metodo deve restituire ciò che è stato immesso
 * dall'utente, senza alcun controllo di errore (che viene effettuato nel controllore)
 * "add student" - aggiunge uno studente
 * "add teacher" - aggiunge un insegnante
 * "list people" - elenca le persone
 * "exit" - esce dal programma
 *
 * addStudent() - metodo per aggiungere un nuovo studente al sistema. L'utente
 * deve inserire un elenco di parametri per ogni attributo, così come sono elencati
 * nel costruttore di Student, separati da spazi. La formulazione del prompt è a
 * discrezione dell'utente. Il metodo deve restituire ciò che è stato inserito
 * dall'utente, senza alcun controllo di errore (che viene fatto nel controllore).
 * Esempio: "Smith John 25 123456 13"
 * addTeacher() - un metodo per aggiungere un nuovo insegnante al sistema.
 * L'utente deve inserire un elenco di parametri per ogni attributo, così come sono
 * elencati nel costruttore di Teacher, separati da spazi. La formulazione della
 * richiesta è a discrezione dell'utente. Il metodo deve restituire ciò che è stato
 * inserito dall'utente, senza alcun controllo di errore (che viene fatto nel
 * controllore).
 *
 * listPeople() - metodo per elencare tutti gli oggetti Persona nell'array Persone
 * fornito come parametro. Ciascuna persona deve essere preceduta da un indice
 * che inizia con 0 e aumenta di uno per ogni persona presente nell'array. Ricordare
 * che gli slot inutilizzati dell'array conterranno il valore null, quindi occorre tenerne
 * conto nel codice.
 * Esempio: "0) Smith John: 25, classe = geologia, salario 1000".
 * showError() - metodo per visualizzare un errore all'utente. L'errore del
 * parametro deve essere stampato sullo schermo, preceduto da "Error": "
 */
public class View {
  public String showMenu() {
    System.out.println(
        "Please enter one of the following options:" + "\n" +
        " add student" + "\n" +
        " add teacher" + "\n" +
        " list people" + "\n" +
        " exit"
    );

    System.out.println("Choice:");
    Scanner scnr = new Scanner(System.in);

    return scnr.nextLine();
  }

  public String addStudent() {
    System.out.println(
        " EXAMPLE: **Smith John 25 123456 13**" + "\n" +
        " NOTE: 25 is age" + "\n" +
        " NOTE: 123456 is a studentID" + "\n" +
        " NOTE: 13 is a 13th grade" + "\n" +
        " \n" +
        " Give me your infos: "
    );
    Scanner scnr = new Scanner(System.in);

    return scnr.nextLine();
  }
  public String addTeacher() {
    System.out.println(
        " EXAMPLE: **Smith John 25 Maths 1_300**" + "\n" +
        " NOTE: 25 is age" + "\n" +
        " NOTE: Maths is classroom" + "\n" +
        " NOTE: 1_300 is salary in euros " + "\n" +
        " \n" +
        " Give me your infos: "
    );
    Scanner scnr = new Scanner(System.in);

    return scnr.nextLine();
  }

  public void listPeople(Person[] persons) {
    System.out.println("Listing all Persons");
    for (int i = 0; i < persons.length; i++) {
      if (persons[i] != null) {
        System.out.println(i + ") " + persons[i].toString());
      }
      else {
        System.out.println(i +") Empty Slot");
      }
    }
  }

  public void showError(String error) {
    System.out.println("Error: " + error);
  }
}
