package com.lin;

import com.lin.config.QuartzConfig;
import com.lin.job.Hello;
import com.lin.job.Hello2;
import com.lin.listen.JobListenerSupportImpl;
import org.junit.jupiter.api.Test;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.KeyMatcher;
import org.quartz.spi.MutableTrigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;

import static org.quartz.JobKey.*;
@SpringBootTest
class Test01QuartzApplicationTests {

    @Autowired
    private QuartzConfig config;

    @Autowired
    private JobListenerSupportImpl listenerSupport;

    @Test
    void contextLoads() throws Exception {
        

//        Scheduler scheduler = config.scheduler();
//
//        scheduler.start();
//
//
//        JobDetail detail = JobBuilder.newJob(Hello.class)
//                .withIdentity("JOB2","JOBGROUP2")
//                .usingJobData("key","value")
//                .build();
//
//        Trigger trigger = TriggerBuilder.newTrigger()
//                        .withIdentity("TRIGGER2","TraggerGroup2")
//                .withSchedule(simpleSchedule().withRepeatCount(5).withIntervalInSeconds(3).repeatForever())
//                        .build();
//
//
//        scheduler.scheduleJob(detail,trigger);
//
//
//        Thread.sleep(60000);
//        scheduler.shutdown();
    }


    @Test
    void contextLoads2() throws Exception {


        Scheduler scheduler = config.scheduler();



        scheduler.start();
        scheduler.getListenerManager().addJobListener(listenerSupport,KeyMatcher.keyEquals(jobKey("JOB1","JOBGROUP1")) );

        JobDetail detail = JobBuilder.newJob(Hello2.class)
                .withIdentity("JOB1","JOBGROUP1")
                .usingJobData("key","value")
                .build();

        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ?").withMisfireHandlingInstructionFireAndProceed();
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("TRIGGER1","TraggerGroup1")
                .withSchedule(cronScheduleBuilder)
                .build();


        scheduler.scheduleJob(detail,trigger);


        Thread.sleep(60000);
        scheduler.shutdown();
    }

}
