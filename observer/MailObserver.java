package com.cc.observer;

import java.util.Observable;
import java.util.Observer;

public class MailObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("�����ʼ��Ĺ۲����Ѿ���ִ��");
	}

}
