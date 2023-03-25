package com.lin.listen;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.listeners.JobListenerSupport;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: Code_Lin
 * date:2023/3/25 20:43
 */
@Service
public class JobListenerSupportImpl extends JobListenerSupport {

    private String name = "作业监听器";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void jobToBeExecuted(JobExecutionContext context) {
        super.jobToBeExecuted(context);
        System.out.println("jobToBeExecuted was done...");
    }

    @Override
    public void jobExecutionVetoed(JobExecutionContext context) {
        super.jobExecutionVetoed(context);
        System.out.println("jobExecutionVetoed was done...");
    }

    @Override
    public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
        super.jobWasExecuted(context, jobException);
        System.out.println("jobWasExecuted was done...");
    }
}
