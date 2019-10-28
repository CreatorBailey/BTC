package Wrap;

import Wrap.BTC.Ticker;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@JsonIgnoreProperties(ignoreUnknown = true)
@EnableScheduling
public class Wrap {
    private Long timestamp;
    private boolean success;
    private String error;
    private Ticker ticker;


    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Ticker getTicker() {
        return ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    @Override
    public String toString() {
        return "Wrap{" +
                "timestamp=" + timestamp +
                ", success=" + success +
                ", error='" + error + '\'' +
                ", ticker=" + ticker +
                '}';
    }
}


