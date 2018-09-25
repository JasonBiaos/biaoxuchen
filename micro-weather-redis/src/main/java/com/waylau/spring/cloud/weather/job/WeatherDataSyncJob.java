/**
 * 
 */
package com.waylau.spring.cloud.weather.job;

import java.util.List;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.waylau.spring.cloud.weather.service.CityDataService;
import com.waylau.spring.cloud.weather.service.WeatherDataService;
import com.waylau.spring.cloud.weather.vo.City;

/**
 * @author Jason Biao
 *
 *WeatherDataSyncJob  定时任务(天气数据同步)
 */
public class WeatherDataSyncJob extends QuartzJobBean {

	private  final static Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);
	
	@Autowired
	private CityDataService cityDataService;
	
	@Autowired
	private WeatherDataService weatherDataService;

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		logger.info("Weather Data Sync Job ---- Start!");
		/**
		 * 获取城市ID列表
		 */
		List<City> cityList = null;
		try {
			cityList = cityDataService.listCity();
		} catch (Exception e) {
			
			logger.error("获取城市ID列表异常",e);
		}
		
		/**
		 * 遍历城市ID同步天气数据
		 */
		for(City city : cityList) {
			String cityId = city.getCityId();//获取城市ID
			logger.info("Weather Data Sync Job***cityId:" + cityId);
			
			//根据城市id同步城市数据
			weatherDataService.syncDateByCityId(cityId);
		}
		
		logger.info("Weather Data Sync Job ---- End!");
	}

}
