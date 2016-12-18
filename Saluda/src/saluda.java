


import java.util.Scanner;
public class saluda {


public static void main(String[] args) {
System.out.println("HOLA");	
	int numeroAcierto=17;
	int numeroErrores=3;
	int numeropreguntas=20;
	int nota=0;
	String calificacion="";
	int global;
	Scanner sc =new Scanner(System.in);
		System.out.println("introduce nota humana");
	global=sc.nextInt();

	System.out.println("esta es la nota de la humana"+" "+global);
	nota=((numeroAcierto-(numeroErrores/2))*10)/numeropreguntas;
	// TODO Auto-generated method stub
	switch (global){
	case 0:
    case 1:
    case 2:
    case 3:
    case 4:
        calificacion = "INSUFICIENTE"; 
        System.out.println(calificacion);
        break;		
    case 5:
        calificacion = "SUFICIENTE";
        System.out.println(calificacion);
break;
    case 6:
calificacion = "BIEN";
System.out.println(calificacion);
break;
    case 7:
    case 8:
        calificacion = "NOTABLE"; 
        System.out.println(calificacion);
break;
    case 9: 
    case 10:
calificacion = "SOBRESALIENTE"; 
System.out.println(calificacion);
break;
    default:
        System.out.println("Se ha introducido una nota errónea");
calificacion = "CALIFICACIÓN ERRÓNEA";   

	}	

}
	}


