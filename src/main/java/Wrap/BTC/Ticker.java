package Wrap.BTC;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@JsonIgnoreProperties(ignoreUnknown = true)
@EnableScheduling
public class Ticker {
    private String base;
    private String target;
    private String price;
    private String volume;
    private String change;




    public Ticker() {
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }



    @Override
    public String toString() {



        return  "base=" + base +
                ", target='" + target +
                ", price" + price +
                ", volume"+ volume +
                ", change"+ change ;

    }
}