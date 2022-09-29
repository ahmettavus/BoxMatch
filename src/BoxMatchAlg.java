public class BoxMatchAlg {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Ahmet" , 10 , 120 , 90, 10);
        Fighter f2 = new Fighter("Sakine" , 20 , 90 , 85,20);

        Match match = new Match(f1,f2,80,100);
        match.run();
    }
}
