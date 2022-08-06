public class BmiService {

    public int calculate(int weight, int height) {
        int result;
        if (weight > 0) {
            result = weight / (height * 2 / 100);
        } else {
            result = 0;
        }
        return result;
    }
}
