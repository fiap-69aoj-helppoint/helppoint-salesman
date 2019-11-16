package com.helppoint.salesman.service;

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
    }

}
