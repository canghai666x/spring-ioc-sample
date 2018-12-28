package sample.crawler;

import org.springframework.stereotype.Service;

@Service("BingCrawler")
public class BingCrawler implements ICrawler{
    @Override
    public String run() {
        return this.getClass().getName() + " running.";
    }
}