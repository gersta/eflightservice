package de.dhbw.gerritstapper.flugbuchung.service;

import de.dhbw.gerritstapper.flugbuchung.model.Airport;
import de.dhbw.gerritstapper.flugbuchung.model.Flight;
import de.dhbw.gerritstapper.flugbuchung.repo.AirportRepo;
import de.dhbw.gerritstapper.flugbuchung.repo.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FlugService {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    ///////////////////////////////////////////////

    @Autowired
    private AirportRepo airportRepo;

    @RequestMapping(value = "/addAirport")
    public void addAirport(@RequestBody Airport airport) {
        airportRepo.save(airport);
    }

    @RequestMapping("/getAirports")
    public Iterable<Airport> getAirports() {
        return airportRepo.findAll();
    }

    @RequestMapping("/deleteAirport/{shortcut}")
    public void deleteAirport(@PathVariable("shortcut") String shortcut) {
        airportRepo.deleteAirportByShortcut(shortcut);
    }

    /////////////////////////////////////////////////

    @Autowired
    private FlightRepo flightRepo;

    @RequestMapping(value = "/addAirport")
    public void addFlight(@RequestParam String id, @RequestParam Airport destinationAirport) {
        Flight flight = new Flight();
        flight.setFlugId(id);
        flight.setDestinationAirport(destinationAirport);
        flightRepo.save(flight);
    }

    @RequestMapping("/getAirports")
    public Iterable<Flight> getFlights() {
        return flightRepo.findAll();
    }

    @RequestMapping("/deleteAirport/{id}")
    public void deleteFlight(@PathVariable("shortcut") String id) {
        flightRepo.delete(id);
    }
}
