package com.lin.controller;

import com.lin.service.QuartzService;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 * author: Code_Lin
 * date:2023/3/25 21:41
 */
@RestController
public class HelloController {

    @Autowired
    private QuartzService quartzService;

    @PostMapping("/addJob")
    public String addJob(@RequestParam("jName") String jName, @RequestParam("jGroup")String jGroup,@RequestParam("tName") String tName, @RequestParam("tGroup")String tGroup,@RequestParam("cron") String cron){
        try {
            quartzService.addJob(jName, jGroup, tName, tGroup, cron);
            return "添加任务成功！";
        } catch (SchedulerException e) {
            return "添加任务失败！！！";
        }
    }

}
