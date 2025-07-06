import javax.swing.*;

public class RandomNumberAndMathclass {
    public static void main(String[] args) {
        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(5.07));
        System.out.println(Math.floor(5.07));
        System.out.println(Math.round(5.07));
        System.out.println(Math.PI);
        JFrame f = new JFrame();
        f.setVisible(true);
        for( int i = 1 ; i <= 10 ; i++){

            long random =  Math.round(Math.random()*100)   ; //round return long bydefault
            System.out.println(random);

        }
    }
}
