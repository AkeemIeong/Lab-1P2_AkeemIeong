
package lab.pkg1p2_akeemieong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Lab1P2_AkeemIeong {

    static Scanner read=new Scanner(System.in);
    static StringTokenizer st;
    public static void main(String[] args) throws ParseException {
        int op=0;
        do {            
            System.out.println("1<-Calcular Fecha");
            System.out.println("2<-Numeros palindromos");
            System.out.println("3<-Salida del programa");
            op=read.nextInt();
            switch(op){
                case 1:
                    Date date=new Date(2023, 4, 21);
                    System.out.println("Ingrese una fecha ej. dia/mes/ano: ");
                    String fech=read.next();
                    verfecha(fech,date);
                    break;
                    
                case 2:
                    System.out.println("Ingrese el limite del arreglo: ");
                    int tam=read.nextInt();
                        if(tam%2!=0){
                            int []numero=new int [tam];
                            
                            int ingre,cont=tam;
                            for (int i = 0; i <tam; i++) {
                                System.out.println("Ingrese un numero: ");
                                ingre=read.nextInt();
                                numero[i]=ingre;
                                
                            }
                            //imprimir(numero);
                            numpalindromos(numero,0,tam-1);
                        }else
                            System.out.println("El tamano no es impar");
                    break;
            }
        } while (op!=3);
    }
    public static void calcular(Date d1,int day,int mes,int ano){
        int nday=0,nmes=0,nano=0;
        if(d1.getDate()>day){
            nday=d1.getDate()-day;
        }else{
            if(day>d1.getDate()){
                nday=day-d1.getDate();
            }
        }
        if(d1.getMonth()>mes){
            nmes=d1.getMonth()-mes;
        }else{
            if(day>d1.getDay()){
                nmes=mes-d1.getMonth();
            }
        }
        if(d1.getYear()>ano){
            nano=d1.getYear()-ano;
        }else{
            if(ano>d1.getYear()){
                nano=ano-d1.getYear();
            }
        }
        
        System.out.println("Cantidad de dias: "+nday+"\nCantidad de meses: "+nmes+"\nCantidad de anos: "+nano);
    }
    public static void verfecha(String fech,Date date) throws ParseException{

        String []fecha=fech.split("/");
        int day=Integer.parseInt(fecha[0]);
        int mes=Integer.parseInt(fecha[1]);
        int ano=Integer.parseInt(fecha[2]);
        
        if(day>0&&day<32 && mes>0&&mes<13){
            calcular(date,day,mes,ano);
            
        }else
            System.out.println("Dia o mes ingresado no existe");
    }
    public static void imprimir(int []numes){
        for (int i = 0; i <numes.length; i++) {
            System.out.print("["+numes[i]+"]");
        }
    }
    public static void numpalindromos(int[]numes,int pos,int reve){
        if(pos==reve){
            imprimir (numes);
            System.out.println("\nEs palindrome");
            
        }else{
            if(numes[pos]==numes[reve]){
                numpalindromos(numes,pos+1,reve-1);
            }else
                System.out.println("No es palindrome");
        }   
    }
}
