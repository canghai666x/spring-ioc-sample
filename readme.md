# Spring IOC基础测试

## 考察点

- spring ioc 基本使用

- spring bean 注解使用

- Java继承多态

## 验收标准

- 参照现有代码实现 BingCrawler/SoGouCrawler

- 访问 [localhost:8080/crawler/{crawlerName}/run](localhost:8080/crawler/{爬虫名称:如BaiduCrawler}/run)即可调用对应的BaiduCrawler.run方法返回XXX running.

- 注意: {crawlerName} 替换成对应的爬虫类名,如 BaiduCrawler/Googlerawler/BingCrawler

- 切换Crawler不允许使用if else 或者switch case,实现请参考Ioc相关资料

## 其他说明

- JDK1.8 + maven + spring boot

- [localhost:8080/crawler/BaiduCrawler/run](localhost:8080/crawler/{爬虫名称:如BaiduCrawler}/run) Web API 已实现,启动即可使用

- vs code 环境直接 debug启动Application.java 即可

- IDEA 环境直接启动 Application.java main方法

- maven 命令行可使用 "mvn spring-boot:run" 启动. 