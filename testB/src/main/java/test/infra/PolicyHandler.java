package test.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import test.config.kafka.KafkaProcessor;
import test.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    AggBRepository aggBRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='EveA'"
    )
    public void wheneverEveA_PolB(@Payload EveA eveA) {
        EveA event = eveA;
        System.out.println("\n\n##### listener PolB : " + eveA + "\n\n");

        // Sample Logic //
        AggB.polB(event);
    }
}
