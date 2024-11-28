public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 90; //масса
        double height = 1.82; //рост
        int bmi = service.calculate (weight, height);
        System.out.println("Ваш индекс массы тела равен = "+bmi);
    }
}