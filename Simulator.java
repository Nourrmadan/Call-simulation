public class Simulator {
    static LLQueue callQueue = new LLQueue();
    static int timeTaken = 0;
    //timing loop simulates two hours where every iteration is one minute.
    public static int[] timingLoop(){
        int callCount=0, callAnswered=0;

        while(timeTaken <=120){
            Call newCall=Call.createCall();
            if(newCall!=null){
                callQueue.Enqueue(newCall);
                callCount++;
            }
            runSim();
            callAnswered++;
        }
        return new int[]{callAnswered, callCount, timeTaken};
    }
    //this is called every iteration to simulate what would happen every call.
    public static boolean runSim(){
        try {
            timeTaken = callQueue.Dequeue().processCall(timeTaken);
            return true;
        }catch(NullPointerException e){
            return false;
        }
    }
    //this contextualizes the output into something we can understand.
    public static String finalReport(int[] data){
        return "number of calls answered is " + data[0] + "\ntotal time taken is "
                + data[2] + "\ntotal calls in queue " + data[1];
    }
}
