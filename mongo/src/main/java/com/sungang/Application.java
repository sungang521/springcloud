package com.sungang;

import com.sungang.test.User1;
import com.sungang.test.User2;
import com.sungang.type1.domain.User;
import com.sungang.type3.bean.AutoCtrDetail;

import com.sungang.type3.bean.AutoCtrLightP1;
import com.sungang.type3.bean.AutoCtrLightP2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.sungang")
public class Application {
    //public Application( AutoCtrRepository autoCtrRepository) {
//        AutoCtrLightP2 autoCtrLightP2 = new AutoCtrLightP2();
//        autoCtrLightP2.setUsrLuxHighTh("1");
//        autoCtrLightP2.setUsrLuxLowTh("2");
//        autoCtrLightP2.setUsrLuxOffAutoCtrSen("ds");
//        autoCtrLightP2.setUsrLuxOnAutoCtrSen("as");
//        AutoCtrLightP1 autoCtrLightP1 = new AutoCtrLightP1();
//        autoCtrLightP1.setAutoCtrLightP2(autoCtrLightP2);
//        autoCtrLightP1.setSysdevid("11111111111");
//        autoCtrLightP1.setUsrLuxAutoCtrOffEnable(0);
//        autoCtrLightP1.setUsrLuxAutoCtrOnEnable(0);
//        autoCtrLightP1.setUsrLuxAutoCtrParamEnable(0);
//        AutoCtrDetail autoCtrDetail = new AutoCtrDetail();
//        autoCtrDetail.setSysdevid("111111111111");
//        autoCtrDetail.setAutoCtrLightP1(autoCtrLightP1);
//        autoCtrDetail.setUsrAutoModEnable(0);
//        autoCtrDetail.setUsrLuxAutoCtrEnable(0);
//        autoCtrDetail.setUsrPirAutoCtrEnable(0);
//        autoCtrRepository.save(autoCtrDetail);
    //    System.out.println(autoCtrRepository.find("111111111111"));

   // }
    public Application(MongoTemplate mongoTemplate){
       // Criteria criteria = Criteria.where("sysdevid").is("111111111111");
       // List<AutoCtrDetail> list = mongoTemplate.find(Query.query(criteria),AutoCtrDetail.class);
        //System.out.println(list.get(0).getAutoCtrLightP1().getAutoCtrLightP2());
//        list.stream().forEach(System.out::println);
//
//        Update update = Update.update("autoCtrLightP1.autoCtrLightP2.usrLuxHighTh",new Integer[]{1,1,1});
//        Update update1 = new Update();
        /**
         * private String usrLuxHighTh;
         *     private String usrLuxLowTh;
         *     private String usrLuxOnAutoCtrSen;
         *     private String usrLuxOffAutoCtrSen;
         */
//        update1
//                .set("autoCtrLightP1.autoCtrLightP2.usrLuxHighTh",1)
//                .set("autoCtrLightP1.autoCtrLightP2.usrLuxOnAutoCtrSen",1)
//                .set("autoCtrLightP1.autoCtrLightP2.usrLuxOffAutoCtrSen",1);
//        mongoTemplate.updateFirst(Query.query(criteria),update1,AutoCtrDetail.class);


//        AutoCtrLightP2 autoCtrLightP2 = new AutoCtrLightP2();
//        autoCtrLightP2.setUsrLuxHighTh("1");
//        autoCtrLightP2.setUsrLuxLowTh("2");
//        autoCtrLightP2.setUsrLuxOffAutoCtrSen("ds");
//        autoCtrLightP2.setUsrLuxOnAutoCtrSen("as");
//        AutoCtrLightP1 autoCtrLightP1 = new AutoCtrLightP1();
//        autoCtrLightP1.setAutoCtrLightP2(autoCtrLightP2);
//        autoCtrLightP1.setSysdevid("11111111111");
//        autoCtrLightP1.setUsrLuxAutoCtrOffEnable(0);
//        autoCtrLightP1.setUsrLuxAutoCtrOnEnable(0);
//        autoCtrLightP1.setUsrLuxAutoCtrParamEnable(0);
//        AutoCtrDetail autoCtrDetail = new AutoCtrDetail();
//        autoCtrDetail.setSysdevid("111111111111");
//        autoCtrDetail.setAutoCtrLightP1(autoCtrLightP1);
//        autoCtrDetail.setUsrAutoModEnable(0);
//        autoCtrDetail.setUsrLuxAutoCtrEnable(0);
//        autoCtrDetail.setUsrPirAutoCtrEnable(0);
//        mongoTemplate.save(autoCtrDetail);


//        User1 user1 = new User1();
//        User2 user2 = new User2();
//        user1.setAge(10);
//        user1.setName("sungang");
//        user2.setAddress("dongningcun");
//        user2.setAge(11);
//        user2.setName("limeijie");
//        mongoTemplate.save(user1);
//        mongoTemplate.save(user2);

//        User2 user2 = mongoTemplate.findOne(Query.query(Criteria.where("name").is("limeijie")), User2.class);
//        user2.setName("lmj");
//        mongoTemplate.save(user2);

        User1 user1 = mongoTemplate.findOne(Query.query(Criteria.where("name").is("sungang")), User1.class);
        user1.setName("lmj");
        mongoTemplate.save(user1);
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
