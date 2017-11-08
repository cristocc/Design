package com.cc.ann;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Person person = new Person();
		person.setName("dddd");
		person.setAge(18);
		// 得到类对象
		Class<?> clz = (Class<?>) person.getClass();

		Field[] fs = clz.getDeclaredFields();
		for (Field f : fs) {
			f.setAccessible(true); // 设置些属性是可以访问的
			Object val = f.get(person);// 得到此属性的值
			System.out.println("name:" + f.getName() + "\t value = " + val);
			//String type = f.getType().toString();// 得到此属性的类型
			//System.out.println(type + "\t");

		}
	}
}
