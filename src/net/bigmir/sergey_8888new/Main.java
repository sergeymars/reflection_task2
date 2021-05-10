package net.bigmir.sergey_8888new;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        TextContainer textContainer = new TextContainer("helou3");
        Class<?> cls = textContainer.getClass();
        if(cls.isAnnotationPresent(SaveTo.class)){
        SaveTo saveTo = cls.getAnnotation(SaveTo.class);
            Method [] methods = cls.getMethods();
            for (Method method : methods){
                if(method.isAnnotationPresent(Save.class)){
                    try {
                        method.invoke(textContainer,saveTo.path());
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

    }
}
