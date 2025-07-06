package Challenge;

import java.util.Scanner;

public class DICE {
    // probabily of getting 0 is almost 0% but not 0% in this case
    void roll(){
        double random = Math.random() * 6;

         rolled((int) Math.ceil( random));
    }
    final char[][] ONE = {
            {' ',' ',' '},
            {' ','*',' '},
            {' ',' ',' '},
    };
    final char[][] TWO = {
            {'*',' ',' '},
            {' ',' ',' '},
            {' ',' ','*'},
    };
    final char[][] THREE = {
            {'*',' ',' '},
            {' ','*',' '},
            {' ',' ','*'},
    };
    final char[][] FOUR = {
            {'*',' ','*'},
            {' ',' ',' '},
            {'*',' ','*'},
    };
    final char[][] FIVE = {
            {'*',' ','*'},
            {' ','*',' '},
            {'*',' ','*'},
    };
    final char[][] SIX = {
            {'*',' ','*'},
            {'*',' ','*'},
            {'*',' ','*'},
    };

    void print( char[][] number){
        for( char[] x : number){
            for( char y : x){
                System.out.print(y+ " ");
            }
            System.out.println();
        }
    }

    void rolled( int n){
        switch (n) {
            case 1 : print( ONE); break;
            case 2 : print( TWO); break;
            case 3 : print( THREE); break;
            case 4 : print( FOUR); break;
            case 5 : print( FIVE); break;
            case 6 : print( SIX); break;
        }
    }


    //here probabily of getting 0 is 0% completely
    int rollOtherWay(){

        return (int)(Math.random() * 6 + 1);
    }


    public static void main(String[] args) {
        DICE dice = new DICE();
        char c;
        do{

            for(int i = 0 ; i < 20; i++){
                System.out.println();
            }
            dice.roll();

            Scanner input = new Scanner(System.in);
            for(int i = 0 ; i < 5; i++){
                System.out.println();
            }
            System.out.println("Press y/n to roll again :");

             c = input.next().charAt(0);
            } while( c=='y');

    }
}
