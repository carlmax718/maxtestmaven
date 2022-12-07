package onecircle.core.model.sql.locale;

import jdk.jfr.DataAmount;
import lombok.*;
import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "locale_names")
public class Locale {
    @Id
    @Column(name = "locale", nullable = false)
    private String locale;

    @Column(name = "name")
    private String name;
    
}