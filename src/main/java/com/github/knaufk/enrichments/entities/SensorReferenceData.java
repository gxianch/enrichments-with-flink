package com.github.knaufk.enrichments.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SensorReferenceData {

	private long sensorId;
	private double lon;
	private double lat;
	private String importantMetadata;
	private String moreImportantMetadata;
	public long getSensorId() {
		return sensorId;
	}
	public void setSensorId(long sensorId) {
		this.sensorId = sensorId;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public String getImportantMetadata() {
		return importantMetadata;
	}
	public void setImportantMetadata(String importantMetadata) {
		this.importantMetadata = importantMetadata;
	}
	public String getMoreImportantMetadata() {
		return moreImportantMetadata;
	}
	public void setMoreImportantMetadata(String moreImportantMetadata) {
		this.moreImportantMetadata = moreImportantMetadata;
	}

}
