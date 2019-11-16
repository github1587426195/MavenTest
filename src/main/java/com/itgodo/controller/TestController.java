package com.itgodo.controller;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;


public class TestController {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("sss");
		list.add("bbb");
		
		JSONArray array=JSONArray.fromObject(list);
		
		System.out.println(array.toString());
		
		list.forEach(o->{System.out.println(o);});
		
		System.out.println("game分支填写的内容");
	}
}
