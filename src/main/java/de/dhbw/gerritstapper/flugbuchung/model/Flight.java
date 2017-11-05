package de.dhbw.gerritstapper.flugbuchung.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
public class Flight {

    @Id @GeneratedValue
    private String flugId;
    private Airport destinationAirport; //airport
    private Airport originAirport; //airport
    private LocalDate startDate;
    private LocalDate destinationDate;
    private String destinationGate;
    private String startGate;

    public Flight(){}
}
