import java.util.Scanner;
public class siralama {
    public static void main(String[] args) {

        int a, b, c;
        Scanner inp = new Scanner(System.in);

        System.out.print("1.Sayı : ");
        a = inp.nextInt();
        System.out.print("2.Sayı : ");
        b = inp.nextInt();
        System.out.print("3.Sayı : ");
        c = inp.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("Sıralama : a>b>c");
            }else{
                System.out.println("Sıralama : a>c>b");
            }
            }else if ((b>a) && (b>c)){
            if (a>c){
                System.out.println("Sıralama : b>a>c");
            }else{
                System.out.println("Sıralama : b>c>a");
            }
            }else if ((c>a) && (c>b)){
            if (a>b){
                System.out.println("Sıralama : c>a>b");
            }else{
                System.out.println("Sıralama : c>b>a");
            }
        }

        }
        }


