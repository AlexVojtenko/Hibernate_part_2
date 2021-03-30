package model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
@Data
@NoArgsConstructor

public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long clientId;
    private String number;
    private double value;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client")
    private Client client;

}