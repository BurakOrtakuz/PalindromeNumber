public class Main {
    public static void main(String[] args) {
        int enbuyuk=0;
        for(int i=100; i<=999;i++){
            //System.out.println("A");
            for(int j=100;j<=999;j++) {
                int çarpım = i * j;
                char[] sayı = Integer.toString(çarpım).toCharArray();
                String sayı2 = "";
                for (int k = 0; k < sayı.length; k++) {
                    sayı2 += sayı[sayı.length - k-1];
                }
                //System.out.println(sayı1+"   "+sayı2+"   "+ i+"  "+j);
                if(çarpım==Integer.valueOf(sayı2)){
                    if(enbuyuk<çarpım){
                        enbuyuk=çarpım;
                    }
                }
            }
        }
        System.out.println(enbuyuk);
    }
}
