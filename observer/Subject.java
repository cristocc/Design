package com.cc.observer;

import java.util.Observable;

public class Subject extends Observable{
	/**    
     * 业务方法，一旦执行某个操作，则通知观察者    
     */     
    public void doBusiness(){      
        if (true) {      
            super.setChanged();      
        }      
        notifyObservers("现在还没有的参数");      
    }  
}
