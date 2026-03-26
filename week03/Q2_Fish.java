public class Q2_Fish {
    String name;
    double weight;

    public void displayinf() {
        // 修正重點：原本這裡寫成 wieght (拼錯了)，應改為 weight
        System.out.println("This fish's name is: " + name + " Weight: " + weight + " KG");
    }

    public static void main(String[] args) {
        Q2_Fish myfish = new Q2_Fish();
        myfish.name = "Black fish";
        myfish.weight = 250.5;

        myfish.displayinf();
    }
}