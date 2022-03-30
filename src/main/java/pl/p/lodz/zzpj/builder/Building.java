package pl.p.lodz.zzpj.builder;

import lombok.Builder;

import java.util.Date;
import java.util.Map;
@Builder
public class Building {

    private Long id;
    private String streetName;
    private int streetNumber;
    private String zipCode;
    private String buildingCompanyName;
    private String landlordName;
    private Date constructionYear;
    private Date constructionEndYear;
    private long flatsNumber;
    private long completeRentArea;
    private String completeRentAreaUnit;
    private Map<String, String> flatsDescription;
    private Map<String, Long> flatsPrices;
    private boolean hasCarPark;
    private boolean hasGarden;
    private boolean hasFence;
    private boolean petFriendlyFlag;
    private boolean commercialGroundFloorFlag;

    public Building(Long id, String streetName, int streetNumber, String zipCode) {
        this.id = id;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
    }

    public Building(Long id, String streetName, int streetNumber, String zipCode, String buildingCompanyName, String landlordName, Date constructionYear, Date constructionEndYear, long flatsNumber, long completeRentArea, String completeRentAreaUnit, Map<String, String> flatsDescription, Map<String, Long> flatsPrices, boolean hasCarPark, boolean hasGarden, boolean hasFence, boolean petFriendlyFlag, boolean commercialGroundFloorFlag) {
        this.id = id;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.buildingCompanyName = buildingCompanyName;
        this.landlordName = landlordName;
        this.constructionYear = constructionYear;
        this.constructionEndYear = constructionEndYear;
        this.flatsNumber = flatsNumber;
        this.completeRentArea = completeRentArea;
        this.completeRentAreaUnit = completeRentAreaUnit;
        this.flatsDescription = flatsDescription;
        this.flatsPrices = flatsPrices;
        this.hasCarPark = hasCarPark;
        this.hasGarden = hasGarden;
        this.hasFence = hasFence;
        this.petFriendlyFlag = petFriendlyFlag;
        this.commercialGroundFloorFlag = commercialGroundFloorFlag;
    }

    public Building(Date constructionEndYear, long flatsNumber, long completeRentArea, String completeRentAreaUnit, Map<String, String> flatsDescription, Map<String, Long> flatsPrices, boolean hasCarPark, boolean hasGarden) {
        this.constructionEndYear = constructionEndYear;
        this.flatsNumber = flatsNumber;
        this.completeRentArea = completeRentArea;
        this.completeRentAreaUnit = completeRentAreaUnit;
        this.flatsDescription = flatsDescription;
        this.flatsPrices = flatsPrices;
        this.hasCarPark = hasCarPark;
        this.hasGarden = hasGarden;
    }

    public Building(Long id, String streetName, int streetNumber, long completeRentArea, String completeRentAreaUnit, Map<String, String> flatsDescription, Map<String, Long> flatsPrices, boolean hasCarPark, boolean hasGarden, boolean hasFence, boolean petFriendlyFlag, boolean commercialGroundFloorFlag) {
        this.id = id;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.completeRentArea = completeRentArea;
        this.completeRentAreaUnit = completeRentAreaUnit;
        this.flatsDescription = flatsDescription;
        this.flatsPrices = flatsPrices;
        this.hasCarPark = hasCarPark;
        this.hasGarden = hasGarden;
        this.hasFence = hasFence;
        this.petFriendlyFlag = petFriendlyFlag;
        this.commercialGroundFloorFlag = commercialGroundFloorFlag;
    }

    public Building(Long id, String streetName, int streetNumber, String zipCode, String buildingCompanyName, String landlordName, Date constructionYear, Date constructionEndYear, long completeRentArea, boolean hasCarPark, boolean hasFence, boolean commercialGroundFloorFlag) {
        this.id = id;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.buildingCompanyName = buildingCompanyName;
        this.landlordName = landlordName;
        this.constructionYear = constructionYear;
        this.constructionEndYear = constructionEndYear;
        this.completeRentArea = completeRentArea;
        this.hasCarPark = hasCarPark;
        this.hasFence = hasFence;
        this.commercialGroundFloorFlag = commercialGroundFloorFlag;
    }

