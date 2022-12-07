package onecircle.core.util;

import lombok.Data;
import java.io.Serializable;

/**
 * Standardised Result Body template
 * @author Baljit Singh
 */
@Data
public class ResultBody implements Serializable {

    private static final long serialVersionUID = 4160134352051554197L;
    /** status code*/
    private Integer status;
    /** success or not*/
    private boolean success;
    /** Response message*/
    private String message;
}