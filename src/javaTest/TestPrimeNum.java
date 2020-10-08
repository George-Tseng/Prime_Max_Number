package javaTest;

import java.math.BigDecimal;
import java.util.Scanner;

public class TestPrimeNum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        StringBuilder sb0 = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        try{
            System.out.println("Input Num:");
            int num = scan.nextInt();
            int resultI = Get_Prime_Number.getMaxPrimeNumI(sb0.append(num).toString());
            int resultTotalI = Get_Prime_Number.getMaxPrimeNumTotalI(sb1.append(num).toString());
            int resultNoSqrtI = Get_Prime_Number.getMaxPrimeNumNoSqrtI(sb0.toString());
            int resultTotalNoSqrtI = Get_Prime_Number.getMaxPrimeNumTotalNoSqrtI(sb1.toString());
            if(resultI == 0){
               System.out.println("輸入的值過小");
            }
            else{
                System.out.println(resultI);
                System.out.println(resultTotalI);
                System.out.println(resultNoSqrtI);
                System.out.println(resultTotalNoSqrtI);
            }
        } catch(Exception e){
            System.out.println("Error");
        }

        System.out.println();

        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        try{
            System.out.println("Input Long Num:");
            long num = scan.nextInt();
            long resultL = Get_Prime_Number.getMaxPrimeNumL(sb2.append(num).toString());
            long resultTotalL = Get_Prime_Number.getMaxPrimeNumTotalL(sb3.append(num).toString());
            long resultNoSqrtL = Get_Prime_Number.getMaxPrimeNumNoSqrtL(sb2.toString());
            long resultTotalNoSqrtL = Get_Prime_Number.getMaxPrimeNumTotalNoSqrtL(sb3.toString());
            if(resultL == 0){
                System.out.println("輸入的值過小");
            }
            else{
                System.out.println(resultL);
                System.out.println(resultTotalL);
                System.out.println(resultNoSqrtL);
                System.out.println(resultTotalNoSqrtL);
            }
        } catch(Exception e){
            System.out.println("Error");
        }
        
        System.out.println();
        System.out.println("Input Big Num:");
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();

        try{
            BigDecimal num = scan.nextBigDecimal();
            BigDecimal resultBD = Get_Prime_Number.getMaxPrimeNumBD(sb4.append(num).toString());
            BigDecimal resultTotalBD = Get_Prime_Number.getMaxPrimeNumTotalBD(sb5.append(num).toString());
            BigDecimal resultNoSqrtBD = Get_Prime_Number.getMaxPrimeNumNoSqrtBD(sb4.toString());
            BigDecimal resultTotalNoSqrtBD = Get_Prime_Number.getMaxPrimeNumTotalNoSqrtBD(sb5.toString());
            if(resultBD.compareTo(new BigDecimal("0")) == 0){
                System.out.println("輸入的值過小");
            }
            else{
                System.out.println(resultBD);
                System.out.println(resultTotalBD);
                System.out.println(resultNoSqrtBD);
                System.out.println(resultTotalNoSqrtBD);
            }
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }
        
        scan.close();
    }
}
