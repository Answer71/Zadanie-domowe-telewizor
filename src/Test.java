public class Test {
    public static void main(String[] args) {
        Televisor tv1 = new Televisor("OFF");
        tv1.showStatus();

        tv1.tvSetOn();
        tv1.showStatus();

        tv1.tvSetOff();
        tv1.showStatus();

    }
}
