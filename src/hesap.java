import java.util.Scanner;



public class hesap {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz: ");
        n1= input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz:" );
        n2 = input.nextInt();


        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz:");
        n3= input.nextInt();


        switch (n3) {
            case 1:
                System.out.print("Cevap:  " + ((n1+n2)));
                break;
            case 2:
                System.out.println("Cevap: " + ((n1-n2)));
                break;
            case 3:
                System.out.println("Cevap: " + ((n1*n2)));
                break;
            case 4:
                System.out.println("Cevap:  "+ ((n1/n2)));
                break;

        }



    }

}
