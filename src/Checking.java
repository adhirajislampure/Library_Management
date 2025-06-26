public class Checking {
    private int id;
    private String name;
    private String email;
    private long contno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContno() {
        return contno;
    }

    public void setContno(long contno) {
        this.contno = contno;
    }

    @Override
    public String toString() {
        return "Checking{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contno=" + contno +
                '}';
    }
}
