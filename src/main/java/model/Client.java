package model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "clients")
@Data
@NoArgsConstructor

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private long phone;
    private String about;
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "status_id")
    private Status status;
    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private Set<Account> accounts;
    @ManyToMany
    @JoinTable(
            name = "client_tax",
            joinColumns = @JoinColumn(name = "client_id"),
            inverseJoinColumns = @JoinColumn(name = "tax_id")
    )
    private Set<Tax> taxes;

}
