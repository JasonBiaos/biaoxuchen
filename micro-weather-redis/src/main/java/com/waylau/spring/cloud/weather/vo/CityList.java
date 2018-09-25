/**
 * 
 */
package com.waylau.spring.cloud.weather.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Jason Biao
 *城市列表信息
 */
@XmlRootElement(name = "c")//映射xml文件
@XmlAccessorType(XmlAccessType.FIELD)//访问类型：@XmlAccessorType；XmlAccessType.FIELD：通过字段访问
public class CityList {

	@XmlElement(name = "d")
	private List<City> cityList;

	public List<City> getCityList() {
		return cityList;
	}

	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}
	
	
}
