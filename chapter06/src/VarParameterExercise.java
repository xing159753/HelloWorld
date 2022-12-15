public class VarParameterExercise {
    public static void main(String[] args) {
        HspMethod1 m = new HspMethod1();
        System.out.println(m.showScore("milan", 10.2, 22.2));
        System.out.println(m.showScore("liang", 10.2, 22.2,333.3));
    }
}
class HspMethod1 {
    public String showScore(String name,double... scores) {
        double totalScore = 0;
        for(int i = 0; i < scores.length; i++) {
            totalScore += scores[i];
        }
        return name + " 有 " + scores.length + " 门课成绩总分为= " + totalScore;
    }
}
