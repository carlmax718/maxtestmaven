package onecircle.core.model.sql.stockohlc;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Primary key for StockOHLC entity class
 */
public class StockOHLCDailyID implements Serializable {

    public StockOHLCDailyID() {
    }

    private String ticker;
    private Timestamp timestamp;

    /**
     * Default Constructor
     */
    public StockOHLCDailyID(String ticker, Timestamp timestamp) {
        this.ticker = ticker;
        this.timestamp = timestamp;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ticker == null) ? 0 : ticker.hashCode());
        result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        StockOHLCDailyID other = (StockOHLCDailyID) obj;
        if (ticker == null) {
            if (other.ticker != null) {
                return false;
            }

        } else if (!ticker.equals(other.ticker)) {
            return false;
        }

        if (timestamp == null) {
            if (other.timestamp != null) {
                return false;
            }

        } else if (!timestamp.equals(other.timestamp)) {
            return false;
        }

        return true;
    }

}
