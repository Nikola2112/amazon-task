package com.amazontask.service.impl;


import com.amazontask.model.Statistics;
import com.amazontask.model.SummaryStatistics;
import com.amazontask.repo.StatisticsRepository;
import com.amazontask.service.StatisticsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class StatisticsServiceImpl implements StatisticsService {


    private StatisticsRepository statisticsRepository;

    @Override
    public List<Statistics> getStatisticsByDate(LocalDate date) {
        return statisticsRepository.findByDate(date);
    }

    @Override
    public List<Statistics> getStatisticsByDateRange(LocalDate startDate, LocalDate endDate) {
        return statisticsRepository.findByDateBetween(startDate, endDate);
    }

    @Override
    public List<Statistics> getStatisticsByAsin(String asin) {
        return statisticsRepository.findByAsin(asin);
    }

    @Override
    public List<Statistics> getStatisticsByAsinList(List<String> asins) {
        return statisticsRepository.findByAsinIn(asins);
    }

    @Override
    public SummaryStatistics getSummaryStatisticsByASIN(String asin) {

        List<Statistics> statisticsList = statisticsRepository.findByAsin(asin);


        SummaryStatistics summaryStatistics = new SummaryStatistics();


        for (Statistics statistics : statisticsList) {
            //  продажі
            summaryStatistics.addOrderedProductSales(statistics.getOrderedProductSalesAmount());
            summaryStatistics.addUnitsOrdered(statistics.getUnitsOrdered());
            summaryStatistics.addTotalOrderItems(statistics.getTotalOrderItems());

            // трафік
            summaryStatistics.addBrowserPageViews(statistics.getBrowserPageViews());
            summaryStatistics.addMobileAppPageViews(statistics.getMobileAppPageViews());
            summaryStatistics.addSessions(statistics.getSessions());
        }

        return summaryStatistics;
    }


    @Override
    public SummaryStatistics getSummaryStatistics() {

        List<Statistics> statisticsList = (List<Statistics>) statisticsRepository.findAll();


        SummaryStatistics summaryStatistics = new SummaryStatistics();


        for (Statistics statistics : statisticsList) {
            // продажі
            summaryStatistics.addOrderedProductSales(statistics.getOrderedProductSalesAmount());
            summaryStatistics.addUnitsOrdered(statistics.getUnitsOrdered());
            summaryStatistics.addTotalOrderItems(statistics.getTotalOrderItems());

            // трафік
            summaryStatistics.addBrowserPageViews(statistics.getBrowserPageViews());
            summaryStatistics.addMobileAppPageViews(statistics.getMobileAppPageViews());
            summaryStatistics.addSessions(statistics.getSessions());
        }

        return summaryStatistics;
    }

}
