import java.util.Arrays;

public class Encrypter {
    public String encrypt(String userNum) {
        int[] userEncryptNum;
        userEncryptNum = setStringToInt(userNum);
        userEncryptNum = encryptProcess(userEncryptNum);
        
        userNum = setIntToString(userEncryptNum);
        return userNum;
    }

    
    private int[] setStringToInt(String userNum) {
        int[] temp = new int[userNum.length()];
        for(int i = 0; i < 4; i++) {
            temp[i] = Character.digit(userNum.charAt(i), 10);
        }
        return temp;
    }

    private String setIntToString(int[] userNumInt) {
        return Arrays.toString(userNumInt).replace("[", "")
                .replace("]", "").replace(",", "")
                .replace(" ", "");
    }

    private int[] encryptProcess(int[] userNumInt) {
        int ones = userNumInt[3], tens = userNumInt[2], hundreds = userNumInt[1],
        thousands = userNumInt[0];
        ones = (ones + 7) % 10;
        tens = (tens + 7) % 10;
        hundreds = (hundreds + 7) % 10;
        thousands = (thousands + 7) % 10;
        int[] casted={tens, ones, thousands, hundreds};
        String strArray[]= new String[casted.length];
        for(int a = 0; a < casted.length; a++){
          strArray[a]=String.valueOf(casted[a]);
        }
        System.out.print(Arrays.toString(strArray).replaceAll("\\[|\\]|,|\\s", ""));

        return casted;

    }
}
