public class GasStation {
    public static void main(String[] args) {
        int gas[] ={1,2,3,4,5};
        int cost[]={3,4,5,1,2};

        int startingPoint=0;
        int surplus=0;
        int deficit=0;

        for(int i=0;i<gas.length;i++){
            surplus=deficit+=gas[i]-cost[i];
            if(surplus<0){
                surplus=0;
                startingPoint++; // move to the next station
            }
        }
        if(deficit>=0){
            System.out.println("Starting Station "+startingPoint);
        }
    }
}
