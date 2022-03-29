package pl.p.lodz.zzpj.builder;

import java.util.Date;
import java.util.Map;

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

    public Building(BuildingBuilder builder){
        this.id = id;
        this.streetName = builder.streetName;
        this.streetNumber = builder.streetNumber;
        this.zipCode = builder.zipCode;
        this.buildingCompanyName = builder.buildingCompanyName;
        this.landlordName = builder.landlordName;
        this.constructionYear = builder.constructionYear;
        this.constructionEndYear = builder.constructionEndYear;
        this.flatsNumber = builder.flatsNumber;
        this.completeRentArea = builder.completeRentArea;
        this.completeRentAreaUnit = builder.completeRentAreaUnit;
        this.flatsDescription = builder.flatsDescription;
        this.flatsPrices = builder.flatsPrices;
        this.hasCarPark = builder.hasCarPark;
        this.hasGarden = builder.hasGarden;
        this.hasFence = builder.hasFence;
        this.petFriendlyFlag = builder.petFriendlyFlag;
        this.commercialGroundFloorFlag = builder.commercialGroundFloorFlag;
    }

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
    public static class BuildingBuilder {
        //Value is implemented builder for our onw class
        public Long id;
        public String streetName;
        public int streetNumber;
        public String zipCode;
        public String buildingCompanyName;
        public String landlordName;
        public Date constructionYear;
        public Date constructionEndYear;
        public long flatsNumber;
        public long completeRentArea;
        public String completeRentAreaUnit;
        public Map<String, String> flatsDescription;
        public Map<String, Long> flatsPrices;
        public boolean hasCarPark;
        public boolean hasGarden;
        public boolean hasFence;
        public boolean petFriendlyFlag;
        public boolean commercialGroundFloorFlag;

        public BuildingBuilder() {
        }
        public BuildingBuilder id(Long id){
            this.id = id;
            return this;
        }

        public BuildingBuilder streetName(String streetName){
            this.streetName = streetName;
            return this;
        }
        public BuildingBuilder streetNumber(int streetNumber){
            this.streetNumber = streetNumber;
            return this;
        }
        public BuildingBuilder zipCode(String zipCode){
            this.zipCode = zipCode;
            return this;
        }
        public BuildingBuilder buildingCompanyName(String buildingCompanyName){
            this.buildingCompanyName = buildingCompanyName;
            return this;
        }
        public BuildingBuilder landlordName(String landlordName){
            this.landlordName = landlordName;
            return this;
        }
        public BuildingBuilder constructionYear(Date constructionYear){
            this.constructionYear = constructionYear;
            return this;
        }
        public BuildingBuilder constructionEndYear(Date constructionEndYear){
            this.constructionEndYear = constructionEndYear;
            return this;
        }
        public BuildingBuilder flatsNumber(Long flatsNumber){
            this.flatsNumber = flatsNumber;
            return this;
        }
        public BuildingBuilder completeRentArea(Long completeRentArea){
            this.completeRentArea = completeRentArea;
            return this;
        }
        public BuildingBuilder completeRentAreaUnit(String completeRentAreaUnit){
            this.completeRentAreaUnit = completeRentAreaUnit;
            return this;
        }
        public BuildingBuilder flatsDescription(Map<String, String> flatsDescription){
            this.flatsDescription = flatsDescription;
            return this;
        }
        public BuildingBuilder flatsPrices(Map<String, Long> flatsPrices){
            this.flatsPrices = flatsPrices;
            return this;
        }
        public BuildingBuilder hasCarPark(Boolean hasCarPark){
            this.hasCarPark = hasCarPark;
            return this;
        }
        public BuildingBuilder hasGarden(Boolean hasGarden){
            this.hasGarden = hasGarden;
            return this;
        }
        public BuildingBuilder hasFence(Boolean hasFence){
            this.hasFence = hasFence;
            return this;
        }
        public BuildingBuilder petFriendlyFlag(Boolean petFriendlyFlag){
            this.petFriendlyFlag = petFriendlyFlag;
            return this;
        }
        public BuildingBuilder commercialGroundFloorFlag(Boolean commercialGroundFloorFlag){
            this.commercialGroundFloorFlag = commercialGroundFloorFlag;
            return this;
        }
        public Building build(){
            Building building = new Building(this);
            return building;
        }
    }
}
