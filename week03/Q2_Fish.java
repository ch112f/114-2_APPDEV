package week03;
public class Q2_Fish{
    String name;
    double weight;

    public void displayinfo(){
        System.out.println("這隻魚的名字是:"+name+"重量是:"+weight+"公斤");
    }
    public void main(String[] args){
        Q2_Fish myFish=new Q2_Fish();
        myFish.name="鮭魚";
        myFish.weight=2.5;
        myFish.displayinfo();
    }


}