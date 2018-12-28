package sample.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sample.SpringContext;
import sample.crawler.ICrawler;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CrawlerController {

 
    @RequestMapping(value = "/crawler/{name}/run", method = RequestMethod.GET)
    public String run(@PathVariable final String name) {
        ICrawler iCrawler = (ICrawler)SpringContext.getBean(name);
        return iCrawler.run();
    }

}