package com.waylau.spring.cloud.weather.vo;

import java.io.Serializable;

/**
 * Weather Response.
 * 
 * @since 1.0.0 2018年09月13日
 * @author jason Biao
 */
public class WeatherResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private Weather data;
	private Integer status;
	private String desc;

	public Weather getData() {
		return data;
	}

	public void setData(Weather data) {
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
