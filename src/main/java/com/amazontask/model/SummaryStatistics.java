package com.amazontask.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SummaryStatistics {
    @Id
    private Long id;
    private Double totalOrderedProductSales;
    private Integer totalUnitsOrdered;
    private Integer totalTotalOrderItems;
    private Integer totalBrowserPageViews;
    private Integer totalMobileAppPageViews;
    private Integer totalSessions;

    public void addOrderedProductSales(double orderedProductSalesAmount) {
        this.totalOrderedProductSales += orderedProductSalesAmount;
    }

    public void addUnitsOrdered(int unitsOrdered) {
        this.totalUnitsOrdered += unitsOrdered;
    }

    public void addTotalOrderItems(int totalOrderItems) {
        this.totalTotalOrderItems += totalOrderItems;
    }

    public void addBrowserPageViews(int browserPageViews) {
        this.totalBrowserPageViews += browserPageViews;
    }

    public void addMobileAppPageViews(int mobileAppPageViews) {
        this.totalMobileAppPageViews += mobileAppPageViews;
    }

    public void addSessions(int sessions) {
        this.totalSessions += sessions;
    }
}
