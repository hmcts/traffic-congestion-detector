package com.solirius.hosehackathon.repository;

import com.solirius.hosehackathon.domain.Coordinate;
import org.springframework.data.repository.CrudRepository;

public interface CoordinateRepository extends CrudRepository<Coordinate, Long> {
}
