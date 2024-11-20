package zoo_tickets.enteties;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
public class VisitZoneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Enumerated(EnumType.ORDINAL)
    private EZone zone;
    @NotNull
    private Double basePrice;
    @NotNull
    @Size(max = 300, message = "Description of zone must have maximum {max} characters")
    private String descriptionZone;

    @OneToMany(mappedBy = "zone")
    private List<TicketEntity> tickets;

    public VisitZoneEntity() {
    }

    public VisitZoneEntity(Integer id, EZone zone, Double basePrice, String descriptionZone, List<TicketEntity> tickets) {
        this.id = id;
        this.zone = zone;
        this.basePrice = basePrice;
        this.descriptionZone = descriptionZone;
        this.tickets = tickets;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<TicketEntity> getTickets() {
        return tickets;
    }

    public void setTickets(List<TicketEntity> tickets) {
        this.tickets = tickets;
    }

    public @NotNull @Size(max = 300, message = "Description of zone must have maximum {max} characters") String getDescriptionZone() {
        return descriptionZone;
    }

    public void setDescriptionZone(@NotNull @Size(max = 300, message = "Description of zone must have maximum {max} characters") String descriptionZone) {
        this.descriptionZone = descriptionZone;
    }

    public @NotNull Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(@NotNull Double basePrice) {
        this.basePrice = basePrice;
    }

    public EZone getZone() {
        return zone;
    }

    public void setZone(EZone zone) {
        this.zone = zone;
    }
}
