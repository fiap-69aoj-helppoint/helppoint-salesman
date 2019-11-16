package com.helppoint.salesman.kafka.consumer;

import com.helppoint.salesman.service.HelpRequestedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author flaoliveira
 * @version : $<br/>
 * : $
 * @since 10/11/2019 15:21
 */
@Service
public class UserCreatedConsumer {

    private final Logger logger = LoggerFactory.getLogger(UserCreatedConsumer.class);

    @Autowired
    private HelpRequestedService helpRequestedService;

    @KafkaListener(topics = "female_clothing_department", groupId = "group_id", containerFactory = "helpRequestedKafkaListenerContainerFactory")
    public void consume(String departament) {
        logger.info(String.format("Consuming female_clothing_department, departament: %s", departament));
        helpRequestedService.notfySlack(departament);
    }

}
