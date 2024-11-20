package zoo_tickets.enteties;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;


@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    @Size(min = 5, max = 10, message = "Username must have between {min} and {max} characters")
    private String username;
    @Email
    private String email;
    @NotNull
    @Size(min = 5, max = 15, message = "Username must have between {min} and {max} characters")
    private String password;
    @Enumerated(EnumType.STRING)
    private ERole role;

    @OneToMany (mappedBy = "user")
    private List<TicketEntity> tickets;

    public UserEntity() {
    }

    public UserEntity(Integer id, String username, String email, String password, ERole role, List<TicketEntity> tickets) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.tickets = tickets;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotNull @Size(min = 5, max = 10, message = "Username must have between {min} and {max} characters") String getUsername() {
        return username;
    }

    public void setUsername(@NotNull @Size(min = 5, max = 10, message = "Username must have between {min} and {max} characters") String username) {
        this.username = username;
    }

    public @Email String getEmail() {
        return email;
    }

    public void setEmail(@Email String email) {
        this.email = email;
    }

    public @NotNull @Size(min = 5, max = 15, message = "Username must have between {min} and {max} characters") String getPassword() {
        return password;
    }

    public void setPassword(@NotNull @Size(min = 5, max = 15, message = "Username must have between {min} and {max} characters") String password) {
        this.password = password;
    }

    public ERole getRole() {
        return role;
    }

    public void setRole(ERole role) {
        this.role = role;
    }

    public List<TicketEntity> getTickets() {
        return tickets;
    }

    public void setTickets(List<TicketEntity> tickets) {
        this.tickets = tickets;
    }
}
