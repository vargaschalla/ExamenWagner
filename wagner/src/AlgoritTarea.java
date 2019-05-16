
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waldir vargas challa
 */
public class AlgoritTarea {
    public static void Nnumeros(){
        int inc,num=0,equal=0,menor=0,mayor=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese los numeros :");
        for(inc=1;inc<=10;inc++){
            num=leer.nextInt();
            if(num<0){
                menor++;
            }else if(num==0){
                equal++;
            }else 
                mayor++;
        }
     System.out.println("Los numeros menores a cero son :"+menor);
      System.out.println("Los numeros iaguales a ceros son :"+equal);
       System.out.println("Los numeros mayores a cero son :"+mayor);
    }              
              
    public static void numFocos(){
        int numF,inc=1,VE=0,RO=0,BLA=0;
        String color;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el número de focos:");
        numF=leer.nextInt();
        while(inc<=numF){
            inc++;
            System.out.println("cual es el color del foco:");
            color=leer.next();
            color=color;
            if(color.equals("verde")){
                VE++;
            }else{
                if(color.equals("blanco")){
                    BLA++;
                }else{
                    if(color.equals("rojo")){
                        RO++;
                    }else
                        System.out.println("No es ningún color:");
                }
            }
        }
        System.out.println("El total de focos verdes es:"+VE);
        System.out.println("El total de focos blancos es:"+BLA);
        System.out.println("El total de focos rojos es:"+RO);
    }            
    
    public static void SalariodelProfesor4punto1For(){
        double Sa=1500,X=1,inc=1;
        Scanner leer=new Scanner(System.in);
        inc++;
        for(inc=1;inc<=6;inc++){
             X++;
            System.out.println("El salario en el aumento del año es:"+X);           
            Sa=Sa+(Sa*0.10);
            System.out.println("SALARIO: "+Sa);
        }
        System.out.println("El sueldo del profesor en el año sexto es:"+Sa);
}
    public static void SalariodelProfesor4punto1Dowhile(){
        double Sa=1500,X=1,inc=1;
        Scanner leer=new Scanner(System.in);
        do{
            X++;
            System.out.println("El salario en el aumento del año es:"+X);
            Sa=Sa+(Sa*0.10);
            inc++;
            System.out.println("SALARIO: "+Sa);
        }while(inc<=6);
        System.out.println("El sueldo del profesor en el año sexto es:"+Sa);   
    }
    public static void naufragoSatisfecho4punto2For(){
        double inc=1, S=0, D=0, T=0, TOTAL, X, P;
        int cant=1;
        String Ham,Pago,a,b;
        Scanner leer=new Scanner(System.in);        
        System.out.println("Ingrese la cantidad de hamburguesa:");
        cant=leer.nextInt();
        
        for (inc=1; inc <= cant; inc++) {   
            System.out.println("Ingrese el tipo de hamburguesa:");
            Ham=leer.next();
            if(Ham.equals("sencillas")){          
            S=S+20;
            }else if(Ham.equals("doble")){
                D=D+25;               
            }else{
                if(Ham.equals("triple")){
                    T=T+28; 
                }        
            }
        }
        P=S+D+T;
        System.out.println("Los tipos de pago son:");
        System.out.println("a,efectivo:");
        System.out.println("b, tarejeta de crédito:");
        System.out.println("Eliga el tipo de pago con el cual quiere pagar:");
        Pago=leer.next();
        if(Pago.equals("a")){
            System.out.println("El total a pagar es:"+P);
        }else{
            System.out.println("El total a pagar es:");
        } 
            TOTAL=P+(P*5/100);
            System.out.println("Total:"+TOTAL);
    }
    public static void naufragoSatisfecho4punto2While(){
        double inc=1, cantS=0, cantD=0, cantT=0, TOTAL, X, P;
        int cant=1;
        String Ham,Pago,a,b;
        Scanner leer=new Scanner(System.in);        
        System.out.println("Ingrese la cantidad de hamburguesa:");
        cant=leer.nextInt();
        
        while(inc<=cant){ 
            System.out.println("Ingrese el los tipos de hamburguesas:");
            Ham=leer.next();
            inc++;
            if(Ham.equals("sencillas")){          
              cantS=cantS+20;
            }else if(Ham.equals("doble")){
                cantD=cantD+25;
            }else{
                if(Ham.equals("triple")){
                    cantT=cantT+28; 
                }        
            }
        }
        P=cantS+cantD+cantT;
        System.out.println("Los tipos de pago son:");
        System.out.println("a,efectivo:");
        System.out.println("b, tarejeta de crédito:");
        System.out.println("Eliga el tipo de pago con el cual quiere pagar:");
        Pago=leer.next();
        if(Pago.equals("a")){
            System.out.println("El total a pagar es efectivo:"+P);
        }else{
            System.out.println("El total a pagar con crédito es:");
          
        }
          TOTAL=P+(P*0.05);
            System.out.println("Total :"+TOTAL);   
    }
 
    public static void main(String[] args){
         System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){
            case 1: Nnumeros(); break;
            case 2: numFocos();break;
            case 3: SalariodelProfesor4punto1For();break;
            case 4: SalariodelProfesor4punto1Dowhile();break;
            case 5: naufragoSatisfecho4punto2For();break;
            case 6: naufragoSatisfecho4punto2While();break;
            default: System.out.println("Opción Inválida!!");break;
            }  
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
        // TODO code application logic here

    }
}
}
       
    

