public class DeretDescendingRekursif {
    public static void Rekursif(int n){
        if(n>=1){
        System.out.print(n + ",");
        Rekursif(n-1);
        if(n==1){
            n=0;
            System.out.println(n);
        }
    }
}
    public static void Iteratif(int n){
        for(int i=n ; i>=1;i--){
            System.out.print(n+",");
            n-=1;
            if(n==0){
                n=0;
                System.out.print(n);
            }
        }
    }
    public static void main (String [] args){
        Rekursif(5);
        System.out.println();
        Iteratif(5);
    }
}