package kr.hs.study;

import kr.hs.study.beans.Sports;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Sports sports1 = ctx.getBean("s1", Sports.class);
        sports1.getPlayer(13);
        sports1.getName("김홈런");
        sports1.rule();

        Sports sports2 = ctx.getBean("s2", Sports.class);
        sports2.getPlayer(5);
        sports2.getName("나파울");

        ctx.close();
    }
}