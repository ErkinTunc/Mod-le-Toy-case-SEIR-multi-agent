

public class Human {
    private String status; // S,E,I,R
    private int elapsedTime; //time which has passed
    private int dE;
    private int dI;
    private int dR;

    //Constructor
    public Human(String status,int dE, int dI, int dR){
        this.status = status;
        this.dE = dE;
        this.dI = dI;
        this.dR = dR;
    }


    
}
