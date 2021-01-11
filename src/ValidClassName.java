public class ValidClassName {
    public static void main(String[] args) {
        String regex="^[CAP][0-9]{4}[GHIKLM]$";
        String className1="C0318G";
        String className2="M0318G";
        String className3="P0323A";
        System.out.println(className1.matches(regex));
        System.out.println(className2.matches(regex));
        System.out.println(className3.matches(regex));
    }
}
