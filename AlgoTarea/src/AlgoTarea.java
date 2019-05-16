
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class AlgoTarea {
    public static void escuelaPromedios4pun10(){
        double a=0,q,c=0,total,s,x=0,v;
        int b,inc=1;
        String n;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el número de billetes y monedas que tiene:");
        q=leer.nextDouble();
        
        
        while(inc <=q) {
            inc++;
            System.out.println("Ingrese cuanto desea contabilizar:");
            n=leer.next();
            if(n.equals("moneda")){
                System.out.println("Ingrese el valor de la moneda (decimal):");
                v=leer.nextDouble();
                a=a+v;
                if(a>=1){
                    x=x+a;
                }else{
                    System.out.println("error");
                }
            }else if(n.equals("billete")){
                System.out.println("Ingrese el valor del billete (entero):");
                b=leer.nextInt();
                c=c+b;
            }
            total=a+x+c;
            System.out.println("El total de dolares/centavos es:"+total);
        } 
       
    }
    public static int Narticulos(){
        int inc=1,a=0,b=0,c=0,r=0,num,costo,TO=0,desc,n = 0,e = 0,x = 0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar el número de artículos:");
        num=leer.nextInt();
        while(inc<=num){
            inc++;
            System.out.println("Ingrese el costo del artículo:");
            costo=leer.nextInt();
            if(costo>=200){
                System.out.println("El costo del artículo es:"+costo);
                desc=(costo*15/100);
                System.out.println("El descuento es:"+desc);
                a=costo-desc;
                x=x+a;
                System.out.println("El pago es:"+a);
            }else if(costo>100&&costo<200){
                System.out.println("El costo del artículo es:"+costo);
                desc=(costo*12/100);
                System.out.println("El descuento es:"+desc);
                b=costo-desc;
                e=e+b;
                System.out.println("El pago es:"+b);
            }else if(costo<=100){
                System.out.println("El costo del artículo es:"+costo);
                desc=costo-(costo*10/100);
                System.out.println("El descuento es:"+desc);
                c=desc+costo;
                n=n+c;
                System.out.println("El pago es:"+c);
            }else{
                System.out.println("Error");
            }
             TO=n+e+x;
            System.out.println("El total a pagar de N articulos es:"+TO);
        }
        return TO;
      
    }
    public static void edadPromedio(){
        double M=1,x=0,aulas,estu,s=0,edad,prom=0,toProm;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el total de aulas de la institución:");
        aulas=leer.nextDouble();
        for (int inc = 1; inc <=aulas; inc++) {
            System.out.println("La cantidad de estudiantes de la aula:");
            estu=leer.nextDouble();
            for (inc = 1; inc <=aulas; inc++) {
                System.out.println("Ingrese la edad:");
                edad=leer.nextDouble();
                s=s+edad;
                prom=s/estu;
                System.out.println("El promedio de dicha aula es:"+prom);
                x=x+prom;
                System.out.println("El resultado es:"+x);
                toProm=x/aulas;
                System.out.println("El promedio total de la institución es:"+toProm);
            }
           
        }
        
    }
    public static void bancoPeluche(){
        double clien,inc=1,saldoA,ganb=0,gastoC,sacun=0,salmin,ded,snin,si,n;
        String pagoM;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el número de clientes:");
        clien=leer.nextDouble();
        while(inc<=clien){
            System.out.println("Datos de uno de los clientes, cuales son:");
            inc++;
            System.out.println("Ingrese el saldo anterior:");
            saldoA=leer.nextDouble();
            System.out.println("Ingrese lo que gastó en las compras:");
            gastoC=leer.nextDouble();
            si=saldoA+gastoC;
            System.out.println("Realizo el pago mínimo anteriormente:");
            pagoM=leer.next();
            if(pagoM.equals("si")){
                sacun=si;
            }else if(pagoM.equals("no")){
                System.out.println("Se el cobrará 200 de multa y se le restará el 12 porciento de interés bancaria:");
                ded=200+(si-0.12);
                ganb=ded-ganb;
                sacun=ded-si;
            }else{
                System.out.println("error");
            }
            System.out.println("El saldo actual es:"+sacun);
            snin=(sacun)-(15/100);
            System.out.println("El pago mínimo de depósito el próximo es:"+snin);
            System.out.println("Lo que gana el banco por los morosos es:"+ganb);
        }
    }
    @SuppressWarnings("empty-statement")
    public static void vendertierras(){
        int año,inc;
        double r,n=0,s=0,x,i=0.15,cant=1500;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el año actual:");
        año=leer.nextInt();
        n=año-1960;
        for ( inc = 1; inc< n; inc++) {
             r=Math.pow(i+1,n);
            r=r*cant;
            s=s+r;
            System.out.println("La inversión hasta el año actual es:"+s);
        }
         
          
            
        
    }
    public static void cubos(){
        int posi=0,inc=1,result=1,pot=3;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un número positivo:");
        posi=leer.nextInt();
        for (inc = 1; inc <=3; inc++) {
            result=result*posi;
        }
          System.out.println("el resultado es:"+result);
        }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){
            case 1: escuelaPromedios4pun10(); break;
            case 2: Narticulos();break;
            case 3: edadPromedio();break;
            case 4: bancoPeluche();break;
            case 5: vendertierras();break;
            case 6:  cubos();break;
            default: System.out.println("Opción Inválida!!");break;
            }  
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
        }
        // TODO code application logic here
    }
    
}
