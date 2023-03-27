package test.domain;

import java.util.*;
import lombok.*;
import test.domain.*;
import test.infra.AbstractEvent;

@Data
@ToString
public class EveA extends AbstractEvent {

    private Long id;

    public EveA(AggA aggregate) {
        super(aggregate);
    }

    public EveA() {
        super();
    }
}
