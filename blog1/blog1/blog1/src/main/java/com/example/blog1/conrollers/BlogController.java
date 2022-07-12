package com.example.blog1.conrollers;

import com.example.blog1.models.Industry;
import com.example.blog1.models.Post;
import com.example.blog1.models.Post;
import com.example.blog1.models.Post_inf;
import com.example.blog1.models.Price;
import com.example.blog1.repo.PostRepository;
import com.example.blog1.repo.Post_infRepository;
import com.example.blog1.repo.IndustryRepository;
import com.example.blog1.repo.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class BlogController {

    @Autowired
    private FirstParameterRepo firstParameterRepo;
    @GetMapping("/blog/add")
    public String blogAdd(Model model) {


        return "blog-add";


    /*@PostMapping("/blog/add")
    public String FirstParametersAdd(@RequestParam String title, @RequestParam String anons, @RequestParam String full_text, Model model) {
        Post post = new Post(title, anons, full_text);
        postRepository.save(post);
        return "redirect:/blog";

    }*/
    //Сторінка розрахунку параметрів оптичного волокна
    @PostMapping("/blog/add")
    public String FirstParam_Add(@RequestParam Long id, @RequestParam String email, @RequestParam double показникЗаломленняСерцевини, @RequestParam double показникЗаломленняОболонки, @RequestParam double довжинаХвилі, @RequestParam double діаметрСерцевини, @RequestParam double Апертура, @RequestParam double РежимРоботи, Model model) {
        FirstParam firstParam = new FirstParam(id, email, показникЗаломленняСерцевини, показникЗаломленняОболонки, довжинаХвилі, діаметрСерцевини);
        firstParam.setРежимРоботи(count(firstParam));
        firstParameterRepo.save(firstParam);
        return "redirect:/blog";
    }

    public double count(FirstParam firstParam) {
        return ((Math.PI * firstParam.getДіаметрСерцевини() * (Math.sqrt((firstParam.getПоказникЗаломленняОболонки() * firstParam.getПоказникЗаломленняОболонки()) - (firstParam.getПоказникЗаломленняСерцевини() * firstParam.getПоказникЗаломленняСерцевини()))))/firstParam.getДовжинаХвилі());
    }



        //Сторінка виводу результатів розрахунку параметрів оптичного волокна
        @GetMapping("/blog")
        public String blog1Add(Model model) {
            return "blog";
        }



//    //Сторінка виводу результатів розрахунку параметрів оптичного волокна
//    @GetMapping("/blog2")
//    public String blog2Add(Model model) {
//
//        return "blog2";
//    }


        //    // Сторінка промислового користувача
//    @GetMapping("/industry")
//    public String industryAdd(Model model) {
//
//
//        return "industry";
//    }
//    @Autowired
//    private IndustryRepository industryRepository;
//    @PostMapping("/industry")
//    public String industryIndustryAdd(@RequestParam String i_name, @RequestParam String i_email, @RequestParam float iu_email, @RequestParam float iu_file, @RequestParam float iweb, @RequestParam float iphone, @RequestParam float ivideo_phone, @RequestParam float iaudio_phone, @RequestParam float ivideo, @RequestParam float ivideo_hd, Model model) {
//        Industry industry = new Industry(i_name, i_email, iu_email, iu_file, iweb, iphone, ivideo_phone, iaudio_phone, ivideo, ivideo_hd);
//        industry.setIsumP(count2(industry));
//        industry.setIsumN(count3(industry));
//        industryRepository.save(industry);
//        return "redirect:/blog2";
//    }
//    public double count2(Industry industry){
//        return (industry.getIu_email() * 0.1/3 + industry.getIu_file() * 0.2/3 + industry.getIweb() * 2/10 + industry.getIphone() * 2/2 + industry.getIvideo_phone() * 0.5/2 + industry.getIaudio_phone() * 0.4/2 + industry.getIvideo() * 0.4/2 + industry.getIvideo_hd() * 0.1/2);
//    }
//    public double count3(Industry industry){
//        return (industry.getIu_email() + industry.getIu_file() + industry.getIweb() + industry.getIphone() + industry.getIvideo_phone() + industry.getIaudio_phone() + industry.getIvideo() + industry.getIvideo_hd() );
//    }
//
//
//
//    //Розрахунок ціни ISDN мережи
//    @GetMapping("/price")
//    public String priceAdd(Model model) {
//        return "price";
//    }
//    @Autowired
//    private PriceRepository priceRepository;
//
//    @PostMapping("/price")
//    public String pricePriceAdd(@RequestParam String name1, @RequestParam String email1, @RequestParam float population, @RequestParam float routers, @RequestParam float rad_routers, @RequestParam float anten, @RequestParam float station, @RequestParam float atc, @RequestParam float kbc, @RequestParam float num_employ, @RequestParam float aver_salary) {
//        Price price = new Price(name1, email1, population, routers, rad_routers, anten, station, atc, kbc, num_employ, aver_salary);
//        price.setSum1(count4(price));
//        price.setSum2(count5(price));
//        priceRepository.save(price);
//        return "redirect:/blog2";
//    }
//    public double count4(Price price){
//        return (((price.getPopulation() / 2.5 + (price.getPopulation() / 2.5 / 2)) * price.getRouters()) + ((price.getPopulation() / 2.5 + (price.getPopulation() / 2.5 / 2)) * price.getRad_routers())  + (price.getAnten() * 4200)  + (price.getStation() * 50000) +  (((price.getPopulation() / 2.5 + (price.getPopulation() / 2.5 / 2))/10000) * 2 * price.getAtc()) +  (price.getKbc() * 2 * 4) + 3000000);
//    }           // кількість витрат на побудову та монтажно-налагоджувальні роботи за встановленими нормативами
//    public double count5(Price price) {
//        return ((0.15 * (((price.getPopulation() / 2.5 + (price.getPopulation() / 2.5 / 2)) * price.getRouters()) + ((price.getPopulation() / 2.5 + (price.getPopulation() / 2.5 / 2)) * price.getRad_routers())  + (price.getAnten() * 4200)  + (price.getStation() * 50000) +  (((price.getPopulation() / 2.5 + (price.getPopulation() / 2.5 / 2))/10000) * 2 * price.getAtc()) +  (price.getKbc() * 2 * 4) + 3000000) +  (price.getNum_employ() * price.getAver_salary() * 12) + (0.7 * price.getNum_employ() * price.getAver_salary()) )  / (price.getPopulation() / 2.5 + (price.getPopulation() / 2.5 / 2)));
//    }
//
//

//    // Сторінка цінконвергентної інфраструктури
//    @GetMapping("/money")
//    public String moneyAdd(Model model) {
//
//
//        return "money";
//    }
//
}
