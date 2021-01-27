import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   float nota;
   int cant1, cant2, i;
cant1=0;
cant2=0;
nota=0;
Scanner teclado = new Scanner(System.in);
for(i=1;i<=10;i++){
System.out.print("Ingrese la nota obtenida #"+i+":");
nota = teclado.nextInt();
if(nota>=7){
cant1++;
}

else{
  cant2++;
}

}

System.out.print("Cantidad de notas >=7: "+cant1+"\nCantidad de notas <7: "+cant2 );
  }
}