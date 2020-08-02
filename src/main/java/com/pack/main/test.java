package com.pack.main;

import com.pack.bean.MathCaculator;
import com.pack.configration.BeanConfig;
import com.pack.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Neo
 * @date 2020/3/11 21:07
 */
public class test {
    public test() {
    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//        TestController controller = (TestController) context.getBean("testController");
//        Animal prototypeAnimal = (Animal) context.getBean("prototypeAnimal");

        //在单实例bean中使用@Lookup，作用是确保带有@loopup注解的方法创造出来的是多实例的bean，不会被ioc容器保存
//        TestLookup testLookup = (TestLookup) context.getBean("testLookup");
//        Animal createAnimal1 = testLookup.createAnimal();
//        Animal createAnimal2 = testLookup.createAnimal();


        //获取单实例的factorybean
//        TestFactoryBean testFactoryBean = (TestFactoryBean) context.getBean("testFactoryBean");
//        TestFactoryBean testFactoryBean2 = (TestFactoryBean) context.getBean("&testFactoryBean");
//        TestFactoryBean testFactoryBean3 = (TestFactoryBean) context.getBean("&testFactoryBean");

        //测试aop
        MathCaculator mathCaculator = (MathCaculator) context.getBean("mathCaculator");
        Integer r = mathCaculator.div(1, 1);

        TestService service = (TestService) context.getBean("testService");
        service.insert();

    }



}
