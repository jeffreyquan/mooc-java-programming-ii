
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }
    
    public String getLiNumber() {
        return this.liNumber;
    }
    
    public String getCountry() {
        return this.country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        
        if (getClass() != object.getClass()) {
            return false;
        }
        
        LicensePlate comparedLicense = (LicensePlate) object;
        
         if (!Objects.equals(this.liNumber, comparedLicense.liNumber)) {
            return false;
        }
        if (!Objects.equals(this.country, comparedLicense.country)) {
            return false;
        }
        return true;
    }
    
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.liNumber);
        hash = 89 * hash + Objects.hashCode(this.country);
        return hash;
    }

}
