public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 80;
        int height = 170;
        int index = service.calculate(weight, height);
        System.out.println(index);
    }
}
