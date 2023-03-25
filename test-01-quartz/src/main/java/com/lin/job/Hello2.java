package com.lin.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * description:
 * author: Code_Lin
 * date:2023/3/25 18:56
 */
public class Hello2 implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("执行定时任务中:" + new Date());
    }
}
