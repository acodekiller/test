package com.lin.job;

import org.quartz.*;

/**
 * description:
 * author: Code_Lin
 * date:2023/3/19 17:11
 */
public class Hello implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        jobExecutionContext.isRecovering();
        JobDetail jobDetail = jobExecutionContext.getJobDetail();
        JobDataMap jobDataMap = jobDetail.getJobDataMap();
        System.out.println("key:"+jobDataMap.get("key"));
        System.out.println(jobDetail.getKey());
        System.out.println("执行定时任务中");
    }
}
