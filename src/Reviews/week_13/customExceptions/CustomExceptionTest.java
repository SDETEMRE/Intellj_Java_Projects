package Reviews.week_13.customExceptions;

public class CustomExceptionTest {
    public static void main(String[] args) throws BreakTimeException {

        int minutes = 60;
        System.out.println("Class is going on for " + minutes + " minutes");

        if(minutes>45){
            throw new BreakTimeException("It is break time Hocam");
        }
        System.out.println("Lets continue class another " + (45-minutes) + " minutes");
    }

    private static class BreakTimeException extends Throwable {
        public BreakTimeException(String it_is_break_time_hocam) {
        }
    }
}
