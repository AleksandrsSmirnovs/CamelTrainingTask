package task.training.cameltraining.converter;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;
import task.training.cameltraining.entity.Order;
import task.training.cameltraining.entity.enums.OrderPriority;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Component
public class CsvToOrder {

    private static final SimpleDateFormat dateFormatter = new SimpleDateFormat("d/M/yyyy");

    public void csvToOrder(Exchange exchange) throws ParseException {
        String csv = (String) exchange.getIn().getBody();
        String[] split = csv.split(",");
        if (split[13].contains("Total")) {
            return;
        }
        Order order = new Order();
        order.setCountry(split[1]);
        order.setItemType(split[2]);
        order.setOrderPriority(OrderPriority.valueOf(split[4]));
        order.setOrderDate(dateFormatter.parse(split[5]));
        order.setOrderId(Long.parseLong(split[6]));
        order.setShippingDate(dateFormatter.parse(split[7]));
        order.setCost(new BigDecimal(split[12].trim()));
        order.setRevenue(new BigDecimal(split[11].trim()));
        order.setProfit(new BigDecimal(split[13].trim()));
        exchange.getIn().setBody(order);
    }
}
