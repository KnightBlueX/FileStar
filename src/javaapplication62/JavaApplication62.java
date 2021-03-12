
package javaapplication62;
import java.util.Scanner;


public class JavaApplication62 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        String nombre = null;
        int el,reti1, otra;
        double acum1=0, dep1 = 0, dep2, saldo1=0;
        
       do{
           
       
        System.out.println("Buen dia, Elija el proceso a realizar:");
           System.out.println("1.Crear cuenta");
           System.out.println("2.Depositar");
           System.out.println("3.Retirar");
           System.out.println("4.Ver saldo");
           
        el=teclado.nextInt();
        switch (el){
            case 1:System.out.println("A continuación iniciaremos el proceso de creación de su cuenta");
            System.out.println("Ingrese el nombre del titular");
            String nm=teclado.next();
                int lr=28896547;
                System.out.println("El numero de su cuenta es "+lr);
                System.out.println("Desea agregar saldo, 1.si, 2.no" );
                int choice=teclado.nextInt();
                
                if (choice==1){
                    System.out.println("Ingrese el numero de saldo deseado");
                    saldo1=teclado.nextInt();
                    System.out.println("La nueva cantidad de su saldo es "+saldo1);
                    
                    acum1=acum1+saldo1;
                }
                else if (choice==2){
                    System.out.println("El saldo de su cuenta es 0");
                }
                break;
                
            case 2:System.out.println("Bienvenido al menú de deposito");
            System.out.println("Ingrese el numero de cuenta a depositar");
            double cuenta2=teclado.nextDouble();
                System.out.println("Ingrese la cantidad que desee depositar");
                dep1=teclado.nextDouble();
                cuenta cuenta1=new cuenta(nombre, (int) saldo1,dep1);
                cuenta1.suma(saldo1,dep1);
                break;
                
            case 3:System.out.println("Bienvenido al menu de retiro");
                System.out.println("Ingrese su numero de cuenta");
                int num34=teclado.nextInt();
                System.out.println("Ingrese la cantidad a retirar");
                reti1=teclado.nextInt();
                cuenta cuenta3=new cuenta(nombre, (int)saldo1,reti1);
                cuenta3.resta(saldo1,dep1,reti1);
                break;
                
            case 4: System.out.println("Bienvenido al menu de consulta de saldo");
                System.out.println("Ingrese el numero de su cuenta");
                int num3444 = teclado.nextInt();
                System.out.println("¿Desea conocer el saldo que tiene en su cuenta?");
                int desea=teclado.nextInt();
                cuenta cuenta4=new cuenta(nombre, (int)saldo1, dep1);
                if (desea==1){
                    cuenta4.total();
                    System.out.println("El saldo de su cuenta es "+cuenta4.total());
                }
                else if (desea==2);
        }
           System.out.println("¿Desea realizar alguna otra operación? 1.Sí, 2.No");
           otra=teclado.nextInt();
    }while(otra!=2);
    
     
        
    }
    
}
class cuenta{
    String nombre;
    int numero;
    double saldo;
    
    cuenta(String nombre,int numero,double saldo){
    this.nombre=nombre;
    this.numero=numero;
    this.saldo=saldo;
}
    double saldo(){
       return saldo;
   }
  
   void suma(double saldo,double deposito){
        
       if (deposito>0){
           double name = saldo+deposito;
           System.out.println("El nuevo saldo es de "+name);
           double acum2=0; 
           acum2= acum2+name;
           
       }else if(deposito<0)
       System.out.println("No puedes depositar cantidades negativas");
   
   }
   
   void resta(double saldo,double deposito,int retiro){
       if (retiro<=saldo){
           double name2 = (saldo+deposito)-retiro;
           System.out.println("El saldo restante es de "+name2);
           double acum3 = 0;
           acum3=acum3+name2;
           
       }else if(retiro>saldo)
       System.out.println("No puedes retirar una cantidad mayor a la de tu saldo");
   
   } 
   double total(){
        double name = 0;
        double name2 = 0;
       return saldo+name+name2;
   }
      
}
class caos{
       double saldo;
       double acum1;
       double acum2;
       
       double suma(){
       return saldo+acum1+acum2;
   }
       
       
       
   }
   