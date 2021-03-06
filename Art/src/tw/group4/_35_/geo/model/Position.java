package tw.group4._35_.geo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Position")
@Component
public class Position implements Serializable, Comparable<Position>{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "no")
	private Integer no;
	@Column(name = "uqid")
	private String uqid;
	@Column(name = "city")
	private String city;
	@Column(name = "district")
	private String district;
	@Column(name = "village")
	private String village;
	@Column(name = "address")
	private String address;
	@Column(name = "latitude")
	private Double latitude;
	@Column(name = "longitude")
	private Double longitude;
	@Transient
	private Double distance;
	@Transient
	private String title;
	@Transient
	private String time;
	
	public Position() {
		
	}

	
	public Integer getNo() {
		return no;
	}



	public void setNo(Integer no) {
		this.no = no;
	}



	public String getUqid() {
		return uqid;
	}



	public void setUqid(String uqid) {
		this.uqid = uqid;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public String getVillage() {
		return village;
	}



	public void setVillage(String village) {
		this.village = village;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Double getLatitude() {
		return latitude;
	}



	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}



	public Double getLongitude() {
		return longitude;
	}



	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}



	public Double getDistance() {
		return distance;
	}



	public void setDistance(Double distance) {
		this.distance = distance;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	@Override
	public int compareTo(Position other) {
		
		if(this.distance.equals(other.distance)) {
			return 0;
		}else if(this.distance>other.distance) {
			return 1;
		}else {
			return -1;
		}
	}
	
}
