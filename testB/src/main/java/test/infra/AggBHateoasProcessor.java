package test.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import test.domain.*;

@Component
public class AggBHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<AggB>> {

    @Override
    public EntityModel<AggB> process(EntityModel<AggB> model) {
        return model;
    }
}
