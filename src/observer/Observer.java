package observer;

public interface Observer {
  public void update(); // usato da Subject per aggiornare l'Observer

  public void setSubject(Subject sub); // per impostare il Subject da osservare
}
