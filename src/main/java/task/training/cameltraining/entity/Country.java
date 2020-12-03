package task.training.cameltraining.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
public class Country {

    private String countryName;
    private int orderCount;
    private BigDecimal averageUnitsSold;
    private BigDecimal averageUnitPrice;
    private BigDecimal averageUnitCost;
    private BigDecimal totalRevenueInMillions;
    private BigDecimal totalCostInMillions;
    private BigDecimal totalProfitInMillions;

    public String getCountryName() {
        return countryName;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public BigDecimal getAverageUnitsSold() {
        return averageUnitsSold;
    }

    public BigDecimal getAverageUnitPrice() {
        return averageUnitPrice;
    }

    public BigDecimal getAverageUnitCost() {
        return averageUnitCost;
    }

    public BigDecimal getTotalRevenueInMillions() {
        return totalRevenueInMillions;
    }

    public BigDecimal getTotalCostInMillions() {
        return totalCostInMillions;
    }

    public BigDecimal getTotalProfitInMillions() {
        return totalProfitInMillions;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public void setAverageUnitsSold(BigDecimal averageUnitsSold) {
        this.averageUnitsSold = averageUnitsSold;
    }

    public void setAverageUnitPrice(BigDecimal averageUnitPrice) {
        this.averageUnitPrice = averageUnitPrice;
    }

    public void setAverageUnitCost(BigDecimal averageUnitCost) {
        this.averageUnitCost = averageUnitCost;
    }

    public void setTotalRevenueInMillions(BigDecimal totalRevenueInMillions) {
        this.totalRevenueInMillions = totalRevenueInMillions;
    }

    public void setTotalCostInMillions(BigDecimal totalCostInMillions) {
        this.totalCostInMillions = totalCostInMillions;
    }

    public void setTotalProfitInMillions(BigDecimal totalProfitInMillions) {
        this.totalProfitInMillions = totalProfitInMillions;
    }

    public void addOrderCount() {
        orderCount++;
    }

    public void updateAverageUnitsSold(Order order) {
        averageUnitsSold = averageUnitsSold
                .multiply(BigDecimal.valueOf(orderCount))
                .add(BigDecimal.valueOf(order.getUnitsSold()))
                .divide(BigDecimal.valueOf(orderCount + 1)
                        .setScale(2, RoundingMode.HALF_EVEN));
    }

    public void updateAverageUnitPrice(Order order) {
        averageUnitPrice = averageUnitPrice
                .multiply(BigDecimal.valueOf(orderCount))
                .add(order.getUnitPrice())
                .divide(BigDecimal.valueOf(orderCount + 1)
                        .setScale(2, RoundingMode.HALF_EVEN));
    }

    public void updateAverageUnitCost(Order order) {
        averageUnitCost = averageUnitCost
                .multiply(BigDecimal.valueOf(orderCount))
                .add(order.getUnitCost())
                .divide(BigDecimal.valueOf(orderCount + 1)
                        .setScale(2, RoundingMode.HALF_EVEN));
    }

    public void addTotalRevenueInMillions(Order order) {
        totalRevenueInMillions.add(
                order.getRevenue()
                .divide(BigDecimal.valueOf(1000000))
                .setScale(6, RoundingMode.HALF_EVEN));
    }

    public void addTotalCostInMillions(Order order) {
        totalCostInMillions.add(
                order.getCost()
                        .divide(BigDecimal.valueOf(1000000))
                        .setScale(6, RoundingMode.HALF_EVEN));
    }

    public void addTotalProfitInMillions(Order order) {
        totalProfitInMillions.add(
                order.getProfit()
                        .divide(BigDecimal.valueOf(1000000))
                        .setScale(6, RoundingMode.HALF_EVEN));
    }


}
