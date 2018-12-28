package sample.crawler;

public class BaiduCrawler implements ICrawler {

    @Override
    public String run() {
        return this.getClass().getName() + " running.";
    }

}
