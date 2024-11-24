package zoo_tickets.enteties.dtos;

import zoo_tickets.enteties.ETickets;

import java.time.LocalDateTime;

public class TicketDTO {
    private Integer id;
    private ETickets ticketType;
    private Integer visitZoneId;
    private Double price;
    private String barCode;
    private LocalDateTime issuedTime;
    private LocalDateTime validUnit;
    private Integer userId;

    public TicketDTO() {
    }

    public TicketDTO(Integer id, ETickets ticketType, Integer visitZoneId, Double price, String barCode, LocalDateTime validUnit, Integer userId, LocalDateTime issuedTime) {
        this.id = id;
        this.ticketType = ticketType;
        this.visitZoneId = visitZoneId;
        this.price = price;
        this.barCode = barCode;
        this.validUnit = validUnit;
        this.userId = userId;
        this.issuedTime = issuedTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ETickets getTicketType() {
        return ticketType;
    }

    public void setTicketType(ETickets ticketType) {
        this.ticketType = ticketType;
    }

    public Integer getVisitZoneId() {
        return visitZoneId;
    }

    public void setVisitZoneId(Integer visitZoneId) {
        this.visitZoneId = visitZoneId;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
