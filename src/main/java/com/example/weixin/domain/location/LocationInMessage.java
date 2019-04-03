package com.example.weixin.domain.location;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.example.weixin.domain.InMessage;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "xml")
public class LocationInMessage extends InMessage {
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "Location_X")
	@JsonProperty("Location_X")
	private String location_x;

	@XmlElement(name = "Location_Y")
	@JsonProperty("Location_Y")
	private String location_y;
	
	@XmlElement(name = "Scale")
	@JsonProperty("Scale")
	private String scale;

	@XmlElement(name = "Label")
	@JsonProperty("Label")
	private String label;
	
	public LocationInMessage() {
		super.setMsgType("location");
	}

	public String getLocation_x() {
		return location_x;
	}

	public void setLocation_x(String location_x) {
		this.location_x = location_x;
	}

	public String getLocation_y() {
		return location_y;
	}

	public void setLocation_y(String location_y) {
		this.location_y = location_y;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "LocationInMessage [location_x=" + location_x + ", location_y=" + location_y + ", scale=" + scale
				+ ", label=" + label + ", getToUserName()=" + getToUserName() + ", getFromUserName()="
				+ getFromUserName() + ", getCreateTime()=" + getCreateTime() + ", getMsgType()=" + getMsgType()
				+ ", getMsgId()=" + getMsgId() + "]";
	}
	

}
