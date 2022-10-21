import java.io.FileWriter;
import java.util.ArrayList;

public class Write implements WriteInterface {
  @Override
  public void WriteTaskFormat1(String text, ArrayList<Phonebook> ListTask) throws Exception {
    FileWriter w = new FileWriter(text, false);
    for (Phonebook Task : ListTask) {
      w.write(Task.getFullName() + "\n");
    }
    w.flush();
    w.close();
  }

  public void WriteTaskFormat2(String text, ArrayList<Phonebook> ListTask) throws Exception {
    FileWriter w = new FileWriter(text, false);
    for (Phonebook Task : ListTask) {
      w.write(Task.getId() + "\n");
      w.write(Task.getName() + "\n");
      w.write(Task.getNumber() + "\n");
    }
    w.flush();
    w.close();
  }

}
