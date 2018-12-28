package sample.crawler;

import org.springframework.stereotype.Service;

@Service("SogouCrawler")
public class SoGouCrawler implements ICrawler{

    @Override
    public String run() {
        return this.getClass().getName() + " running.";
    }

}