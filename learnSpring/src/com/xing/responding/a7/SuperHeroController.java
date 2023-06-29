//package com.xing.responding.a7;
//
//import java.util.List;
//import java.lang.Iterable;
//import java.util.Date;
//
//import com.xing.responding.a6.SuperHero;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.server.ResponseStatusException;
//
//@RestController
//@RequestMapping("/superHeroes")
//public class SuperHeroController {
//
//    private final SuperHeroRepository superHeroRepository;
//    private final SuperReportRepository superReportRepository;
//
//    public SuperHeroController(SuperHeroRepository superHeroRepository, SuperRepository superReportRepository) {
//        this.superHeroRepository = superHeroRepository;
//        this.superReportRepository = superReportRepository;
//    }
//
//    @GetMapping()
//    public Iterable<SuperHero> getSuperHeros() {
//        Iterable<SuperHero> superHeroes = superHeroRepository.findAll();
//        return superHeroes;
//    }
//
//    @PutMapping(path="/addNew")
//    public String createNewSuperHero(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String superPower) {
//        SuperHero newSuperHero = new SuperHero(firstName, lastName, superPower);
//        superHeroRepository.save(newSuperHero);
//
//    }
//
//}
