package com.amazontask.service;

import com.amazontask.model.Statistics;
import com.amazontask.model.SummaryStatistics;

import java.time.LocalDate;
import java.util.List;

public interface StatisticsService {

    // Отримання статистики за вказану дату
    List<Statistics> getStatisticsByDate(LocalDate date);

    // Отримання статистики за проміжок дат
    List<Statistics> getStatisticsByDateRange(LocalDate startDate, LocalDate endDate);

    // Отримання статистики за вказаним ASIN
    List<Statistics> getStatisticsByAsin(String asin);

    // Отримання статистики за списком ASIN
    List<Statistics> getStatisticsByAsinList(List<String> asins);

    // Отримання сумарної статистики по вказаному ASIN
    SummaryStatistics getSummaryStatisticsByASIN(String asin);

    // Отримання сумарної статистики по всім датам
    SummaryStatistics getSummaryStatistics();
}