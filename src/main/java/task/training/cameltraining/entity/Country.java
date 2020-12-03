package task.training.cameltraining.entity;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

@Component
public class Country {

    private String region;

    @DataField(pos = 2)
    private String countryName;

    @DataField(pos = 3)
    private int orderCount;

    @DataField(pos = 4)
    private BigDecimal averageUnitsSold;

    @DataField(pos = 5)
    private BigDecimal averageUnitPrice;

    @DataField(pos = 6)
    private BigDecimal averageUnitCost;

    @DataField(pos = 7)
    private BigDecimal totalRevenueInMillions;

    @DataField(pos = 8)
    private BigDecimal totalCostInMillions;

    @DataField(pos = 9)
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return orderCount == country.orderCount &&
                Objects.equals(countryName, country.countryName) &&
                Objects.equals(averageUnitsSold, country.averageUnitsSold) &&
                Objects.equals(averageUnitPrice, country.averageUnitPrice) &&
                Objects.equals(averageUnitCost, country.averageUnitCost) &&
                Objects.equals(totalRevenueInMillions, country.totalRevenueInMillions) &&
                Objects.equals(totalCostInMillions, country.totalCostInMillions) &&
                Objects.equals(totalProfitInMillions, country.totalProfitInMillions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, orderCount, averageUnitsSold, averageUnitPrice, averageUnitCost, totalRevenueInMillions, totalCostInMillions, totalProfitInMillions);
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", orderCount=" + orderCount +
                ", averageUnitsSold=" + averageUnitsSold +
                ", averageUnitPrice=" + averageUnitPrice +
                ", averageUnitCost=" + averageUnitCost +
                ", totalRevenueInMillions=" + totalRevenueInMillions +
                ", totalCostInMillions=" + totalCostInMillions +
                ", totalProfitInMillions=" + totalProfitInMillions +
                '}';
    }

}
