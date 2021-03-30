package model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "taxes")
@Data
@NoArgsConstructor

public class Tax {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String taxName;
    private double taxRate;
    @ManyToMany(mappedBy = "taxes")
    private Set<Client> clients;

}
