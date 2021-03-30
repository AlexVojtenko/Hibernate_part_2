package model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "statuses")
@Data
@NoArgsConstructor

public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String alias;
    private String description;
    @OneToOne(mappedBy = "status")
    private Client client;

}
