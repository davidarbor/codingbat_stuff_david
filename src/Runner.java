/**
 * Created by h205p2 on 8/31/17.
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("I finished these problems :]");
    }
    /*public static boolean sleepIn(boolean weekday, boolean vacation){
        if(vacation==true || weekday==false){
            return true;
        }
        return false;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        if(aSmile==bSmile){
            return true;
        }
        return false;
    }

    public static int sumDouble(int a, int b){
        if(a==b){
            return 2*(a+b);
        }
        return a+b;
    }

    public static int diff21(int n){
        if(n>21){
            return 2*(n-21);
        }
        return 21-n;
    }

    public static boolean parrotTrouble(boolean talking, int hour){
       if(talking==true){
           if(hour<7 || hour>20){
               return true;
           }
       }
       return false;
    }

    public static boolean makes10(int a, int b){
        if(a==10 || b==10){
            return true;
        }
        if(a+b==10){
            return true;
        }
        return false;
    }

    public static boolean noTriples(int[] nums){
        for(int i=0; i<(nums.length-2); i++){
            if(nums[i]==nums[i+1]&&nums[i]==nums[i+2]){
                return false;
            }
        }
        return true;
    }

    public static String firstHalf(String str){
        String half=str.substring(0, (str.length()/2));
        return half;
    }

    public static boolean commonEnd(int[] a, int[] b){
        if(a[0]==b[0] || a[a.length-1]==b[b.length-1]){
            return true;
        }
        return false;
    }

    public static boolean love6(int a, int b){
        if(a==6 || b==6 || a+b==6 || Math.abs(a-b)==6 || Math.abs(b-a)==6){
            return true;
        }
        return false;
    }

    public static boolean makeBricks(int small, int big, int goal){
        int numBig=big*5;
        if(small+numBig>=goal){
            return true;
        }
        return false;
    }

    public static String repeatEnd(String str, int n){
        String endString=str.substring(str.length()-n, str.length());
        String thisString="";
        for(int i=0; i<n; i++){
            thisString+=endString;
        }
        return thisString;
    }

    public static String withoutString(String base, String remove){
        String result1="";
        String result2="";
        String result3="";
        String upperRemove=remove.toUpperCase();
        String lowerRemove=remove.toLowerCase();
        if(base.contains(remove) || base.contains(upperRemove) || base.contains(lowerRemove)){
            result1=base.replace(remove, "");
            result2=result1.replace(lowerRemove, "");
            result3=result2.replace(upperRemove, "");
        }
        else{
            result3=base;
        }
        return result3;
    }

    public static boolean only14(int[] nums){
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=1 && nums[i]!=4){
                return false;
            }
        }
        return true;
    }

    public static int countClumps(int[] nums){
        boolean match=false;
        int count=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1] && !match){
                match=true;
                count++;
            }
            else{
                match=false;
            }
        }
        return count;
    }*/
}