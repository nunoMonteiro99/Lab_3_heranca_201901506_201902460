import java.util.Objects;

public class Equipment {

    private String id;
    private String name;
    private double dailyPrice;

    public Equipment(String id, String name, double dailyPrice) {
        this.id = id;
        this.name = name;
        this.dailyPrice = dailyPrice;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public String getEquipmentType() {
        return "Equipment";
    }

    public double insuranceRate() {
        return 0.01;
    }

    public double calculateInsurance() {
        return dailyPrice * insuranceRate();
    }


    @Override
    public String toString() {
        return id + " - " + name + " - " + dailyPrice;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof Equipment)){
            return false;
        }
        Equipment that = (Equipment) o;
        return Objects.equals(id, that.id);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
