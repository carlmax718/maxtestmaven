package onecircle.core.model.sql.stockmarketholidays;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import onecircle.core.model.sql.stockmarketholidays.StockMarketHolidayId;

/**
 * @author Baljit Singh
 *
 */
@NoArgsConstructor
@Entity
@Table(name = "stockmarketholidays")
@IdClass(StockMarketHolidayId.class)
public class StockMarketHolidays  implements Serializable {


	public StockMarketHolidays(String stockExchange, String holidayName,
		String date, String status) {
        this.stockExchange = stockExchange;
        this.holidayName = holidayName;
        this.date = date;
        this.status = status;

    }

    @Column(name = "stock_exchange", nullable = false)
    private String stockExchange;

    @Id
    @Column(name = "holiday_name")
    private String holidayName;

    @Id
    @Column(name = "date")
    private String date;

    @Column(name = "status")
    private String status;
}
