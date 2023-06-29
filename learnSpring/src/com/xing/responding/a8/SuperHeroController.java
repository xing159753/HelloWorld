//package com.xing.responding.a8;
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
//    private final SuperRepository superReportRepository;
//
//    public SuperHeroController(SuperHeroRepository superHeroRepository, SuperReportRepository superReportRepository) {
//        this.superHeroRepository = superHeroRepository;
//        this.superReportRepository = superReportRepository;
//    }
//
//    @GetMapping()
//    public Iterable<SuperHero> getSuperHeros() {
//        Iterable<SuperHero> superHeros = superHeroRepository.findAll();
//        return superHeroes;
//    }
//
//    @PutMapping(path="/addNew")
//    public String createNewSuperHero(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String superPower) {
//        SuperHero newSuperHero = new SuperHero(firstName, lastName, superPower);
//        superHeroRepository.save(newSuperHero);
//        return "New Super Hero successfully added!";
//    }
//
//    @PostMapping(path="/help")
//    public String postHelp(@RequestParam String postalCode, @RequestParam String streetAddress) {
//        SuperReport newSuperReport = new SuperReport(postalCode, streetAddress,"");
//        superReportRepository.save(newSuperReport);
//        return "Thanks! Super Heroes have been dispatched to your location!";
//    }
//
//    @GetMapping(path="/heroRepot")
//    public Iterable<SuperReport> getHeroReport() {
//        Iterable<SuperReport> superReport = superReportRepository.findAll();
//        return superReport;
//    }
//
//    @GetMapping(path="/{postalCode}")
//    public Iterable<SuperReport> getHeroReportByPostal(@PathVariable String postalCode) {
//        Iterable<SuperReport> superReport = superReportRepository.findByPostalCode(postalCode);
//        return superReport;
//    }
//
//    @GetMapping("/testException")
//    public void testInvalidEntryException() {
//        throw new InvalidEntryException();
//    }
//
//
//
//
//}
