//package com.xing.responding.a6;
//
//import java.util.List;
//import java.lang.Iterable;
//import java.util.Date;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotaton.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.spingframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//
//@RestController
//@RequestMapping("/superHeroes")
//public class SuperHeroController {
//
//    private final SuperHeroRepository superHeroRepository;
//    private final SuperRepository superReportRepository;
//
//    public SuperHeroController(SuperHeroRepository superHeroRepository, SuperReportRepository superReportRepository) {
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
//    @PathMapping(path="/help")
//    public String postHelp(@RequestParam String postalCode, @RequestParam String streetAddress) {
//        SuperReport newSuperReport = new SuperReport(postalCode, streetAddress, "");
//        superReportRepository.save(newSuperReport);
//        return "Thanks! Super Heroes hava been dispatched to your location!";
//    }
//
//    @GetMapping(path="/heroReport")
//    public Iterable<SuperReport> getHeroReport() {
//        Iterable<SuperReport> superReport = superReportRepository.findAll();
//        return superReport;
//    }
//
//    @PostMapping(path="/{postalCode}")
//    public Iterable<SuperReport> getHeroReportByPostal(@PathVariable String postalCode) {
//        Iterable<SuperReport> superReport = superReportRepository.findByPostalCode(postalCode);
//        return superReport;
//    }
//
//
//}
