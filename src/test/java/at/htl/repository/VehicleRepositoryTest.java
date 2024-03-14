package at.htl.repository;

import at.htl.entity.Vehicle;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;


@QuarkusTest
class VehicleRepositoryTest {

    @Inject // inject brauche ich @QuarkusTest
    VehicleRepository vehicleRepository;

    @Disabled
    @Test
    @Transactional // lacy loading,
    void createRecordSmokeTest() {
        var vehicle = new Vehicle("Opel", "Kadett");
        vehicleRepository.persist(vehicle);
    }
}