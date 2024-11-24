package zoo_tickets.enteties;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Double price;
    private String barCode;
    private LocalDateTime issuedTime;
    private LocalDateTime validUnit;
    @Enumerated(EnumType.STRING)
    private ETickets ticketType;

    @ManyToOne
    @JoinColumn(name = "zone")
    private VisitZoneEntity visitZone;

    @ManyToOne
    @JoinColumn(name = "user")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "reservation")
    private ReservationEntity reservation;

    public TicketEntity() {
    }

    public TicketEntity(Integer id, ReservationEntity reservation, UserEntity user, VisitZoneEntity visitZone, ETickets ticketType, LocalDateTime validUnit, LocalDateTime issuedTime, String barCode, Double price) {
        this.id = id;
        this.reservation = reservation;
        this.user = user;
        this.visitZone = visitZone;
        this.ticketType = ticketType;
        this.validUnit = validUnit;
        this.issuedTime = issuedTime;
        this.barCode = barCode;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public LocalDateTime getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(LocalDateTime issuedTime) {
        this.issuedTime = issuedTime;
    }

    public LocalDateTime getValidUnit() {
        return validUnit;
    }

    public void setValidUnit(LocalDateTime validUnit) {
        this.validUnit = validUnit;
    }

    public ETickets getTicketType() {
        return ticketType;
    }

    public void setTicketType(ETickets ticketType) {
        this.ticketType = ticketType;
    }

    public VisitZoneEntity getVisitZone() {
        return visitZone;
    }

    public void setVisitZone(VisitZoneEntity visitZone) {
        this.visitZone = visitZone;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public ReservationEntity getReservation() {
        return reservation;
    }

    public void setReservation(ReservationEntity reservation) {
        this.reservation = reservation;
    }
}
