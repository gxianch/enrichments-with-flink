package com.github.knaufk.enrichments.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnrichedMeasurements {

	private SensorMeasurement sensorMeasurement;
	private SensorReferenceData sensorReferenceData;
	public SensorMeasurement getSensorMeasurement() {
		return sensorMeasurement;
	}
	public void setSensorMeasurement(SensorMeasurement sensorMeasurement) {
		this.sensorMeasurement = sensorMeasurement;
	}
	public SensorReferenceData getSensorReferenceData() {
		return sensorReferenceData;
	}
	public void setSensorReferenceData(SensorReferenceData sensorReferenceData) {
		this.sensorReferenceData = sensorReferenceData;
	}
	public EnrichedMeasurements(SensorMeasurement sensorMeasurement, SensorReferenceData sensorReferenceData) {
		super();
		this.sensorMeasurement = sensorMeasurement;
		this.sensorReferenceData = sensorReferenceData;
	}
	
}
