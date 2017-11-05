package de.dhbw.gerritstapper.flugbuchung.repo;


import de.dhbw.gerritstapper.flugbuchung.model.Airport;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

//Crud Repository: create, read, update, delete
//Chevrons: für welche Klasse, durch welchen Datentyp ist diese Klasse identifiziert
public interface AirportRepo extends CrudRepository<Airport, Long> {

    //Spring erkennt, dass man einen Airport über den Shortcut löscht und erzeugt den SQL-Code dafür
    // <Methode><Object>By<Attribut>(<Datentyp> <attribut>
    //@Transactional: kann nur löschen, wenn markiert
    @Transactional
    void deleteAirportByShortcut(String shortcut);
}
