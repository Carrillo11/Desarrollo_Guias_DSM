import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   int x, y, i, j, cant1, cant2, cant3, cant4;
cant1=0;
cant2=0;
cant3=0;
cant4=0;
Scanner teclado = new Scanner(System.in);
System.out.print("Cantidad de coordenadas a ingresar: ");
j = teclado.nextInt();
for(i=1;i<=j;i++){
System.out.print("Ingrese la coordenada en x #"+i+":");
x = teclado.nextInt();

System.out.print("Ingrese la coordenada en y #"+i+":");
y = teclado.nextInt();
if(x>=0 && y>=0){
cant1++;
}
else if(x<=0 && y>=0){
cant2++;
}
else if(x<=0 && y<=0){
cant3++;
}
else if(x>=0 && y<=0){
cant4++;
}

}

System.out.print("Coordenadas en cuadantre #1: "+cant1+"\n Coordenadas en cuadantre #2: "+cant2+"\n Coordenadas en cuadantre #3: "+cant3+"\n Coordenadas en cuadantre #4: "+cant4 );
  }
}