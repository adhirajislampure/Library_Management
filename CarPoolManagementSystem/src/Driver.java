public class Driver {
    private String driverId;
    private String name;
    private String contact;
    private String carDetails;
    private int availableSeats;

    private String routes;


    public Driver(String driverId, String name, String contact, String carDetails, int availableSeats, String routes) {
        this.driverId = driverId;
        this.name = name;
        this.contact = contact;
        this.carDetails = carDetails;
        this.availableSeats = availableSeats;
        this.routes = routes;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
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

    public String getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(String carDetails) {
        this.carDetails = carDetails;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getRoutes() {
        return routes;
    }

    public void setRoutes(String routes) {
        this.routes = routes;
    }
}
