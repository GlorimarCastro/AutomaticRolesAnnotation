///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package rolesannotation;
//
//import java.io.File;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
///**
// *
// * @author GL26163
// */
//public class RolesAnnotation {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] inputs) {
//        System.out.println(inputs[0]);
//        System.out.println(inputs[1]);
//        System.out.println(inputs[2]);
//        
//        File inputFile  = new File(inputs[0]);
//        File outputFile = new File(inputs[1]);
//        
//        File idsFile = null;
//        if(inputs.length >3){
//            idsFile = new File(inputs[3]);
//        }
//        
//        
//        ProxyConnection connection = ProxyConnection.getInstance();
//        connection.setPort(8080);
//        connection.setProxyHost("llproxy.llan.ll.mit.edu");
//        
//        AutomaticAnnotation annotation = new AutomaticAnnotation();
//        annotation.setInputFile(inputFile);
//        annotation.setOutputFile(outputFile);
//        annotation.setUseProxy(true);
//        annotation.setWikiToUse(AutomaticAnnotation.DataBaseWiki.valueOf(inputs[2]));
////        
////        if(idsFile != null){
////            annotation.setIdsFile(idsFile);
////        }
//        
//        try {
//            annotation.execute();
//        } catch (Exception ex) {
//            Logger.getLogger(RolesAnnotation.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println("Results: \n");
//        System.out.println("Annotations were stored in: " + outputFile.getPath());
//        
//    }
//    
//}
