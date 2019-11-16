package com.helppoint.salesman.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author flaoliveira
 * @version : $<br/>
 * : $
 * @since 16/11/2019 20:00
 */
@AllArgsConstructor
@Builder
@Getter
@Setter
public class SlackMessage implements Serializable {

    private String username;
    private String text;
    private String icon_emoji;
    private String channel;
}
