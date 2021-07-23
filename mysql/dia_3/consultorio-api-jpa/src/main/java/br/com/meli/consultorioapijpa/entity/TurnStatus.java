package br.com.meli.consultorioapijpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "turn_status")
public class TurnStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_turn_status")
    private Integer idTurnStatus;

    @Enumerated(EnumType.STRING)
    private Status name;

    private String description;

    // Constructors

    public TurnStatus(Status name, String description) {
        this.name = name;
        this.description = description;
    }

    public TurnStatus() {

    }

    // getters and setters

    public Integer getIdTurnStatus() {
        return idTurnStatus;
    }

    public void setIdTurnStatus(Integer idTurnStatus) {
        this.idTurnStatus = idTurnStatus;
    }

    public Status getName() {
        return name;
    }

    public void setName(Status name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
