//package com.xing.responding.a2;
//
//import com.xing.responding.a6.SuperHero;
//import org.springframework.web.bind.annotation.RestContorller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import java.util.List;
//import java.lang.Iterable;
//import java.util.Date;
//
//
//@RestController
//@RequestMapping(value = "/superHeroes")
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
//    @RequestMapping()
//    public Iterable<SuperHero> getSuperHeros() {
//        Iterable<SuperHero> superHeroes = superHeroRepository.findAll();
//        return superHeroes;
//    }
//
//}
