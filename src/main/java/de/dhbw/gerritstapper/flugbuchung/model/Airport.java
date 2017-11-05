
package de.dhbw.gerritstapper.flugbuchung.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * um die Tabelle sehen zu können, im Browser localhost:8080/h2_console
 */

@Data
@Entity
public class Airport {

    @Id @GeneratedValue
    private Long airportID;
    private String shortcut;
    private String name;
    private String country;

    //default constructor for JPA (@Entity)
    public Airport() {}

    public Airport(String shortcut, String name, String country) {
        this.shortcut = shortcut;
        this.name = name;
        this.country = country;
    }
}
