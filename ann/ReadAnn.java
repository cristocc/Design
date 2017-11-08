package com.cc.ann;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReadAnn {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException{
		Person person = new Person();
		//person.setName("dddd");
		
		Class<?> clz = (Class<?>) person.getClass();
		
		//Annotation[] arr = person.getClass().getAnnotations();//�õ�����ע��
		//NotNull ann = person.getClass().getAnnotation(NotNull.class); // ȡ��ָ��ע��
		Object val = null;
		Annotation[] ann = null;
		String simpleName = "";
		Field[] fs = clz.getDeclaredFields();

		for (Field f : fs) {
			f.setAccessible(true); // ����Щ�����ǿ��Է��ʵ�
			val = f.get(person);// �õ������Ե�ֵ
			ann = f.getAnnotations(); //�õ�����ע��
            for (Annotation annotation : ann) {
				simpleName = annotation.annotationType().getSimpleName();
				if("NotNull".equals(simpleName)) {
					if(null == val || "".equals(val)) {
						System.out.println(f.getAnnotation(NotNull.class).message());
					}
				}
			}
		}
		
    }
}
