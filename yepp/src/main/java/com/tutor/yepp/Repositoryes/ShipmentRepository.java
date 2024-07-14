package com.tutor.yepp.Repositoryes;

import com.tutor.yepp.models.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
}
