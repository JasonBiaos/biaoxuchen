package com.waylau.spring.cloud.weather.service;

import com.waylau.spring.cloud.weather.vo.WeatherResponse;

/**
 * Weather Data Service.
 * 
* @since 1.0.0 2018年09月13日
 * @author jason Biao
 */
public interface WeatherDataService {
	/**
	 * 根据城市ID查询天气数据
	 * 
	 * @param cityId
	 * @return
	 */
	WeatherResponse getDataByCityId(String cityId);

	/**
	 * 根据城市名称查询天气数据
	 * 
	 * @param cityId
	 * @return
	 */
	WeatherResponse getDataByCityName(String cityName);
	
	/**
	 * 根据城市id同步天气数据
	 * @param cityId
	 */
	void syncDateByCityId(String cityId);
}
