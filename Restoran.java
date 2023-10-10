import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean status = true;
        int harga = 0;
        int total = 0;
        do{

        System.out.println("Menu \n 1. Nasi Goreng : 20000 \n 2. Ayam Goreng : 15000 \n 3. Mie Goreng : 15000 \n 4. Air Putih : 3000 \n 5. Es Teh : 5000 \n 6. Es Jeruk : 5000");
        System.out.println("Mau beli apa saja?");
        int menu = input.nextInt();

        switch(menu){
            case 1:
              harga = 20000;
              total += harga;
              break;
            case 2:
              harga = 15000;
              total += harga;
              break;
            case 3:
              harga = 15000;
              total += harga;
              break;
            case 4:
              harga = 3000;
              total += harga;
              break;
            case 5:
              harga = 5000;
              total += harga;
              break;
            case 6:
              harga = 5000;
              total += harga;
              break;
            default:
            harga = 0;
            break;
        }

        System.out.println("Mau beli lagi? (Ya/Tidak)");
        String lagi = input.next();
        if(lagi.equalsIgnoreCase("Tidak")){
            status = false;
        }
        
        System.out.println("Total : "+total);
        }while(status);

        System.out.println("Uang yang dibayarkan : ");
        int bayar = input.nextInt();
        if (bayar<total){
          System.out.println("Uang anda kurang");
        }
        else if (bayar>total){
            System.out.println("Uang anda lebih");
            double uang = bayar-total;
            System.out.println("Uang kembalian : "+uang);
        }
        else{
            System.out.println("Uang anda pas");
        }



    

    }
}
