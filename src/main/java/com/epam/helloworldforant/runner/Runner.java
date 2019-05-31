package com.epam.helloworldforant.runner;

import com.epam.helloworldforant.service.PrinterInterface;
import org.apache.commons.lang3.StringUtils;

import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.ServiceLoader;

public class Runner {

    public static void main(String[] args) {
//        String name = args[0];
//
//        ServiceLoader<PrinterInterface> loader = ServiceLoader.load(PrinterInterface.class);
//        Iterator<PrinterInterface> iterator = loader.iterator();
//
//        PrinterInterface printer = null;
//
//        if(iterator.hasNext()){
//            printer = iterator.next();
//        }
////        ResourceBundle resourceBundle = ResourceBundle.getBundle("properties.message");
//        ResourceBundle resourceBundle = ResourceBundle.getBundle("properties.message_"+ name);
//        String message = resourceBundle.getString("greeting");
//
//        printer.print(message + name);

//        int l = args.length;
//        for (int i = 0; i<l; i++ )
//        {
//            System.out.println(args[i]);
//        }
//
//        System.out.println(System.getProperty("arg3"));
//        System.out.println(System.getenv("arg4"));

        System.out.println(StringUtils.isEmpty(""));


    }
}
