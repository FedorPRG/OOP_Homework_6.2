import java.util.ArrayList;

public class Print {
  public void PrintListTask(ArrayList<Phonebook> ListTask) {
    System.out.println("id Фамилия     Телефон");
    for (Phonebook task : ListTask) {
      System.out.println(task.getFullName());
    }
  }
}
