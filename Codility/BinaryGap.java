import java.util.ArrayList;
import java.util.Collections;

public class BinaryGap {

    public static void main(String[] args){
        int N = 1376796946;
        //int N = 49;
        String binaryNum = Integer.toBinaryString(N);
        int countZeros = 0;
        int countGaps = 0;
        //String []result = binaryNum.split("1",-2);
        ArrayList<Integer> val = new ArrayList<Integer>();
        System.out.println(binaryNum);
        for(int i=0; i<=binaryNum.length()-1; i++){   
            countZeros = 0;
            while(binaryNum.charAt(i)=='0'){
                countZeros++;
                if(binaryNum.charAt(i)=='1'){               
                    break;
                }
                if (i == binaryNum.length()-1){
                    countZeros = 0;
                    break;
                }
                i++;
            }                
            
            val.add(countZeros);
            countGaps = Collections.max(val);    
            
        }
        //System.out.println(binaryNum.lastIndexOf('1'));
        System.out.println(countGaps);
   
        //ALGORITMO PARA COLOCAR O NOME AO CONTRÁRIO!
        /*String newString ="";
        String testeStr ="Gustavo"; 
        for(int i=testeStr.length() -1; i>=0; i--){
            newString += testeStr.charAt(i);
            System.out.println(newString);
        }*/
    }

}