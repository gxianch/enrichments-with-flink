package com.github.knaufk.enrichments.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SensorMeasurement {

	private long timestamp;
	private long sensorId;
	private double value;
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public long getSensorId() {
		return sensorId;
	}
	public void setSensorId(long sensorId) {
		this.sensorId = sensorId;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public static class  builder() {
		// TODO Auto-generated method stub
		 return null;
	}
	

}
