import java.time.LocalDateTime;

public class Booking {
    private Long id;
    private Long customerId;
    private Long roomId;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private BookingStatus status;
    private Long customerSessionId;
}
