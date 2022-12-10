import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int dogumAy, dogumGun;
        boolean isError = false;
        String burc = null;
        Scanner imp = new Scanner(System.in);

        System.out.print("Doğum Ayı: ");
        dogumAy = imp.nextInt();

        System.out.print("Doğum Gün: ");
        dogumGun = imp.nextInt();

        if(dogumAy <= 12){
            if(dogumAy == 1){
                if((dogumGun >=1) && (dogumGun <= 31)){
                    if(dogumGun <= 21){
                        burc = "Oğlak";
                    }else{
                        burc = "Kova";
                    }
                }else{
                    isError = true;
                }

            }else if(dogumAy == 2){
                if((dogumGun >=1) && (dogumGun <= 28)){
                    if(dogumGun <= 19){
                        burc = "Kova";
                    }else{
                        burc = "Balık";
                    }
                }else {
                    isError = true;
                }

            }else if(dogumAy == 3){
                if((dogumGun >=1) && (dogumGun <=31)){
                    if(dogumGun <= 20){
                        burc = "Balık";
                    }else{
                        burc ="Koç";
                    }
                }else{
                    isError = true;
                }

            }else if(dogumAy == 4){
                if((dogumGun>=1) && (dogumGun<=30)){
                    if(dogumGun <=20){
                        burc = "Koç";
                    }else{
                        burc = "Boğa";
                    }
                }else{
                    isError = true;
                }

            }else if(dogumAy == 5){
                if((dogumGun >= 1) && (dogumGun <=31)){
                    if(dogumGun <=21){
                        burc = "Boğa";
                    }else{
                        burc = "İkizler";
                    }
                }else{
                    isError = true;
                }

            }else if(dogumAy == 6){
                if((dogumGun >= 1) && (dogumGun <= 30)){
                    if(dogumGun <= 22){
                        burc = "İkizler";
                    }else{
                        burc = "Yengeç";
                    }
                }else{
                    isError= true;
                }

            }else if(dogumAy == 7){
                if((dogumGun >= 1) && (dogumGun <= 31)){
                    if (dogumGun <=22){
                        burc = "Yengeç";
                    }else{
                        burc = "Aslan";
                    }
                }else{
                    isError = true;
                }

            }else if(dogumAy == 8){
                if((dogumGun >=1) && (dogumGun <= 31)){
                    if(dogumGun <= 22){
                        burc = "Aslan";
                    }else{
                        burc = "Başak";
                    }
                }else{
                    isError = true;
                }

            }else if(dogumAy == 9){
                if((dogumGun >= 1) && (dogumGun <=30)){
                    if(dogumGun <= 22){
                        burc = "Başak";
                    }else{
                        burc = "Terazi";
                    }
                }else{
                    isError = true;
                }

            }else if(dogumAy == 10){
                if((dogumGun >= 1) && (dogumGun <= 31)){
                    if(dogumGun <= 22){
                        burc = "Terazi";
                    }else{
                        burc = "Akrep";
                    }
                }else{
                    isError = true;
                }

            }else if(dogumAy == 11){
                if((dogumGun >= 1) && (dogumGun <= 30)){
                    if(dogumGun <= 21){
                        burc = "Akrep";
                    }else{
                        burc = "Yay";
                    }
                }else{
                    isError = true;
                }

            }else{
                if((dogumGun >= 1) && (dogumGun <= 31)){
                    if(dogumGun <= 21){
                        burc = "Yay";
                    }else{
                        burc = "Oğlak";
                    }
                }else{
                    isError = true;
                }
            }
        }else{
            isError= true;
        }
        
        if(isError){
            System.out.println("Hatalı Bir İşlem yaptınız");
        }else{
            System.out.println("Burcunuz: " + burc);
        }



    }
}