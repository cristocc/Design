package com.cc.observer;

import java.util.Observable;

public class Subject extends Observable{
	/**    
     * ҵ�񷽷���һ��ִ��ĳ����������֪ͨ�۲���    
     */     
    public void doBusiness(){      
        if (true) {      
            super.setChanged();      
        }      
        notifyObservers("���ڻ�û�еĲ���");      
    }  
}
