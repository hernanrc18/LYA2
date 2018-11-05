package lya2;

import java.util.Scanner;

public class PruebaConvertidor {
 
public static void main(String[] args){
Scanner in= new Scanner(System.in);
 
System.out.println("Introduzca operacion inorder\n");
String infija=in.next();
String prefija= Convertidor.convertirAprefija(infija);
 
String postfija= Convertidor.convertirApostfija(infija);
System.out.print("Expresion en notación Inorder: "+infija+"\n");
System.out.print("Expresion en notación postorder: "+postfija+"\n");
System.out.print("Expresion en notación preorder: "+prefija+"\n");
System.out.print("Vale tio ostia chaval lobezno");

 
}
}