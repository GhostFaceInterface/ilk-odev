//Bu kod 030121038 okul numaralı Muhammed Beşir ASLAN adında bir eleman tarafından yapılmıştır  


public class Main{

    static void durum1(){
        for(int i=1;i<6;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
            System.out.println();
        }
    } 


    static void durum2(){
    for(int i=5;i>0;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
}
                System.out.println();
        }
            }


    static void durum3(){
    for(int i=1;i<6;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
}
                System.out.println("*");
}
}

    static void durum4(){
        for(int i=5;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
}
                    System.out.println("*");
}
    }

    static void durum5(){
        char a[][]  =new char[3][3];
    for(int i=0;i<3;i++){
        {
            for(int j=0;j<3;j++){
                if(i==j){
                    a[i][j]='*';
                }
                else a[i][j]='+';
            }
        }
    }
        for(int i=0;i<3;i++) {
            {
                for (int j = 0; j < 3; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
     
        for(int i=0;i<100;i++){
         int number = 1 + (int) (Math.random() * 5);
        switch (number){
            case 1:
            durum1();
            
            case 2:
            durum2();

            case 3:
            durum3();

            case 4: 
            durum4();

            case 5:
            durum5();
        }
        }
    }
}
