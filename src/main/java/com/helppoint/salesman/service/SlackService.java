package com.helppoint.salesman.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.helppoint.salesman.dto.SlackMessage;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

/**
 * @author flaoliveira
 * @version : $<br/>
 * : $
 * @since 16/11/2019 20:01
 */
public class SlackService {

    private static String slackWebhookUrl = "https://hooks.slack.com/services/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";

    public static void sendMessage(SlackMessage message) {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(slackWebhookUrl);

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(message);

            StringEntity entity = new StringEntity(json);
            httpPost.setEntity(entity);
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");

            client.execute(httpPost);
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
