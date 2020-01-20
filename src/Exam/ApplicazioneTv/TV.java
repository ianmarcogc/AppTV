package Exam.ApplicazioneTv;

public class TV {
    private int luminosità;
    private String lingua;
    MonitorTV monitor;

    public TV(int luminosità, String lingua) {
        this.luminosità = luminosità;
        this.lingua = lingua;
        this.monitor = new MonitorTV();
    }

    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }

    public MonitorTV getMonitor() {
        return monitor;
    }

    public void setMonitor(MonitorTV monitor) {
        this.monitor = monitor;
    }
}
