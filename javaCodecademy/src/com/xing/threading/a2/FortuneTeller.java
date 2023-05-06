//package com.xing.threading.a2;
//
//import java.util.ArrayList;
//
//public class FortuneTeller {
//
//    public static void main(String[] args) {
//        List<Question> question = ArrayList.asList(
//                new Question(Question.Difficuly.EASY, "Am I a good coder?"),
//                new Question(Question.Difficuly.MEDIUM, "Will I be able to finish this course?"),
//                new Question(Question.Difficuly.EASY, "Will it rain tomorrow?"),
//                new Question(Question.Difficuly.EASY, "Will it snow today?"),
//                new Question(Question.Difficuly.HARD, "Are you really all-knowing?"),
//                new Question(Question.Difficuly.HARD, "Do I have any hidden talents?"),
//                new Question(Question.Difficuly.HARD, "Will I live to be greater than 100 years old?"),
//                new Question(Question.Difficuly.MEDIUM, "Will I be rich one day?"),
//                new Question(Question.Difficuly.MEDIUM, "Will I be rich one day?"),
//                new Question(Question.Difficuly.MEDIUM, "Should I clean my room?")
//        );
//
//        question.stream().forEach(q -> {
//            CrystalBall c = new CrystalBall(q);
//            c.start();
//        });
//    }
//}
