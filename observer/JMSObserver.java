package com.cc.observer;

import java.util.Observable;
import java.util.Observer;

public class JMSObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("������Ϣ��jms�������Ĺ۲����Ѿ���ִ��");
	}

}
