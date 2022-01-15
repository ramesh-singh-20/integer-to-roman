import java.util.LinkedHashMap;
import java.util.Map;

public class AppMain {
    public static void main(String[] args) {
        String romanStr= intToRoman(1994);
        System.out.println(romanStr);
    }

    public static String intToRoman(int num) {

        String roman="";

        Map<Integer, String> lookUpMap= new LinkedHashMap<>();
        lookUpMap.put(1000, "M");
        lookUpMap.put(900, "CM");
        lookUpMap.put(500, "D");
        lookUpMap.put(400, "CD");
        lookUpMap.put(100, "C");
        lookUpMap.put(90, "XC");
        lookUpMap.put(50, "L");
        lookUpMap.put(40, "XL");
        lookUpMap.put(10, "X");
        lookUpMap.put(9, "IX");
        lookUpMap.put(5, "V");
        lookUpMap.put(4, "IV");
        lookUpMap.put(1, "I");

        for(Map.Entry<Integer, String> entry: lookUpMap.entrySet()){
            int multiple= 0;
            if(num/entry.getKey() >0){
                multiple= num/ entry.getKey();
                for(int i=0; i<multiple; i++){
                    roman+= entry.getValue();
                }

                num= num% entry.getKey();
            }
        }
        return roman;
    }

}
