package onecircle.core.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.sql.Timestamp;
import onecircle.core.constants.OneCircleConstants;

/**
 * This Class will handle all the Date and Time related translation for
 * Onecircle Data entry into the database This is designed to maintain the date
 * consistency across the Batch jobs and other data ingestion system to be
 * precise and accurate. Timezone Applicable : NewYork Eastern
 * ONECIRCLE_APPLIED_ZONEID= "America/New_York"
 * 
 * @author Anshu Anand
 */
public class DateUtility {

    /**
     * Constructor
     */
    DateUtility() {
    }

    /**
     * This method returns DateTime now value in given timezone.
     * 
     * @return
     */
    public static LocalDateTime getDateTimeNow() {
        return LocalDateTime.now(ZoneId.of(OneCircleConstants.ONECIRCLE_APPLIED_TIMEZONE));
    }

    /**
     * This method returns current timestamp *
     * 
     * @return Timestamp
     */
    public static Timestamp getCurrentTimestamp() {
        LocalDateTime now = LocalDateTime.now(ZoneId.of(OneCircleConstants.ONECIRCLE_APPLIED_ZONEID));
        return Timestamp.valueOf(now);
    }

    /**
     * This method returns  timestamp  for given long value
     * 
     * @return Timestamp
     */
    public static Timestamp getTimestampFromLong(long timeStamp) {
        return new Timestamp(timeStamp);
    }

    /**
     * This method returns DateTime object given timestamp
     * 
     * @param timeStamp
     * @return
     */
    public static LocalDateTime getDateTimeFromTimestamp(long timeStamp) {
        Timestamp t = new Timestamp(timeStamp);
        return LocalDateTime.ofInstant(t.toInstant(), ZoneId.of(OneCircleConstants.ONECIRCLE_APPLIED_ZONEID));
    }

    /**
     * This method returns Date object given timestamp
     * 
     * @param timeStamp
     * @return
     */
    public static LocalDate getDateFromTimestamp(long timeStamp) {
        return getDateTimeFromTimestamp(timeStamp).toLocalDate();
    }

    /**
     * This method returns string DateTime object given timestamp value
     * 
     * @param timeStamp
     * @return
     */
    public static String getStrDateTimeFromTimestamp(long timeStamp) {
        return getDateTimeFromTimestamp(timeStamp).toString();
    }

    /**
     * This method returns string Date object given timestamp value
     * 
     * @param timeStamp
     * @return
     */
    public static String getStrDateFromTimestamp(long timeStamp) {
        return getDateFromTimestamp(timeStamp).toString();
    }

    /**
     * This method returns month for a given date
     * 
     * @param dt
     * @return
     */
    public static int getMonthFromDate(LocalDate dt) {
        return dt.getMonthValue();
    }

    /**
     * This method returns year for a given date
     * 
     * @param dt
     * @return
     */
    public static int getYearFromDate(LocalDate dt) {
        return dt.getYear();
    }

    /**
     * This method returns day for a given date
     * 
     * @param dt
     * @return
     */
    public static int getDayFromDate(LocalDate dt) {
        return dt.getDayOfMonth();
    }

    /**
     * This method return quarter for given month value
     * 
     * @param m
     * @return
     */
    public static int getQuarterFromMonth(int m) {
        int q = 1;
        if (m > 0) {
            return (m / 3) + 1;
        }
        return q;
    }
    
    public static LocalDateTime convertStringToDateTime(String dateTime) {
    	Instant instant = Instant.parse(dateTime);
    	return LocalDateTime.ofInstant(instant, ZoneId.of(OneCircleConstants.ONECIRCLE_APPLIED_ZONEID));
    }
}
