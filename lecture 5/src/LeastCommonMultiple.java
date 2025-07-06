public class LeastCommonMultiple {
    public static void main(String[] args) {
        int num1 = 5, num2 = 90;
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + LCM(num1,num2));

    }
    public static int LCM( int num1, int num2){
        int greatest = Math.max( num1 , num2);
        int smallest = Math.min( num1 , num2);
        int i = greatest;
        while( true ){
            if( i % smallest == 0 ){
                return i;
            }
            i += greatest;
        }
    }
}
