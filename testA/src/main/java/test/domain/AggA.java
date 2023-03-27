package test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.TestAApplication;
import test.domain.EveA;

@Entity
@Table(name = "AggA_table")
@Data
public class AggA {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        EveA eveA = new EveA(this);
        eveA.publishAfterCommit();
    }

    public static AggARepository repository() {
        AggARepository aggARepository = TestAApplication.applicationContext.getBean(
            AggARepository.class
        );
        return aggARepository;
    }
}
