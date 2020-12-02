package task.training.cameltraining.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "region_reports")
public class RegionReport {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "region")
    private String region;

    @Column(name = "country")
    private String country;

    @Column(name = "order_count")
    private int orderCount;

    @Column(name = "avg_units_sold")
    private BigDecimal averageUnitsSold;

    @Column(name = "avg_unit_price")
    private BigDecimal averageUnitPrice;

    @Column(name = "avg_unit_cost")
    private BigDecimal averageUnitCost;

    @Column(name = "totalRevenue")
    private BigDecimal totalRevenue;

    @Column(name = "totalCost")
    private BigDecimal totalCost;

    @Column(name = "totalProfit")
    private BigDecimal totalProfit;

    @Column(name = "csv_file_name")
    private String csvFileName;

    @Column(name = "processing_date")
    private Date processingDate;


}
