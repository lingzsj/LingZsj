package cn.itcast.test;

import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDome {

    @Test
    public void findAll(){
        ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        ItemsDao bean = ap.getBean(ItemsDao.class);
        /*List<Items> all = bean.findAll();
        System.out.println(all);*/
       /* Items i=new Items();
        i.setName("黑马程序员");
        i.setPrice(1200d);
        i.setPic("巅峰之战");
        i.setCreatetime(new Date());
        i.setDetail("无语伦比");
        bean.saveEnnert(i);*/
        /*Items byId = bean.findById(9);
        System.out.println(byId);*/

    /*List<Items> byName = bean.findByName("黑马");
        System.out.println(byName);*/
    /*Items i=new Items();
    i.setId(7);
    i.setDetail("插入");
    bean.update(i);*/
    //测试完毕

    }
}
