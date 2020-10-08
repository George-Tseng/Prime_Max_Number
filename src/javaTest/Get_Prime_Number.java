package javaTest;

import java.math.BigDecimal;
import java.text.ParseException;

public class Get_Prime_Number {
    protected static int getMaxPrimeNumI(String input) throws ParseException {
        int inputNum, result = 0;
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;

        try{
            inputNum = Integer.parseInt(input);
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(int i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    int stopNum = (int)Math.ceil(Math.sqrt(i));
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(int j = 2; j <= stopNum; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status != ((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (i * 100) / inputNum;
                            result = i;
                        }
                    }
                    else if(i == 2){
                        if(status != ((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (i * 100) / inputNum;
                        result = i;
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = 0;
        }
        timeEnd = Get_Date.getDateNow();
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd));
        return result;
    }

    protected static int getMaxPrimeNumTotalI(String input) throws ParseException{
        int inputNum, result = 0;
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;

        try{
            inputNum = Integer.parseInt(input);
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(int i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    int stopNum = (int)Math.ceil(Math.sqrt(i));
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(int j = 2; j <= stopNum; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status != ((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (i * 100) / inputNum;
                            result += i;
                        }
                    }
                    else if(i == 2){
                        if(status != ((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (i * 100) / inputNum;
                        result = i;
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = 0;
        }
        timeEnd = Get_Date.getDateNow();
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd));
        return result;
    }

    protected static long getMaxPrimeNumL(String input) throws ParseException{
        long inputNum, result = 0;
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;

        try{
            inputNum = Integer.parseInt(input);
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(long i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    long stopNum = (long)Math.ceil(Math.sqrt(i));
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(long j = 2; j <= stopNum; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status != (int)((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (int)((i * 100) / inputNum);
                            result = i;
                        }
                    }
                    else if(i == 2){
                        if(status != (int)((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (int)((i * 100) / inputNum);
                        result = i;
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = 0;
        }
        timeEnd = Get_Date.getDateNow();
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd));
        return result;
    }

    protected static long getMaxPrimeNumTotalL(String input) throws ParseException {
        long inputNum, result = 0;
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;

        try{
            inputNum = Integer.parseInt(input);
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(long i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    long stopNum = (long)Math.ceil(Math.sqrt(i));
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(long j = 2; j <= stopNum; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status != (int)((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (int)((i * 100) / inputNum);
                            result += i;
                        }
                    }
                    else if(i == 2){
                        if(status != (int)((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (int)((i * 100) / inputNum);
                        result += i;
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = 0;
        }
        timeEnd = Get_Date.getDateNow();
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd));
        return result;
    }

    protected static BigDecimal getMaxPrimeNumBD(String input) throws ParseException{
        BigDecimal inputNum, result = new BigDecimal("0");
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;

        try{
            inputNum = new BigDecimal(input);
            /*最小質數為2*/
            if(inputNum.compareTo(new BigDecimal("2")) >= 1){
                BigDecimal status = new BigDecimal("0");
                for(BigDecimal i = new BigDecimal("2") ; i.compareTo(inputNum) < 1 ; i = i.add(new BigDecimal("1"))){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    BigDecimal stopNum = getMidtermNumBD(i);
                    /* 2以外，只有奇數有可能是質數 */
                    /* BigDecimal的商、餘數
                    * 商：BigDecimal1.divideAndRemainder(BigDecimal2)[0]
                    * 餘：BigDecimal1.divideAndRemainder(BigDecimal2)[1] */
                    if(i.divideAndRemainder(new BigDecimal("2"))[1].compareTo(new BigDecimal("1")) == 0){
                        for(BigDecimal j = new BigDecimal("2"); j.compareTo(stopNum) < 1; j = j.add(new BigDecimal("1"))){
                            if(i.divideAndRemainder(j)[1].compareTo(new BigDecimal("0")) == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status.compareTo((i.multiply(new BigDecimal("100"))).divideAndRemainder(inputNum)[0]) != 0){
                                System.out.println("已執行完 "+ ((i.multiply(new BigDecimal("100"))).divideAndRemainder(inputNum)[0]) + "% 的範圍");
                            }
                            status = ((i.multiply(new BigDecimal("100"))).divideAndRemainder(inputNum)[0]);
                            result = i;
                        }
                    }
                    else if(i.compareTo(new BigDecimal("2")) == 0){
                        if(status.compareTo((i.multiply(new BigDecimal("100"))).divideAndRemainder(inputNum)[0]) != 0){
                            System.out.println("已執行完 "+ ((i.multiply(new BigDecimal("100"))).divideAndRemainder(inputNum)[0]) + "% 的範圍");
                        }
                        status = ((i.multiply(new BigDecimal("100"))).divideAndRemainder(inputNum)[0]);
                        result = i;
                    }
                }
            }

        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }

        timeEnd = Get_Date.getDateNow();
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd));
        return result;
    }

    protected static BigDecimal getMaxPrimeNumTotalBD(String input) throws ParseException{
        BigDecimal inputNum, result = new BigDecimal("0");
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;

        try{
            inputNum = new BigDecimal(input);
            /*最小質數為2*/
            if(inputNum.compareTo(new BigDecimal("2")) >= 1){
                BigDecimal status = new BigDecimal("0");
                for(BigDecimal i = new BigDecimal("2") ; i.compareTo(inputNum) < 1 ; i = i.add(new BigDecimal("1"))){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    BigDecimal stopNum = getMidtermNumBD(i);
                    /* 2以外，只有奇數有可能是質數 */
                    /* BigDecimal的商、餘數
                     * 商：BigDecimal1.divideAndRemainder(BigDecimal2)[0]
                     * 餘：BigDecimal1.divideAndRemainder(BigDecimal2)[1] */
                    if(i.divideAndRemainder(new BigDecimal("2"))[1].compareTo(new BigDecimal("1")) == 0){
                        for(BigDecimal j = new BigDecimal("2"); j.compareTo(stopNum) < 1; j = j.add(new BigDecimal("1"))){
                            if(i.divideAndRemainder(j)[1].compareTo(new BigDecimal("0")) == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status.compareTo((i.multiply(new BigDecimal("100"))).divideAndRemainder(inputNum)[0]) != 0){
                                System.out.println("已執行完 "+ ((i.multiply(new BigDecimal("100"))).divideAndRemainder(inputNum)[0]) + "% 的範圍");
                            }
                            status = ((i.multiply(new BigDecimal("100"))).divideAndRemainder(inputNum)[0]);
                            result = result.add(i);
                        }
                    }
                    else if(i.compareTo(new BigDecimal("2")) == 0){
                        if(status.compareTo((i.multiply(new BigDecimal("100"))).divideAndRemainder(inputNum)[0]) != 0){
                            System.out.println("已執行完 "+ ((i.multiply(new BigDecimal("100"))).divideAndRemainder(inputNum)[0]) + "% 的範圍");
                        }
                        status = ((i.multiply(new BigDecimal("100"))).divideAndRemainder(inputNum)[0]);
                        result = result.add(i);
                    }
                }
            }

        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }

        timeEnd = Get_Date.getDateNow();
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd));
        return result;
    }

    protected static BigDecimal getMidtermNumBD(BigDecimal numBD){
        /* 初值：i = 0->BigDecimal i = new BigDecimal("0")
         * 停止條件：i < numBD->i.compareTo(numBD) < 0，小於-1、等於0、大於1
         * 遞迴條件：i++->i = i.add(new BigDecimal("1")) */
        BigDecimal result = new BigDecimal("0");
        /*平方根為整數時*/
        for(BigDecimal i = new BigDecimal("0") ; i.compareTo(numBD) < 1 ; i = i.add(new BigDecimal("1"))){
            BigDecimal goal = i.multiply(i);
            if(goal.compareTo(numBD) == 0){
                result = i;
                break;
            }
        }
        /*平方根非整數時*/
        if(result.compareTo(new BigDecimal("0")) == 0){
            for(BigDecimal i = new BigDecimal("0") ; i.compareTo(numBD) < 1 ; i = i.add(new BigDecimal("1"))){
                BigDecimal goal = i.multiply(i);
                BigDecimal goalNew = i.add(new BigDecimal("1")).multiply(i.add(new BigDecimal("1")));
                if(goal.compareTo(numBD) < 0 && goalNew.compareTo(numBD) > 0){
                    result = i.add(new BigDecimal("1"));
                    break;
                }
            }
        }
        return result;
    }
}
