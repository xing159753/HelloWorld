//package com.xing.responding.a1;
//
//import java.util.List;
//import java.lang.Iterable;
//import java.util.Date;
//
//import com.xing.responding.a6.SuperHero;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@RestController
//public class SuperHeroController {
//
//    private final SuperHeroRepository superHeroRepository;
//    private final SuperReportRepository superReportRepository;
//
//    public SuperHeroController(SuperHeroRepository superHeroRepository, SuperReportRepository superReportRepository) {
//        this.superHeroRepository = superHeroRepository;
//        this.superReportRepository = superReportRepository;
//    }
//
//    @RequestMapping("/superHeroes")
//    public Iterable<SuperHero> getSuperHeroes() {
//        Iterable<SuperHero> superHeroes = superHeroRepository.findAll();
//        return superHeroes;
//    }
//
//}
