import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   int num, i, j, cant1, cant2;
cant1=0;
cant2=0;
Scanner teclado = new Scanner(System.in);
System.out.print("Cantidad de numeros a ingresar: ");
j = teclado.nextInt();
for(i=1;i<=j;i++){
System.out.print("Ingrese #"+i+":");
num = teclado.nextInt();
if(num%2==0){
cant1++;
}

else{
  cant2++;
}

}

System.out.print("Valores pares: "+cant1+"\n Valores impares: "+cant2 );
  }
}