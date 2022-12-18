import java.util.Random;
import java.util.Scanner;
public class MoraGame {
    public static void main(String[] args) {

        Tom002 t = new Tom002();
        int isWinCount = 0;
        int[][] arr1 = new int[3][3];
        int j = 0;
        String[] arr2 = new String[3];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            System.out.println("请输入你要出的拳 （0-拳头， 1-剪刀， 2-布） ：");
            int num = scanner.nextInt();
            t.setTomGuessNum(num);
            int tomGuess = t.getTomGuessNum();
            arr1[i][j + 1] = tomGuess;
            int comGuess = t.computerNum();
            arr1[i][j+ 2] = comGuess;
            String isWin = t.vsComputer();
            arr2[i] = isWin;
            arr1[i][j] = t.count;
            System.out.println("=======================================");
            System.out.println("局数\t玩家的出拳\t电脑的出拳\t输赢情况");
            System.out.println(t.count + "\t\t\t" + tomGuess + "\t\t\t" + comGuess + "\t\t" + t.vsComputer());
            System.out.println("======================================");
            System.out.println("\n\n");
            isWinCount = t.winCount(isWin);
        }

        scanner.close();

        System.out.println("局数\t玩家的出拳\t电脑的出拳\t输赢情况");
        for(int a = 0; a < arr1.length; a++) {
            for(int b = 0; b < arr1[a].length; b++) {
                System.out.print(arr1[a][b] + "\t\t\t");
            }
            System.out.print(arr2[a]);
            System.out.println();
        }
        System.out.println("你赢了" + isWinCount + "次");
    }
}
//6.30
class Tom002 {
    int tomGuessNum;
    int comGuessNum;
    int winCountNum;
    int count = 1;
    public void showInfo() {

    }
    public int computerNum() {
        Random r = new Random();
        comGuessNum = r.nextInt(3);
        return comGuessNum;
    }
    public void setTomGuessNum(int tomGuessNum) {
        if(tomGuessNum > 2 || tomGuessNum < 0) {
            throw new IllegalArgumentException("数字输入错误");
        }
        this.tomGuessNum = tomGuessNum;
    }
    public int getTomGuessNum() {
        return tomGuessNum;
    }
    public String vsComputer() {
        if(tomGuessNum == 0 && comGuessNum == 1) {
            return "你赢了";
        } else if(tomGuessNum == 1 && comGuessNum == 2) {
            return "你赢了";
        } else if(tomGuessNum == 2 && comGuessNum == 0) {
            return "你赢了";
        } else if(tomGuessNum == comGuessNum) {
            return "平手";
        } else {
            return "你输了";
        }
    }
    public int winCount(String s) {
        count++;
        if(s.equals("你赢了")) {
            winCountNum++;
        }
        return winCountNum;
    }
}
