package Challenge;

import java.math.BigInteger;

public class FinalFieldUse {
    final String name;
    final int id ;
//    final long MobNo;
    final long MobNo;
    public FinalFieldUse(String name, int id, long MobNo){
        this.name = name;
        this.id = id;
        this.MobNo = MobNo;
        System.out.println("This is constructor");
    }

    {
        System.out.println("This is a final field use case and its a static initial block ");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FinalFieldUse{ ");
        sb.append("name=").append(name);
        sb.append(", id=").append(id);
        sb.append(", MobNo=").append(MobNo);
        sb.append(" }");
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        FinalFieldUse employ1 = new FinalFieldUse("Aman" , 1 , 7877650647L);
        System.out.println(employ1);


    }

}
