package dad.geofx.model;

// LocationModel.java
public class LocationModel {
    private double latitude;
    private double longitude;
    private String city;
    private String country_name;
    private String callingCode;
    private String zip;
    private Currency currency;
    private Location location;
    private Time_zone time_zone;

    public class Currency {
        private String code;
        private String name;
        private String plural;
        private String symbol;
        private String symbol_native;

        @Override
        public String toString() {
            return "Currency{" +
                    "code='" + code + '\'' +
                    ", name='" + name + '\'' +
                    ", plural='" + plural + '\'' +
                    ", symbol='" + symbol + '\'' +
                    ", symbol_native='" + symbol_native + '\'' +
                    '}';
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPlural() {
            return plural;
        }

        public void setPlural(String plural) {
            this.plural = plural;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbolNative() {
            return symbol_native;
        }

        public void setSymbolNative(String symbol_native) {
            this.symbol_native = symbol_native;
        }

    }

    public static class Location {
        private String country_flag;
        private String calling_code;

        public String getCountryFlag() {
            return country_flag;
        }

        public void setCountryFlag(String country_flag) {
            this.country_flag = country_flag;
        }

        public String getCalling_code() {
            return calling_code;
        }

        public void setCalling_code(String calling_code) {
            this.calling_code = calling_code;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "country_flag='" + country_flag + '\'' +
                    ", calling_code='" + calling_code + '\'' +
                    '}';
        }

    }

    public static class Time_zone {
        private String code;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String toString() {
            return "Time_zone{" +
                    "code='" + code + '\'' +
                    '}';
        }
      
    }

    public Time_zone getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(Time_zone time_zone) {
        this.time_zone = time_zone;
    }

    @Override
    public String toString() {
        return "LocationModel{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", city='" + city + '\'' +
                ", country_name='" + country_name + '\'' +
                ", currency=" + currency +
                ", location=" + location +
                ", time_zone=" + time_zone +
                '}';
    }

    // Constructor, getters y setters para cada variable.

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountryName() {
        return country_name;
    }

    public void setCountryName(String country_name) {
        this.country_name = country_name;
    }

    public String getCallingCode() {
        return callingCode;
    }

    public void setCallingCode(String callingCode) {
        this.callingCode = callingCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
