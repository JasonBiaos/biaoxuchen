/**
 * 
 */
package com.waylau.spring.cloud.weather.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 城市实体类(解析xml文件(citylist.xml)映射到JavaBean)
 * @author Jason Biao
 *
 */
@XmlRootElement(name = "d")//映射xml文件
@XmlAccessorType(XmlAccessType.FIELD)//访问类型：@XmlAccessorType；XmlAccessType.FIELD：通过字段访问
public class City {

	//@XmlAttribute 是指xml文件中的对应的字段
	@XmlAttribute(name = "d1")
	private String cityId; // 城市ID

	@XmlAttribute(name = "d2")
	private String cityName;// 城市名称

	@XmlAttribute(name = "d3")
	private String cityCode;// 城市编码

	@XmlAttribute(name = "d4")
	private String province;// 省份名称

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

}
