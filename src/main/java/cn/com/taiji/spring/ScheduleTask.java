package cn.com.taiji.spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask implements InitializingBean {


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Sched init finish");
    }
}
