package onecircle.core.model.sql.stockmarketholidays;

import java.io.Serializable;

/**
 * @author Baljit Singh
 *
 */

public class StockMarketHolidayId implements Serializable {
    
	public StockMarketHolidayId() {

    }

    private String date;
    private String holidayName;

    // default constructor

    public StockMarketHolidayId(String date, String holidayName) {
        this.date = date;
        this.holidayName = holidayName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((holidayName == null) ? 0 : holidayName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StockMarketHolidayId other = (StockMarketHolidayId) obj;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (holidayName == null) {
            if (other.holidayName != null)
                return false;
        } else if (!holidayName.equals(other.holidayName))
            return false;
        return true;
    }
}