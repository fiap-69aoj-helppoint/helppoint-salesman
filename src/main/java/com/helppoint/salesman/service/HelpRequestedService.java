package com.helppoint.salesman.service;

import com.helppoint.salesman.dto.SlackMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author flaoliveira
 * @version : $<br/>
 * : $
 * @since 08/11/2019 19:29
 */
@Service
public class HelpRequestedService {

    private final Logger logger = LoggerFactory.getLogger(HelpRequestedService.class);

    public void notfySlack(String departament) {
        logger.info("Notifing skack, departament... {}", departament);

        SlackMessage slackMessage = SlackMessage.builder()
                .channel("lab-consumidor")
                .username("app_kafka_producer")
                .text("just testing")
                .icon_emoji(":twice:")
                .build();

        SlackService.sendMessage(slackMessage);
        
//        SlackService.sendMessage(String.format("Cliente solicita atendimento no departamento *%s*", departament));
    }

}
