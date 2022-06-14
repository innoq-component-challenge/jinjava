package com.innoq.compchallenge.jinjava;

import java.io.IOException;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.io.Resources;
import com.hubspot.jinjava.Jinjava;


@Controller
public class DemoController {
    
    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
	public String index(@ModelAttribute("model") ModelMap model) throws IOException {
		Jinjava jinjava = new Jinjava();
		Map<String, Object> context = Maps.newHashMap();
		
		String template = Resources.toString(Resources.getResource("index.html"), Charsets.UTF_8);
		
		return jinjava.render(template, context);
	}

}
