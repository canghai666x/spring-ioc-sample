package sample.crawler;

import org.springframework.stereotype.Service;

@Service("BaiduCrawler")
public class BaiduCrawler implements ICrawler {

    @Override
    public String run() {
        return this.getClass().getName() + " running.";
    }

}
