package com.solirius.hosehackathon.repository;

import com.solirius.hosehackathon.domain.Sample;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SampleRepository extends CrudRepository<Sample, Long> {

    @Query("SELECT s FROM Sample s ORDER BY s.sampleLocalTime DESC")
    List<Sample> lastSeen(String numberPlate);

}
