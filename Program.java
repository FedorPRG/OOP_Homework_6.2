import java.util.ArrayList;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) throws Exception {
    ArrayList<Phonebook> ListTask = new ArrayList<>();
    Read r = new Read();
    Print p = new Print();
    Input i = new Input();
    Write w = new Write();
    System.out.print("\033[H\033[J");
    try (Scanner in = new Scanner(System.in)) {
      while (true) {
        System.out.println("Введите номер команды");
        System.out.println("1 - чтение из файла формат 1");
        System.out.println("2 - чтение из файла формат 2");
        System.out.println("3 - вывод на экран");
        System.out.println("4 - добавление записи");
        System.out.println("5 - запись в файл формат 1");
        System.out.println("6 - запись в файл формат 2");
        String key = in.next();
        switch (key) {
          case "1":
            r.ReadTaskF1("TaskLoadF1.txt", ListTask);
            break;
          case "2":
            r.ReadTaskF2("TaskLoadF2.txt", ListTask);
            break;
          case "3":
            p.PrintListTask(ListTask);
            break;
          case "4":
            i.InputTask(ListTask);
            break;
          case "5":
            w.WriteTaskFormat1("TaskSaveF1.txt", ListTask);
            break;
          case "6":
            w.WriteTaskFormat2("TaskSaveF2.txt", ListTask);
            break;
          default:
            System.out.println("Такой команды нет");
            break;
        }
      }
    }
  }
}
