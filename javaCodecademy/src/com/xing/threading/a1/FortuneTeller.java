//package com.xing.threading.a1;
//
//import java.util.Arrays;
//
//public class FortuneTeller {
//    public static void main(String[] args) {
//        List<Question> question = Arrays.asList(
//                new Question(Question.Difficulty.EASY, "Am I a good coder?"),
//                new Question(Question.Diffculty.MEDIUM, "Will I be able to finish this course?"),
//                new Question(Question.Difficulty.EASY, "Will it rain tomorrow?"),
//                new Question(Question.Difficulty.EASY, "Will it snow today?"),
//                new Question(Question.Difficulty.HARD, "Are you really all-konwing?"),
//                new Question(Question.Difficulty.HARD, "Do I have any hidden talents?"),
//                new Question(Question.Difficulty.HARD, "Will I live to be greater than 100 years old?"),
//                new Question(Question.Difficulty.MEDIUM, "Will I be rich one day?"),
//                new Question(Question.Difficulty.MEDIUM, "Should I clean my room?")
//        );
//
//        question.stream().forEach(q ->{
//            CrystalBall c = new CrystalBall();
//            c.ask(q);
//        });
//    }
//}
