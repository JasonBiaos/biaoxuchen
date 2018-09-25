/**
 * 
 */
package com.waylau.spring.cloud.weather.service;

import java.util.List;

import com.waylau.spring.cloud.weather.vo.City;

/**
 * CityDataService 获取城市数据
 * @author Jason Biao
 *
 */
public interface CityDataService {

	/**
	 * 获取City列表
	 * @return
	 * @throws Exception
	 */
	List<City> listCity() throws Exception;
}
