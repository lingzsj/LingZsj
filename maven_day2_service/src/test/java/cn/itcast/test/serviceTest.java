package cn.itcast.test;

import cn.itcast.domain.Items;

import cn.itcast.service.impl.itemsServicImpl;
import cn.itcast.service.itemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class serviceTest {

    @Test
    public void ServiceTextOne(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath*:applicationContext-*.xml");
        itemsService bean = ac.getBean(itemsService.class);
        List<Items> all = bean.findAll();
        for (Items itemsout : all) {
            System.out.println(itemsout);
        }

    }

}
