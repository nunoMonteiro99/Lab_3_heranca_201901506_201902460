public class AudioVisualEquipment extends Equipment{

    private String resolution;
    private boolean isSmart;

    public AudioVisualEquipment(String id, String name, double dailyPrice, String resolution, boolean isSmart) {
        super(id, name, dailyPrice);
        this.resolution = resolution;
        this.isSmart = isSmart;
    }

    public String getResolution() {
        return resolution;
    }

    public boolean isSmart() {
        return isSmart;
    }

    @Override
    public String getEquipmentType() {
        return "AudioVisualEquipment";
    }

    @Override
    public double insuranceRate() {
        return 0.08;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + resolution + " - " + isSmart;
    }
}
