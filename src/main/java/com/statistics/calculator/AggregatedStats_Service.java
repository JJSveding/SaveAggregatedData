package com.statistics.calculator;

import org.springframework.stereotype.Service;

@Service
public class AggregatedStats_Service {
    AggregatedStats_Repository aggregatedStats_repository;

    public AggregatedStats_Service(AggregatedStats_Repository attendance_statistics_aggregated_repository)
    {
        this.aggregatedStats_repository = attendance_statistics_aggregated_repository;
    }

    public void save(AggregatedStats ASA) {

        aggregatedStats_repository.save(ASA);
    }
}