    public Building(Long id, String streetName, int streetNumber, String zipCode, String buildingCompanyName, String landlordName, Date constructionYear, Date constructionEndYear, long flatsNumber, long completeRentArea, String completeRentAreaUnit) {
        this.id = id;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.buildingCompanyName = buildingCompanyName;
        this.landlordName = landlordName;
        this.constructionYear = constructionYear;
        this.constructionEndYear = constructionEndYear;
        this.flatsNumber = flatsNumber;
        this.completeRentArea = completeRentArea;
        this.completeRentAreaUnit = completeRentAreaUnit;
    }

    public Building(Long id, String streetName, int streetNumber, String zipCode, Date constructionYear, Date constructionEndYear, long flatsNumber, Map<String, String> flatsDescription, Map<String, Long> flatsPrices, boolean hasCarPark, boolean hasGarden, boolean hasFence, boolean petFriendlyFlag, boolean commercialGroundFloorFlag) {
        this.id = id;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.constructionYear = constructionYear;
        this.constructionEndYear = constructionEndYear;
        this.flatsNumber = flatsNumber;
        this.flatsDescription = flatsDescription;
        this.flatsPrices = flatsPrices;
        this.hasCarPark = hasCarPark;
        this.hasGarden = hasGarden;
        this.hasFence = hasFence;
        this.petFriendlyFlag = petFriendlyFlag;
        this.commercialGroundFloorFlag = commercialGroundFloorFlag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getBuildingCompanyName() {
        return buildingCompanyName;
    }

    public void setBuildingCompanyName(String buildingCompanyName) {
        this.buildingCompanyName = buildingCompanyName;
    }

    public String getLandlordName() {
        return landlordName;
    }

    public void setLandlordName(String landlordName) {
        this.landlordName = landlordName;
    }

    public Date getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(Date constructionYear) {
        this.constructionYear = constructionYear;
    }

    public Date getConstructionEndYear() {
        return constructionEndYear;
    }

    public void setConstructionEndYear(Date constructionEndYear) {
        this.constructionEndYear = constructionEndYear;
    }

    public long getFlatsNumber() {
        return flatsNumber;
    }

    public void setFlatsNumber(long flatsNumber) {
        this.flatsNumber = flatsNumber;
    }

    public long getCompleteRentArea() {
        return completeRentArea;
    }

    public void setCompleteRentArea(long completeRentArea) {
        this.completeRentArea = completeRentArea;
    }

    public String getCompleteRentAreaUnit() {
        return completeRentAreaUnit;
    }

    public void setCompleteRentAreaUnit(String completeRentAreaUnit) {
        this.completeRentAreaUnit = completeRentAreaUnit;
    }

    public Map<String, String> getFlatsDescription() {
        return flatsDescription;
    }

    public void setFlatsDescription(Map<String, String> flatsDescription) {
        this.flatsDescription = flatsDescription;
    }

    public Map<String, Long> getFlatsPrices() {
        return flatsPrices;
    }

    public void setFlatsPrices(Map<String, Long> flatsPrices) {
        this.flatsPrices = flatsPrices;
    }

    public boolean isHasCarPark() {
        return hasCarPark;
    }

    public void setHasCarPark(boolean hasCarPark) {
        this.hasCarPark = hasCarPark;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public boolean isHasFence() {
        return hasFence;
    }

    public void setHasFence(boolean hasFence) {
        this.hasFence = hasFence;
    }

    public boolean isPetFriendlyFlag() {
        return petFriendlyFlag;
    }

    public void setPetFriendlyFlag(boolean petFriendlyFlag) {
        this.petFriendlyFlag = petFriendlyFlag;
    }

    public boolean isCommercialGroundFloorFlag() {
        return commercialGroundFloorFlag;
    }

    public void setCommercialGroundFloorFlag(boolean commercialGroundFloorFlag) {
        this.commercialGroundFloorFlag = commercialGroundFloorFlag;
    }
}
