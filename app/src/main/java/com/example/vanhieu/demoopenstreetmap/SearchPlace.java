package com.example.vanhieu.demoopenstreetmap;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchPlace {

    /**
     * place_id : 154538
     * licence : Data © OpenStreetMap contributors, ODbL 1.0. https://osm.org/copyright
     * osm_type : node
     * osm_id : 4965075429
     * boundingbox : ["21.0128849","21.0528849","105.7714641","105.8114641"]
     * lat : 21.0328849
     * lon : 105.7914641
     * display_name : Cầu Giấy, Hà Nội, 122000, Việt Nam
     * class : place
     * type : suburb
     * importance : 0.25
     * icon : /nominatim/images/mapicons/poi_place_village.p.20.png
     * address : {"suburb":"Cầu Giấy","city":"Hà Nội","postcode":"122000","country":"Việt Nam","country_code":"vn"}
     * svg : cx="105.791464099999999" cy="-21.032884899999999"
     */

    private String place_id;
    private String licence;
    private String osm_type;
    private String osm_id;
    private String lat;
    private String lon;
    private String display_name;
    @SerializedName("class")
    private String classX;
    private String type;
    private double importance;
    private String icon;
    private AddressBean address;
    private String svg;
    private List<String> boundingbox;

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getOsm_type() {
        return osm_type;
    }

    public void setOsm_type(String osm_type) {
        this.osm_type = osm_type;
    }

    public String getOsm_id() {
        return osm_id;
    }

    public void setOsm_id(String osm_id) {
        this.osm_id = osm_id;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getClassX() {
        return classX;
    }

    public void setClassX(String classX) {
        this.classX = classX;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getImportance() {
        return importance;
    }

    public void setImportance(double importance) {
        this.importance = importance;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    public String getSvg() {
        return svg;
    }

    public void setSvg(String svg) {
        this.svg = svg;
    }

    public List<String> getBoundingbox() {
        return boundingbox;
    }

    public void setBoundingbox(List<String> boundingbox) {
        this.boundingbox = boundingbox;
    }

    public static class AddressBean {
        /**
         * suburb : Cầu Giấy
         * city : Hà Nội
         * postcode : 122000
         * country : Việt Nam
         * country_code : vn
         */

        private String suburb;
        private String city;
        private String postcode;
        private String country;
        private String country_code;

        public String getSuburb() {
            return suburb;
        }

        public void setSuburb(String suburb) {
            this.suburb = suburb;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCountry_code() {
            return country_code;
        }

        public void setCountry_code(String country_code) {
            this.country_code = country_code;
        }
    }
}
