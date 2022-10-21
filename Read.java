import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Read implements ReadInterface {
  @Override
  public void ReadTaskF1(String text, ArrayList<Phonebook> ListTask) throws Exception {
    FileReader r = new FileReader(text);
    Scanner scan = new Scanner(r);
    while (scan.hasNextLine()) {
      String[] Data = scan.nextLine().split(" ");
      int id = Integer.parseInt(Data[0]);
      String name = Data[1];
      String number = Data[2];
      ListTask.add(new Task(id, name, number));
    }
    scan.close();
    r.close();
  }

  public void ReadTaskF2(String text, ArrayList<Phonebook> ListTask) throws Exception {
    FileReader r = new FileReader(text);
    Scanner scan = new Scanner(r);
    while (scan.hasNextLine()) {      
        int id = Integer.parseInt(scan.nextLine());
        String name = scan.nextLine();
        String number = scan.nextLine();
        ListTask.add(new Task(id, name, number));
        continue;
    }
    scan.close();
    r.close();
  }
}
