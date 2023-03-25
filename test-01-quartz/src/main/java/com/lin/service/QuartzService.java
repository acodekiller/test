package com.lin.service;

import org.quartz.SchedulerException;

/**
 * description:
 * author: Code_Lin
 * date:2023/3/25 21:27
 */
public interface QuartzService {

    void addJob(String jobName,String groupName,String tName,String tGroup,String cron) throws SchedulerException;

    void deleteJob();


}
