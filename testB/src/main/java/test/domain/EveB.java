package test.domain;

import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

@Data
@ToString
public class EveB extends AbstractEvent {

    private Long id;

    public EveB(AggB aggregate) {
        super(aggregate);
    }

    public EveB() {
        super();
    }
}
