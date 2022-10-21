import java.util.ArrayList;
import java.util.Scanner;

public class Input {
  static Scanner input = new Scanner(System.in);

  public void InputTask(ArrayList<Phonebook> ListTask) {
    System.out.printf("Введите количество дополнительныйх записей (можно 0):");
    int amount = input.nextInt();
    for (int i = 0; i < amount; i++) {
      input.nextLine();
      System.out.printf("Введите фамилию:");
      String name = input.nextLine();
      System.out.printf("Введите номер телефона:");
      String number = input.nextLine();
      Integer id = ListTask.get(ListTask.size() - 1).getId();
      id = id + 1;
      ListTask.add(new Task(id, name, number));
    }
  }
}
