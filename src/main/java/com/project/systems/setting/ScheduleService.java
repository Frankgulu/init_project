package com.project.systems.setting;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by lihengjie on 2016/12/1.
 */
@Service
public class ScheduleService {
    @Scheduled(cron = "* 30 22 * * ?")
    public void scheduleTest(){
        System.out.println("==========this is my schedual===========");
    }
}
