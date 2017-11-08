package com.cc.ann;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Person person = new Person();
		person.setName("dddd");
		person.setAge(18);
		// �õ������
		Class<?> clz = (Class<?>) person.getClass();

		Field[] fs = clz.getDeclaredFields();
		for (Field f : fs) {
			f.setAccessible(true); // ����Щ�����ǿ��Է��ʵ�
			Object val = f.get(person);// �õ������Ե�ֵ
			System.out.println("name:" + f.getName() + "\t value = " + val);
			//String type = f.getType().toString();// �õ������Ե�����
			//System.out.println(type + "\t");

		}
	}
}
