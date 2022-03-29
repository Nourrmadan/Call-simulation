import java.util.ArrayList;
import java.util.Random;
//this is the call class, this is used to create the call object;
public class Call {
    String phoneNumber = "011";
    int callLength;
    static ArrayList<Call> allCalls = new ArrayList<Call>();
    static Random rand = new Random();

    // no-argument constructor.
    public Call(){
        phoneNumber =  phoneNumber + rand.nextInt(99999999);
        callLength = rand.nextInt(15);
        allCalls.add(this);
    }

    //this method is used to create the call object, using the Random class.
    public static Call createCall(){
        double chance = rand.nextFloat();
        if(chance > 0.5){
            return new Call();
        }
        return null;
    }
    //this method is used to process the calls
    public int processCall(int totalTime){
        return totalTime = totalTime + callLength;
    }
}
