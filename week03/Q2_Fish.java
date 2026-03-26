public class Q2_Fish {
    String name;
    double weight;

    public void displayinf() {
        // 注意：這裡必須拼寫正確為 weight，而不是 wieght
        System.out.println("This fish's name is: " + name + " Weight: " + weight + " KG");
    }

    public static void main(String[] args) {
        Q2_Fish myfish = new Q2_Fish();
        myfish.name = "Black fish";
        myfish.weight = 250.5;

        myfish.displayinf();
    }
}