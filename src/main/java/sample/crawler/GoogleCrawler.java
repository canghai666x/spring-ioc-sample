package sample.crawler;

import org.springframework.stereotype.Service;

@Service("GoogleCrawler")
public class GoogleCrawler implements ICrawler {

    @Override
    public String run() {
        return this.getClass().getName() + " running.";
    }

}
