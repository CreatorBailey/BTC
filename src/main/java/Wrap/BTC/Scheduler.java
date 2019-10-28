package Wrap.BTC;

import Wrap.Wrap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Scheduler {
private static final Logger log = LoggerFactory.getLogger(Scheduler.class);

@Scheduled(fixedRate = 5000)
    public void rePrint(){
    RestTemplate restTemplate = new RestTemplate();
    Wrap updated = restTemplate.getForObject("https://api.cryptonator.com/api/ticker/btc-usd", Wrap.class);
    log.info(updated.toString());
}
}
