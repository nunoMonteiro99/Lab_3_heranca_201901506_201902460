public class ComputingEquipment extends Equipment{

    private String processor;

    public ComputingEquipment(String id, String name, double dailyPrice, String processor) {
        super(id, name, dailyPrice);
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    @Override
    public String getEquipmentType() {
        return "ComputingEquipment";
    }

    @Override
    public double insuranceRate() {
        return 0.05;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + processor;
    }

}
