//package com.xing.threading.a4;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class FortuneTeller {
//
//    public static void main(String[] args) {
//
//        List<Question> questions = Arrays.asList(
//                new Question(Question.Difficulty.EASY, "Am I a good coder?"),
//                new Question(Question.Difficulty.MEDIUM, "Will I be able to this course?"),
//                new Question(Question.Difficulty.EASY, "Will it rain tomorrow?"),
//                new Question(Question.Difficulty.EASY, "Will it snow today?"),
//                new Question(Question.Difficulty.HARD, "Are you really all-knowing?"),
//                new Question(Question.Difficulty.HARD, "Do I have any hidden talents?"),
//                new Question(Question.Difficulty.MIDIUM, "Will I be rich one day?"),
//                new Question(Question.Difficulty.MEDIUM, " Should I clean my room?")
//        );
//
//        CrystalBall c = new CrystalBall();
//        List<Thread> threads = questions.stream().map(q -> {
//            Thread t = new Thread(() -> {
//                c.ask(q);
//            });
//            return t;
//        }).collect(Collectors.toList());
//        Thread supervisor = createSupervisor(threads);
//
//        threads.stream().forEach(t -> t.start());
//        supervisor.start();
//    }
//
//    public static Thread createSupervisor(List<Thread> threads) {
//
//        Thread supervisor = new Thread(() -> {
//            while (true) {
//                List<String> runningThreads = threads.stream().filter(t -> t.isAlive()).map(t -> t.getName()).collect(Collectors.toList());
//                System.out.println(Thread.currentThread().getName() + " - Currently running threads: " + runningThreads);
//                if (runningThreads.isEmpty()) {
//                    break;
//                }
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    System.out.println(e);
//                }
//            }
//            System.out.println(Thread.currentThread().getName() + " - All threads completed!");
//        });
//
//        supervisor.setName("Supervisor");
//
//        return supervisor;
//    }
//}
