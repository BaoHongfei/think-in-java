package com.baohongfei.tij.dp.decorator;

/**
 * Created by terry on 25/05/17.
 */
public abstract class AbstractDecorator implements IComponent {
    protected IComponent component;

    public AbstractDecorator(IComponent component){
        this.component = component;
    }

    @Override
    public void method(){
        component.method();
    }
}
