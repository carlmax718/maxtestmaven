package onecircle.core.util;


import org.json.JSONObject;
import org.slf4j.Logger;
import java.util.Map;

/**
 * This class provides log factory for basic logging purposes
 * @author Siddharth
 * 
 */
public class LogFactory {
    private final Logger logger;

    public LogFactory(Logger logger) {
        this.logger = logger;
    }

    /**
     * This method is used to  log error
     */   
    @SuppressWarnings("unchecked")    
    public void logError(int code, String title, String message, Exception e, Map<String, Object> basicInfo) {
        logger.error(buildMessage(code, "EXCEPTION", title, message, basicInfo), e);
    }

    /**
     * This method is used to  log Info
     */
    @SuppressWarnings("unchecked")
    public void logInfo(int code, String title, String message, Map<String, Object> basicInfo) {
        logger.info(buildMessage(code, "INFO", title, message, basicInfo));
    }

    /**
     * This method is used to log debug
     */
    @SuppressWarnings("unchecked")
    public void logDebug(int code, String title, String message, Map<String, Object> basicInfo) {
        logger.debug(buildMessage(code, "DEBUG", title, message, basicInfo));
    }

    /**
     * This method is used to template error log
     */
    private String buildMessage(int code, String type, String title, String message, Map<String, Object> info) {
        JSONObject json = new JSONObject();
        json.put("statusCode", code);
        json.put("type", type);
        json.put("title", title);
        json.put("message", message);
        json.put("params", info);
        return json.toString();
    }
}