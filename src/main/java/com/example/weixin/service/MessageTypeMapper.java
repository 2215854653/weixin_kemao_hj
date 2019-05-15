package com.example.weixin.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.example.weixin.domain.InMessage;
import com.example.weixin.domain.event.EventInMessage;
import com.example.weixin.domain.image.ImageInMessage;
import com.example.weixin.domain.link.LinkInMessage;
import com.example.weixin.domain.location.LocationInMessage;
import com.example.weixin.domain.shortvideo.ShortvideoInMessage;
import com.example.weixin.domain.text.TextInMessage;
import com.example.weixin.domain.video.VideoInMessage;
import com.example.weixin.domain.voice.VoiceInMessage;

public class MessageTypeMapper {

	private static Map<String, Class<? extends InMessage>> typeMap = new ConcurrentHashMap<>();

	// 通过一个Map记录了消息类型和类的关系
	static {
		typeMap.put("text", TextInMessage.class);
		typeMap.put("image", ImageInMessage.class);

		typeMap.put("voice", VoiceInMessage.class);
		
		typeMap.put("video", VideoInMessage.class);
		typeMap.put("location", LocationInMessage.class);
		typeMap.put("shortvideo", ShortvideoInMessage.class);
		typeMap.put("link", LinkInMessage.class);

      	
      	typeMap.put("event", EventInMessage.class);
	}

	// 通过消息类型获取对应的类
	@SuppressWarnings("unchecked")
	public static <T extends InMessage> Class<T> getClass(String type) {
		return (Class<T>) typeMap.get(type);
	}
}