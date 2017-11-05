package de.dhbw.gerritstapper.flugbuchung.repo;

import de.dhbw.gerritstapper.flugbuchung.model.Flight;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepo extends CrudRepository<Flight, String> {
}
