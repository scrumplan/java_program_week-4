package Program_17_carpet_cost_calculator;

public class Carpet {
    double cost;
    public Carpet (double cost){
        if (cost < 0){
            this.cost = 0;

        }

    }
    public  double getCost(){
        return this.cost;
    }

}
