package com.lin.service;

import com.lin.job.Hello;
import com.lin.job.Hello2;
import org.quartz.*;
import org.quartz.spi.MutableTrigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: Code_Lin
 * date:2023/3/25 21:27
 */
@Service
public class QuartzServiceImpl implements QuartzService{

    @Autowired
    private Scheduler scheduler;


    @Override
    public void addJob(String jName,String jGroup,String tName,String tGroup,String cron) throws SchedulerException {
        JobDetail jobDetail = JobBuilder.newJob(Hello2.class)
                .withIdentity(jName,jGroup)
                .build();
        JobDetail jobDetail2 = JobBuilder.newJob(Hello.class)
                .withIdentity(jName,jGroup)
                .build();
        CronScheduleBuilder cronSchedule =CronScheduleBuilder.cronSchedule("0/5 * * * * ?");
        CronTrigger trigger = TriggerBuilder.newTrigger()
                .withIdentity(tName,tGroup)
                .startNow()
                .withSchedule(cronSchedule)
                .build();
        scheduler.start();
        scheduler.scheduleJob(jobDetail,trigger);
        scheduler.scheduleJob(jobDetail2,trigger);

    }

    @Override
    public void deleteJob() {

    }
}
