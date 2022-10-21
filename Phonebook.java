public abstract class Phonebook {
    protected Integer id;
    protected String name;
    protected String number;

    public Phonebook(int id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public String getFullName() {

        return String.format("%d  %-11s %-10s", id, name, number);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
}
