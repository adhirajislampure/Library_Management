public class Rider {
    private String riderId;
    private String name;
    private String contact;
    private String location;

    public Rider(String riderId,String name,String contact,String location){
        this.riderId=riderId;
        this.name=name;
        this.contact=contact;
        this.location=location;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
