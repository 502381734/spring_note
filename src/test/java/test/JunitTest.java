package test;

import com.pack.bean.MathCaculator;
import com.pack.configration.*;
import com.pack.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Neo
 * @date 2020/3/11 21:32
 */
public class JunitTest {


    public JunitTest() {
    }

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        System.out.println("容器创建完成");
        MathCaculator caculator = (MathCaculator) context.getBean("mathCaculator");
        String[] names = context.getBeanDefinitionNames();
        TestService testService = (TestService) context.getBean("testService");
        testService.insert();
        context.close();
    }

    @Test
    public void test0(){
        Class<?>[] clazzes = AnimalCondition.class.getClasses();
        Class<?>[] clazz = AnimalCondition.class.getDeclaredClasses();
        return;
    }


}
