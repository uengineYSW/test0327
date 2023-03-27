package test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.TestBApplication;
import test.domain.EveB;

@Entity
@Table(name = "AggB_table")
@Data
public class AggB {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        EveB eveB = new EveB(this);
        eveB.publishAfterCommit();
    }

    public static AggBRepository repository() {
        AggBRepository aggBRepository = TestBApplication.applicationContext.getBean(
            AggBRepository.class
        );
        return aggBRepository;
    }

    public static void polB(EveA eveA) {
        /** Example 1:  new item 
        AggB aggB = new AggB();
        repository().save(aggB);

        */

        /** Example 2:  finding and process
        
        repository().findById(eveA.get???()).ifPresent(aggB->{
            
            aggB // do something
            repository().save(aggB);


         });
        */

    }
}
