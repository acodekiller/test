package com.lin;

import com.lin.config.QuartzConfig;
import com.lin.job.Hello;
import org.junit.jupiter.api.Test;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;

@SpringBootTest
class Test01QuartzApplicationTests {

    @Autowired
    private QuartzConfig config;

    @Test
    void contextLoads() throws Exception {
        

        Scheduler scheduler = config.scheduler();

        scheduler.start();


        JobDetail detail = JobBuilder.newJob(Hello.class)
                .withIdentity("JOB2","JOBGROUP2")
                .usingJobData("key","value")
                .build();

        Trigger trigger = TriggerBuilder.newTrigger()
                        .withIdentity("TRIGGER2","TraggerGroup2")
                .withSchedule(simpleSchedule().withRepeatCount(5).withIntervalInSeconds(3).repeatForever())
                        .build();


        scheduler.scheduleJob(detail,trigger);


        Thread.sleep(60000);
        scheduler.shutdown();
    }

}
