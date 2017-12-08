package com.cc.observer;

import java.util.Observer;

public class Test {

	public static void main(String[] args) {
		 //����һ�����۲���      
        Subject subject = new Subject();      
              
        //���������۲���      
        Observer mailObserver = new MailObserver();      
        Observer jmsObserver = new JMSObserver();      
              
        //�������۲��߼ӵ����۲����б���      
        subject.addObserver(mailObserver);      
        subject.addObserver(jmsObserver);
              
        //ִ��ҵ�����      
        subject.doBusiness();
	}
}
