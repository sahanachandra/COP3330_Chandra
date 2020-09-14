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
        int tempOnes = userNumInt[3], tempTens = userNumInt[2], tempHundreds = userNumInt[1],
                tempThousands = userNumInt[0];
        tempOnes = (tempOnes + 7) % 10;
        tempTens = (tempTens + 7) % 10;
        tempHundreds = (tempHundreds + 7) % 10;
        tempThousands = (tempThousands + 7) % 10;
        return new int[]{tempTens, tempOnes, tempThousands, tempHundreds};
    }
}
