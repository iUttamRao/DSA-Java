public class KnapSack {

    static int knapSach01(int []weights,int prices[],int maxWeight,int index){
        //Termination Case
        if(index==weights.length || maxWeight==0){ // Bag Full
            return 0;
        }
       //if current item weight> given max weight so by pass that item
        if(weights[index]>maxWeight){
            knapSach01(weights, prices, maxWeight, index+1);
        }
        else{
            //current item weight is >maxweight
            //item can add in total
            //include in the bag(Weight less + value increase)
           int option1 = prices[index] + knapSach01(weights, prices, maxWeight-weights[index], index+1);
           // not include in the bag
           int option2= knapSach01(weights, prices, maxWeight, index+1);

           return Math.max(option1,option2);
        }
        //Pick value to place in a bag
        // not pick value to place in a bag
        return 0;
    }
    public static void main(String[] args) {
        int maxWeight=3; // maximum we have 3 kg capacity bag
        int prices[]={60,100,120};
        int weights[]={1,2,2};
       int maxProfit =knapSach01(weights, prices, maxWeight, 0);
       System.out.println(maxProfit);
    }
}
