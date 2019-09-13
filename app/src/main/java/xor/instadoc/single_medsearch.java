package xor.instadoc;

public class single_medsearch {

    private String medName, manufacturer, uses, infoUses, sideEffects, infoSideEffects, ageGroup, infoAgeGroup, doses, infoDoses, orderNow;

    public single_medsearch(String medName, String manufacturer, String uses, String infoUses, String sideEffects, String infoSideEffects, String ageGroup, String infoAgeGroup, String doses, String infoDoses, String orderNow) {
        this.medName = medName;
        this.manufacturer = manufacturer;
        this.uses = uses;
        this.infoUses = infoUses;
        this.sideEffects = sideEffects;
        this.infoSideEffects = infoSideEffects;
        this.ageGroup = ageGroup;
        this.infoAgeGroup = infoAgeGroup;
        this.doses = doses;
        this.infoDoses = infoDoses;
        this.orderNow = orderNow;
    }

    public String getMedName() {
        return medName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getUses() {
        return uses;
    }

    public String getInfoUses() {
        return infoUses;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public String getInfoSideEffects() {
        return infoSideEffects;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getInfoAgeGroup() {
        return infoAgeGroup;
    }

    public String getDoses() {
        return doses;
    }

    public String getInfoDoses() {
        return infoDoses;
    }

    public String getOrderNow() {
        return orderNow;
    }
}
