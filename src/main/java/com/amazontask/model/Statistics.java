package com.amazontask.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asin_id", nullable = false)
    private Asin asin;

    private LocalDate date;

    // Продажі
    private double orderedProductSalesAmount;
    private double orderedProductSalesB2BAmount;
    private int unitsOrdered;
    private int unitsOrderedB2B;
    private int totalOrderItems;
    private int totalOrderItemsB2B;
    private double averageSalesPerOrderItemAmount;
    private double averageSalesPerOrderItemB2BAmount;
    private double averageUnitsPerOrderItem;
    private double averageUnitsPerOrderItemB2B;
    private double averageSellingPriceAmount;
    private double averageSellingPriceB2BAmount;
    private int unitsRefunded;
    private double refundRate;
    private int claimsGranted;
    private double claimsAmount;
    private double shippedProductSalesAmount;
    private int unitsShipped;
    private int ordersShipped;

    //Трафік
    private int browserPageViews;
    private int browserPageViewsB2B;
    private int mobileAppPageViews;
    private int mobileAppPageViewsB2B;
    private int pageViews;
    private int pageViewsB2B;
    private int browserSessions;
    private int browserSessionsB2B;
    private int mobileAppSessions;
    private int mobileAppSessionsB2B;
    private int sessions;
    private int sessionsB2B;
    private double buyBoxPercentage;
    private double buyBoxPercentageB2B;
    private double orderItemSessionPercentage;
    private double orderItemSessionPercentageB2B;
    private double unitSessionPercentage;
    private double unitSessionPercentageB2B;
    private int averageOfferCount;
    private int averageParentItems;
    private int feedbackReceived;
    private int negativeFeedbackReceived;
    private double receivedNegativeFeedbackRate;

}
