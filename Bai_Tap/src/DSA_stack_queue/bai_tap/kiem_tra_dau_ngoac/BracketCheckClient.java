package DSA_stack_queue.bai_tap.kiem_tra_dau_ngoac;

public class BracketCheckClient {
    public static void main(String[] args) {
        BracketCheck bracketCheck = new BracketCheck();
        bracketCheck.check("s * (s – a) * (s – b) * (s – c)");
        bracketCheck.check("(– b + (b^2 – 4*a*c)^(0.5/ 2*a)) ");
        bracketCheck.check("s * (s – a) * s – b) * (s – c)");
        bracketCheck.check("s * (s – a) * (s – b * (s – c)");

    }
}