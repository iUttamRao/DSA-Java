public class KnapSack {

    static void printMatrix(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int matrix[][];
    static int tabulation(int prices[],int weights[],int maxWeight,int totalItems){
        matrix= new int[totalItems+1][maxWeight+1];
        //fill the 0th Row and fill the First column for the base case
        for(int i=0;i<=maxWeight;i++){
            matrix[0][i]=0; // Not need for java
        }
        for(int i=0;i<=totalItems;i++){
            matrix[i][0]=0; // Not need for java
        }
        for(int i=1;i<=totalItems;i++){
            for(int j=1;j<=maxWeight;j++){
                if(weights[i-1]>j){ //given weight is > than the max weight(Col)
                    matrix[i][j]=matrix[i-1][j];
                }
                else{
                    int option1 =prices[i-1]+matrix[i-1][j-weights[i-1]];
                    int option2 = matrix[i-1][j];
                    matrix[i][j]=Math.max(option1,option2);
                }
            }
        }
        return matrix[totalItems][maxWeight];
    }

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
        int maxWeight=10; // maximum we have 3 kg capacity bag
        int prices[]={10,40,30,50};
        int weights[]={5,4,6,3};
       int maxProfit =knapSach01(weights, prices, maxWeight, 0);
       System.out.println(maxProfit);

       System.out.println(tabulation(prices, weights, maxWeight, prices.length));

       System.out.println("Matrix is....");
       printMatrix(matrix);
    }
}
