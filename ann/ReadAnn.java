package com.cc.ann;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReadAnn {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException{
		Person person = new Person();
		//person.setName("dddd");
		
		Class<?> clz = (Class<?>) person.getClass();
		
		//Annotation[] arr = person.getClass().getAnnotations();//得到所有注释
		//NotNull ann = person.getClass().getAnnotation(NotNull.class); // 取得指定注释
		Object val = null;
		Annotation[] ann = null;
		String simpleName = "";
		Field[] fs = clz.getDeclaredFields();

		for (Field f : fs) {
			f.setAccessible(true); // 设置些属性是可以访问的
			val = f.get(person);// 得到此属性的值
			ann = f.getAnnotations(); //得到所有注释
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
