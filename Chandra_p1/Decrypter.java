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
        int tempOnes = userNumInt[3], tempTens = userNumInt[2], tempHundreds = userNumInt[1],
                tempThousands = userNumInt[0];
        tempOnes = invertMod(tempOnes) - 7;
        tempTens = invertMod(tempTens) - 7;
        tempHundreds = invertMod(tempHundreds) - 7;
        tempThousands = invertMod(tempThousands) - 7;
        return new int[]{tempTens, tempOnes, tempThousands, tempHundreds};
    }

  
    private int invertMod(int invertModNum) {
        if (invertModNum - 7 < 0)
        {
            return invertModNum + 10;
        }
        return invertModNum;
    }

}
