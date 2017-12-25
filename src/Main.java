
//import java.util.Scanner;
//public class Main {
//
//    public static void main(String[] args) {
//	Scanner scn = new Scanner(System.in);
//	int max = Integer.MAX_VALUE;
//	int min = Integer.MIN_VALUE;
//	int n = scn.nextInt();
//	int m = scn.nextInt();
//	int val=scn.nextInt();
//        System.out.println();
//        System.out.println();
//    }
//}

//
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scn = new Scanner(System.in);
//        int n = Integer.parseInt(scn.nextLine());
//        for (int i=0;i<n;i++){
//            String str = scn.nextLine();
//            String[] data=str.split(" ");
//            int leng=data.length;
//            int vals[]=new int[leng];
//            for(int j=0;j<leng;j++){
//                if(data[j].charAt(0)=='C'){
//                    vals[j]=0;
//                }
//                else if(data[j].charAt(0)=='D'){
//                    vals[j]=13;
//                }
//                else if(data[j].charAt(0)=='H'){
//                    vals[j]=26;
//                }
//                else if(data[j].charAt(0)=='S'){
//                    vals[j]=39;
//                }
//                System.out.println(vals[j]+Integer.parseInt(data[j].substring(1)));
//            }
//            for (int j=0;j<leng;j++){
//                for(int r=j+1;r<leng;r++){
//                    if(vals[j]<vals[r]){
//                        int tmp=vals[j];
//                        vals[j]=vals[r];
//                        vals[r]=tmp;
//                        String tmpStr=data[j];
//                        data[j]=data[r];
//                        data[r]=tmpStr;
//                    }
//                }
//                System.out.println(data[i]);
//            }
//        }
//    }
//}


//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scn = new Scanner(System.in);
//        int count[]=new int[52];
//        String str=scn.nextLine();
//        int len=str.length();
//        for(int i=0;i<len;i++){
//            int val=str.charAt(i)-'a';
//            if(val>=0&&val<26){
//                count[val]++;
//            }
//            else{
//                val=str.charAt(i)-'A';
//                if(val>=0&&val<26){
//                    count[26+val]++;
//                }
//            }
//        }
//        for(int i=0;i<52;i++){
//            if (count[i]>0){
//                if(i<26){
//                    System.out.println((char)(97+i)+":"+count[i]);
//                }
//                else{
//                    System.out.println((char)(65+i)+":"+count[i]);
//                }
//            }
//        }
//    }
//}


import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[][] data=new int[2][n];
        for(int i = 0;i<n;i++){
            data[0][i]=scn.nextInt();
            data[1][i]=fun(data[0][i]);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(data[1][i]>data[1][j]){
                    int tmp=data[1][i];
                    data[1][i]=data[1][j];
                    data[1][j]=tmp;
                    tmp=data[0][i];
                    data[0][i]=data[0][j];
                    data[0][j]=tmp;
                }
                else if(data[1][i]==data[1][j]){
                    if(data[0][i]>data[0][j]){
                        int tmp=data[1][i];
                        data[1][i]=data[1][j];
                        data[1][j]=tmp;
                        tmp=data[0][i];
                        data[0][i]=data[0][j];
                        data[0][j]=tmp;
                    }
                }
            }
        }
    }
    public static int fun(int x){
        int sum=0;
        while (x>0){
            sum=sum+x%10;
            x=x/10;
        }
        return sum;
    }
}









