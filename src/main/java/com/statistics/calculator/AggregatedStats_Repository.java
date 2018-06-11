package com.statistics.calculator;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AggregatedStats_Repository extends CrudRepository<AggregatedStats, Long> {

}

