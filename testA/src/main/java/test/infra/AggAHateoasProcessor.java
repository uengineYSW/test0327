package test.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import test.domain.*;

@Component
public class AggAHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<AggA>> {

    @Override
    public EntityModel<AggA> process(EntityModel<AggA> model) {
        return model;
    }
}
