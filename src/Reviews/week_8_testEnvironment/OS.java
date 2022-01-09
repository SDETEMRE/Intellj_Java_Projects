package Reviews.week_8_testEnvironment;

public class OS {

    private String os;

    public OS(){

    }

    public OS(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "OS{" +
                "os='" + os + '\'' +
                '}';
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
