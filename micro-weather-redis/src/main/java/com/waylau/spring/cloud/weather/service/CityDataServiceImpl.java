/**
 * 
 */
package com.waylau.spring.cloud.weather.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.waylau.spring.cloud.weather.util.XmlBuilder;
import com.waylau.spring.cloud.weather.vo.City;
import com.waylau.spring.cloud.weather.vo.CityList;

/**
 * 
 * CityDataServiceImpl 获取城市数据
 * @author Jason Biao
 *
 */
@Service
public class CityDataServiceImpl implements CityDataService {

	@Override
	public List<City> listCity() throws Exception {
		
		/**
		 * 1.读取xml文件citylist.xml
		 */
		//加载资源文件
		Resource resource = new ClassPathResource("citylist.xml");
		//InputStreamReader则是将字节数据转换为字符数据然后存放到缓冲当中，再经由缓冲流进行读取操作
		BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(), "utf-8"));
		StringBuffer sb = new StringBuffer();
		String line = "";
		while((line = br.readLine()) != null) {//将缓冲流当中读取到的信息赋值给字符串line
			sb.append(line);
		}
		
		br.close();
		/**
		 * 2.将xml文件转换成java对象
		 */
		CityList cityList = (CityList) XmlBuilder.xmlStrToOject(CityList.class, sb.toString());
		return cityList.getCityList();
	}

}
