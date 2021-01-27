import java.util.Scanner;
class Main {
public static void main(String[] ar) {
  Scanner teclado = new Scanner(System.in);
  int num1, num2;
  float mod;
  mod=0;
     System.out.print("Ingresar primer numero");
     num1=teclado.nextInt();
     System.out.print("Ingresar segundo numero");
     num2=teclado.nextInt();
  mod=num1%num2;

  if(mod==0){
    System.out.print("Los numeros ingresados son divisibles entre si");
  }
  else{
    System.out.print("Los numeros ingresados no son divisibles entre si");
  }
}
}
