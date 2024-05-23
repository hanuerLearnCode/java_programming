package Test;

/**
 * A class represents a vaccine object
 * which has
 * Name - mutable,
 */
public class Vaccine {
    private String name;
    private String country;
    private int effectDuration;

    public Vaccine(String name, String country, int effectDuration) {
        if (isValidateEffectDuration(effectDuration)) {
            this.effectDuration = effectDuration;
        }
        this.setName(name);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        if (isValidateName(name)) {
            this.name = name;
        }
    }

    private boolean isValidateName(String name) {
        return name.length() <= 15;
    }

    private boolean isValidateEffectDuration(int effectDuration) {
        return effectDuration >= 30 && effectDuration <= 120;
    }
}

/**
 * Object => passed by reference
 * Primitive data type => passed by value
 */