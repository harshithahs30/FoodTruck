package com.example.truck.foodTrucks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name ="datasets_41689_1462330_mobile_food_facility_permit")
public class FoodTruck {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="locationid")
	@JsonInclude(Include.NON_NULL)
	private int locationid;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="applicant")
	private String applicant;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="facility_type")
	private String facilityType;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="cnn")
	private long cnn;
	@JsonInclude(Include.NON_NULL)
	@Column(name="location_description")
	private String locationDescription;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="address")
	private String address;
	@JsonInclude(Include.NON_NULL)
	@Column(name="blocklot")
	private String blocklot	;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="block")
	private String block;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="lot")
	private String lot;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="permit")
	private String permit;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="Status")
	private String status;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="food_items")
	private String foodItems;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="X")
	private Double xx;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="Y")
	private Double yy;
	@JsonInclude(Include.NON_NULL)
	@Column(name="latitude")
	private Double latitude;
	@JsonInclude(Include.NON_NULL)
	@Column(name="longitude")
	private Double longitude;
	@JsonInclude(Include.NON_NULL)
	@Column(name="schedule")
	private String schedule;
	@JsonInclude(Include.NON_NULL)
	@Column(name="dayshours")
	private String dayshours;
	@JsonInclude(Include.NON_NULL)
	@Column(name="noi_sent")
	private String sentNOI;
	@JsonInclude(Include.NON_NULL)
	@Column(name="Approved")
	private String approved;
	@JsonInclude(Include.NON_NULL)
	@Column(name="received")
	private String received;
	@JsonInclude(Include.NON_NULL)
	@Column(name="prior_permit")
	private int priorPermit;
	@JsonInclude(Include.NON_NULL)
	@Column(name="expiration_date")
	private String expirationDate;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="location")
	private String location;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="fire_prevention_districts")
	private Integer firePreventionDistricts;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="police_districts")
	private Integer policeDistricts;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="supervisor_districts")
	private Integer supervisorDistricts;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="zip_codes")
	private String zipCodes;
	
	@JsonInclude(Include.NON_NULL)
	@Column(name="neighborhoods_old")
	private Integer neighbour;
	
	public FoodTruck() {
		
	}
	
	public int getLocationid() {
		return locationid;
	}
	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}
	public String getApplicant() {
		return applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}
	public String getFacilityType() {
		return facilityType;
	}
	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}
	public long getCnn() {
		return cnn;
	}
	public void setCnn(long cnn) {
		this.cnn = cnn;
	}
	public String getLocationDescription() {
		return locationDescription;
	}
	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBlocklot() {
		return blocklot;
	}
	public void setBlocklot(String blocklot) {
		this.blocklot = blocklot;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getLot() {
		return lot;
	}
	public void setLot(String lot) {
		this.lot = lot;
	}
	public String getPermit() {
		return permit;
	}
	public void setPermit(String permit) {
		this.permit = permit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(String foodItems) {
		this.foodItems = foodItems;
	}
	public Double getX() {
		return xx;
	}
	public void setX(double x) {
		this.xx = x;
	}
	public Double getY() {
		return yy;
	}
	public void setY(double y) {
		this.yy = y;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getDayshours() {
		return dayshours;
	}
	public void setDayshours(String dayshours) {
		this.dayshours = dayshours;
	}
	public String getSentNOI() {
		return sentNOI;
	}
	public void setSentNOI(String sentNOI) {
		this.sentNOI = sentNOI;
	}
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}
	public String getReceived() {
		return received;
	}
	public void setReceived(String received) {
		this.received = received;
	}
	public int getPriorPermit() {
		return priorPermit;
	}
	public void setPriorPermit(int priorPermit) {
		this.priorPermit = priorPermit;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getFirePreventionDistricts() {
		return firePreventionDistricts;
	}
	public void setFirePreventionDistricts(Integer firePreventionDistricts) {
		this.firePreventionDistricts = firePreventionDistricts;
	}
	public Integer getPoliceDistricts() {
		return policeDistricts;
	}
	public void setPoliceDistricts(int policeDistricts) {
		this.policeDistricts = policeDistricts;
	}
	public Integer getSupervisorDistricts() {
		return supervisorDistricts;
	}
	public void setSupervisorDistricts(int supervisorDistricts) {
		this.supervisorDistricts = supervisorDistricts;
	}
	public String getZipCodes() {
		return zipCodes;
	}
	public void setZipCodes(String zipCodes) {
		this.zipCodes = zipCodes;
	}
	public Integer getNeighbour() {
		return neighbour;
	}
	public void setNeighbour(int neighbour) {
		this.neighbour = neighbour;
	}
	public FoodTruck(int locationid, String applicant, String facilityType, long cnn, String locationDescription,
			String address, String blocklot, String block, String lot, String permit, String status, String foodItems,
			Double x, Double y, Double latitude, Double longitude, String schedule, String dayshours, String sentNOI,
			String approved, String received, int priorPermit, String expirationDate, String location,
			Integer firePreventionDistricts, Integer policeDistricts, Integer supervisorDistricts, String zipCodes, Integer neighbour) {
		this.locationid = locationid;
		this.applicant = applicant;
		this.facilityType = facilityType;
		this.cnn = cnn;
		this.locationDescription = locationDescription;
		this.address = address;
		this.blocklot = blocklot;
		this.block = block;
		this.lot = lot;
		this.permit = permit;
		this.status = status;
		this.foodItems = foodItems;
		this.xx = x;
		this.yy = y;
		this.latitude = latitude;
		this.longitude = longitude;
		this.schedule = schedule;
		this.dayshours = dayshours;
		this.sentNOI = sentNOI;
		this.approved = approved;
		this.received = received;
		this.priorPermit = priorPermit;
		this.expirationDate = expirationDate;
		this.location = location;
		this.firePreventionDistricts = firePreventionDistricts;
		this.policeDistricts = policeDistricts;
		this.supervisorDistricts = supervisorDistricts;
		this.zipCodes = zipCodes;
		this.neighbour = neighbour;
	}
	@Override
	public String toString() {
		return "FoodTruck [locationid=" + locationid + ", applicant=" + applicant + ", facilityType=" + facilityType
				+ ", cnn=" + cnn + ", locationDescription=" + locationDescription + ", address=" + address
				+ ", blocklot=" + blocklot + ", block=" + block + ", lot=" + lot + ", permit=" + permit + ", status="
				+ status + ", foodItems=" + foodItems + ", X=" + xx + ", Y=" + yy + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", schedule=" + schedule + ", dayshours=" + dayshours + ", sentNOI="
				+ sentNOI + ", Approved=" + approved + ", received=" + received + ", priorPermit=" + priorPermit
				+ ", expirationDate=" + expirationDate + ", location=" + location + ", firePreventionDistricts="
				+ firePreventionDistricts + ", policeDistricts=" + policeDistricts + ", supervisorDistricts="
				+ supervisorDistricts + ", zipCodes=" + zipCodes + ", neighbour=" + neighbour + "]";
	}

	
	
	
}
