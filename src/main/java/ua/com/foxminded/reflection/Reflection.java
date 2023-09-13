package ua.com.foxminded.reflection;

import ua.com.foxminded.annotations.MyAnnotation;
import ua.com.foxminded.services.Service;

import java.lang.reflect.Method;

public class Reflection {

    public String getAnnotatedMethods(){
        Class<Service> serviceLogic = Service.class;
        Method[] methods = serviceLogic.getMethods();
        for(Method method: methods){
            if(method.getAnnotation(MyAnnotation.class) != null) {
                return String.format("have this essage from annotation: %s", method.getAnnotation(MyAnnotation.class).name());
            }
        }
        return "didnt find methods annotated with MyAnnotation";
    }
}
