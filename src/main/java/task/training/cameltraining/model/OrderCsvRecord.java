package task.training.cameltraining.model;

import lombok.Data;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Component
@CsvRecord(separator = ",", skipFirstLine = true)
public class OrderCsvRecord {

    @DataField(pos = 1, trim = true)
    private String region;

    @DataField(pos = 2, trim = true)
    private String country;

    @DataField(pos = 3, trim = true)
    private String itemType;

    @DataField(pos = 4, trim = true)
    private String salesChannel;

    @DataField(pos = 5, trim = true)
    private char orderPriority;

    @DataField(pos = 6, trim = true, pattern = "d/M/yyyy")
    private Date orderDate;

    @DataField(pos = 7, trim = true)
    private long orderId;

    @DataField(pos = 8, trim = true, pattern = "d/M/yyyy")
    private Date shipDate;

    @DataField(pos = 9, trim = true)
    private int unitsSold;

    @DataField(pos = 10, trim = true)
    private BigDecimal unitPrice;

    @DataField(pos = 11, trim = true)
    private BigDecimal unitCost;

    @DataField(pos = 12, trim = true)
    private BigDecimal totalRevenue;

    @DataField(pos = 13, trim = true)
    private BigDecimal totalCost;

    @DataField(pos = 14, trim = true)
    private BigDecimal totalProfit;

    public OrderCsvRecord() {
    }

    public OrderCsvRecord(String region, String country, String itemType, String salesChannel, char orderPriority, Date orderDate, long orderId, Date shipDate, int unitsSold, BigDecimal unitPrice, BigDecimal unitCost, BigDecimal totalRevenue, BigDecimal totalCost, BigDecimal totalProfit) {
        this.region = region;
        this.country = country;
        this.itemType = itemType;
        this.salesChannel = salesChannel;
        this.orderPriority = orderPriority;
        this.orderDate = orderDate;
        this.orderId = orderId;
        this.shipDate = shipDate;
        this.unitsSold = unitsSold;
        this.unitPrice = unitPrice;
        this.unitCost = unitCost;
        this.totalRevenue = totalRevenue;
        this.totalCost = totalCost;
        this.totalProfit = totalProfit;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getSalesChannel() {
        return salesChannel;
    }

    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }

    public char getOrderPriority() {
        return orderPriority;
    }

    public void setOrderPriority(char orderPriority) {
        this.orderPriority = orderPriority;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public BigDecimal getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(BigDecimal totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public BigDecimal getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(BigDecimal totalProfit) {
        this.totalProfit = totalProfit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderCsvRecord that = (OrderCsvRecord) o;
        return orderPriority == that.orderPriority &&
                orderId == that.orderId &&
                unitsSold == that.unitsSold &&
                Objects.equals(region, that.region) &&
                Objects.equals(country, that.country) &&
                Objects.equals(itemType, that.itemType) &&
                Objects.equals(salesChannel, that.salesChannel) &&
                Objects.equals(orderDate, that.orderDate) &&
                Objects.equals(shipDate, that.shipDate) &&
                Objects.equals(unitPrice, that.unitPrice) &&
                Objects.equals(unitCost, that.unitCost) &&
                Objects.equals(totalRevenue, that.totalRevenue) &&
                Objects.equals(totalCost, that.totalCost) &&
                Objects.equals(totalProfit, that.totalProfit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, country, itemType, salesChannel, orderPriority, orderDate, orderId, shipDate, unitsSold, unitPrice, unitCost, totalRevenue, totalCost, totalProfit);
    }

    @Override
    public String toString() {
        return "OrderCsvRecord{" +
                "region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", itemType='" + itemType + '\'' +
                ", salesChannel='" + salesChannel + '\'' +
                ", orderPriority=" + orderPriority +
                ", orderDate=" + orderDate +
                ", orderId=" + orderId +
                ", shipDate=" + shipDate +
                ", unitsSold=" + unitsSold +
                ", unitPrice=" + unitPrice +
                ", unitCost=" + unitCost +
                ", totalRevenue=" + totalRevenue +
                ", totalCost=" + totalCost +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
