package com.github.druyaned.designpatterns;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ConvertClassToUml {
    
    public static void main(String[] args) {
        String fullClassName = args[0];
        Class<?> cl;
        try {
            cl = Class.forName(fullClassName);
        } catch (ClassNotFoundException ex) {
            System.out.println("Missed command line argument (full class name).");
            ex.printStackTrace();
            return;
        }
        StringBuilder builder = new StringBuilder();
        // print name
        System.out.println(cl.getSimpleName());
        // print fields
        System.out.println("--");
        for (Field field : cl.getDeclaredFields()) {
            builder.setLength(0);
            appendField(builder, field);
            System.out.println(builder.toString());
        }
        // print methods
        System.out.println("--");
        for (Method method : cl.getDeclaredMethods()) {
            builder.setLength(0);
            appendMethod(builder, method);
            System.out.println(builder.toString());
        }
    }
    
    private static void appendMethod(StringBuilder builder, Method method) {
        // modifier
        int modifiers = method.getModifiers();
        appendAccessModifier(builder, modifiers);
        // name
        builder
                .append(method.getName())
                .append('(');
        // parameters
        Parameter[] parameters = method.getParameters();
        if (parameters.length > 0) {
            appendParameter(builder, parameters[0]);
        }
        for (int i = 1; i < parameters.length; i++) {
            builder.append(", ");
            appendParameter(builder, parameters[i]);
        }
        builder.append(')');
        // type
        Class<?> type = method.getReturnType();
        if (!type.getSimpleName().equals("void")) {
            builder
                    .append(" : ")
                    .append(type.getSimpleName());
        }
        // static, abstract
        appendStyle(builder, modifiers);
    }
    
    private static void appendParameter(StringBuilder builder, Parameter parameter) {
        builder
                .append(parameter.getName())
                .append(" : ")
                .append(parameter.getType().getSimpleName());
    }
    
    private static void appendField(StringBuilder builder, Field field) {
        // modifier
        int modifiers = field.getModifiers();
        appendAccessModifier(builder, modifiers);
        // name and type
        builder
                .append(field.getName())
                .append(" : ")
                .append(field.getType().getSimpleName());
        // static, abstract
        appendStyle(builder, modifiers);
    }
    
    private static void appendAccessModifier(StringBuilder builder, int modifiers) {
        if (Modifier.isPublic(modifiers)) {
            builder.append("+ ");
        } else if (Modifier.isProtected(modifiers)) {
            builder.append("# ");
        } else if (Modifier.isPrivate(modifiers)) {
            builder.append("- ");
        }
    }
    
    private static void appendStyle(StringBuilder builder, int modifiers) {
        if (Modifier.isStatic(modifiers)) {
            builder.insert(0, '_').append('_');
        }
        if (Modifier.isAbstract(modifiers)) {
            builder.insert(0, '/').append('/');
        }
    }
    
}
