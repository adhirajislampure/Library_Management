import java.time.LocalDateTime;

public class CustomerSession {

    private Long id;
    private Long customerId;
    private SessionStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime endedAt;
}
