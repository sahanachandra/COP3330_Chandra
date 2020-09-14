import java.util.Arrays;

public class Decrypter {
    public String decrypt(String userNum) {
        int[] userDecryptNum;
        userDecryptNum = setStringToInt(userNum);
        userDecryptNum = decryptString(userDecryptNum);
        userNum = setIntToString(userDecryptNum);
        return userNum;
    }

    // casting string to int
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

  
    private int[] decryptString(int[] userNumInt) {
        int ones = userNumInt[3], tens = userNumInt[2], hundreds = userNumInt[1],thousands = userNumInt[0];
        ones = invertMod(ones) - 7;
        tens = invertMod(tens) - 7;
        hundreds = invertMod(hundreds) - 7;
        thousands = invertMod(thousands) - 7;
        int[] casted={tens, ones, thousands, hundreds};
        String strArray[]= new String[casted.length];
        for(int a = 0; a < casted.length; a++){
          strArray[a]=String.valueOf(casted[a]);
        }
        System.out.print(Arrays.toString(strArray).replaceAll("\\[|\\]|,|\\s", ""));

        return casted;
    }

  
    private int invertMod(int invertModNum) {
        if (invertModNum - 7 < 0)
        {
            return invertModNum + 10;
        }
        return invertModNum;
    }

}
