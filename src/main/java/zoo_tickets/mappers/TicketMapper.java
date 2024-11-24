package zoo_tickets.mappers;

import org.springframework.stereotype.Component;
import zoo_tickets.enteties.TicketEntity;
import zoo_tickets.enteties.UserEntity;
import zoo_tickets.enteties.VisitZoneEntity;
import zoo_tickets.enteties.dtos.TicketDTO;

@Component
public class TicketMapper {

    public TicketDTO toDTO(TicketEntity entity){
        TicketDTO dto = new TicketDTO();
        dto.setId(entity.getId());
        dto.setTicketType(entity.getTicketType());
        dto.setVisitZoneId(entity.getVisitZone() != null ? entity.getVisitZone().getId() : null);
        dto.setPrice(entity.getPrice());
        dto.setBarCode(entity.getBarCode());
        dto.setIssuedTime(entity.getIssuedTime());
        dto.setValidUnit(entity.getValidUnit());
        dto.setUserId(entity.getUser() != null ? entity.getUser().getId() : null);
        return dto;
    }

    public TicketEntity toEntity (TicketDTO dto, VisitZoneEntity visitZone, UserEntity user){
        TicketEntity entity = new TicketEntity();
        entity.setId(dto.getId());
        entity.setTicketType(dto.getTicketType());
        entity.setVisitZone(visitZone);
        entity.setPrice(dto.getPrice());
        entity.setPrice(dto.getPrice());
        entity.setBarCode(dto.getBarCode());
        entity.setIssuedTime(dto.getIssuedTime());
        entity.setValidUnit(dto.getValidUnit());
        entity.setUser(user);
        return entity;

    }
}
