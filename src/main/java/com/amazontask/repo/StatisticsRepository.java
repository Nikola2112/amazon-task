package com.amazontask.repo;

import com.amazontask.model.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StatisticsRepository extends JpaRepository<Statistics, Long> {
    // Отримання статистики за вказану дату
    List<Statistics> findByDate(LocalDate date);

    // Отримання статистики за проміжок дат
    List<Statistics> findByDateBetween(LocalDate startDate, LocalDate endDate);

    // Отримання статистики за вказаний ASIN
    List<Statistics> findByAsin(String asin);

    // Отримання статистики за список ASIN
    List<Statistics> findByAsinIn(List<String> asins);
}
