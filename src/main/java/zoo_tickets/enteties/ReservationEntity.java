package zoo_tickets.enteties;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String visitorUsername;
    private LocalDateTime reservationDate;
    private LocalDateTime visitDate;
    private Double discount;

    @OneToMany(mappedBy = "reservation")
    private List<TicketEntity> tickets;

    public ReservationEntity() {
    }

    public ReservationEntity(Integer id, List<TicketEntity> tickets, Double discount, LocalDateTime visitDate, LocalDateTime reservationDate, String visitorUsername) {
        this.id = id;
        this.tickets = tickets;
        this.discount = discount;
        this.visitDate = visitDate;
        this.reservationDate = reservationDate;
        this.visitorUsername = visitorUsername;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVisitorUsername() {
        return visitorUsername;
    }

    public void setVisitorUsername(String visitorUsername) {
        this.visitorUsername = visitorUsername;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public List<TicketEntity> getTickets() {
        return tickets;
    }

    public void setTickets(List<TicketEntity> tickets) {
        this.tickets = tickets;
    }
}
