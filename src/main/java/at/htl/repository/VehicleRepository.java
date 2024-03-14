package at.htl.repository;

import at.htl.entity.Vehicle;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped // erzeugt ein Object solange die Applikation rennt, Singleton
public class VehicleRepository implements PanacheRepository<Vehicle> {

}
