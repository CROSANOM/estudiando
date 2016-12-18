
public class saluda {


public static void main(String[] args) {
System.out.println("HOLA");	
	int numeroAcierto=17;
	int numeroErrores=3;
	int numeropreguntas=20;
	int nota=0;
	String calificacion="";
	
	nota=((numeroAcierto-(numeroErrores/2))*10)/numeropreguntas;
	// TODO Auto-generated method stub
	switch (nota){
	case 0:
    case 1:
    case 2:
    case 3:
    case 4:
        calificacion = "INSUFICIENTE"; 
        break;		
    case 5:
        calificacion = "SUFICIENTE"; 
break;
    case 6:
calificacion = "BIEN";
break;
    case 7:
    case 8:
        calificacion = "NOTABLE"; 
break;
    case 9: 
    case 10:
calificacion = "SOBRESALIENTE"; 
break;
    default:
        System.out.println("Se ha introducido una nota errónea");
calificacion = "CALIFICACIÓN ERRÓNEA";   
	
	}

}
	}


