/**
 * 
 */
package com.waylau.spring.cloud.weather.config;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.waylau.spring.cloud.weather.job.WeatherDataSyncJob;

/**
 * @author Jason Biaos
 * 
 *定时任务配置类
 */
@Configuration
public class QuartzConfiguration {

	private static final int TIME = 1800;//更新频率(30分钟)
	/**
	 * JobDetail
	 * Details：配置定时任务
	 * @return
	 */
	@Bean
	public JobDetail weatherDataSyncJobDetail() {
		return JobBuilder.newJob(WeatherDataSyncJob.class)
				.withIdentity("weatherDataSyncJob").storeDurably().build();
	}
	
	 /**
	  * Trigger
     * attention:  
     * Details：配置定时任务的触发器，也就是什么时候触发执行定时任务
     */
	@Bean
	public Trigger weatherDataSyncTrigger() {
		SimpleScheduleBuilder schedBuilder = SimpleScheduleBuilder.simpleSchedule().
				withIntervalInSeconds(TIME).repeatForever();
		
		return TriggerBuilder.newTrigger().forJob(weatherDataSyncJobDetail())
				.withIdentity("weatherDataSyncTrigger").withSchedule(schedBuilder).build();
	}
}
