package onecircle.core.model.sql.base;

import javax.persistence.*;
import java.time.LocalDate;
import lombok.*;

/**
 * This is base class for all the data entities
 * 
 * * @author Anshu Anand
 * 
 */
public class DataEntityBase {

    public DataEntityBase(LocalDate date, int month, int year, int quarter, LocalDate updateDate, String source) {

        this.date = date;
        this.year = year;
        this.month = month;
        this.quarter = quarter;
        this.updateDate = updateDate;
        this.source = source;
    }

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "month")
    private int month;

    @Column(name = "year")
    private int year;

    @Column(name = "quarter")
    private int quarter;

    @Column(name = "updateDate")
    private LocalDate updateDate;

    @Column(name = "source")
    private String source;
}
