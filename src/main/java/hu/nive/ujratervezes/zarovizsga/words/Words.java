package hu.nive.ujratervezes.zarovizsga.words;

public class Words {
    public boolean hasMoreDigits(String s) {
        int digitNumber = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digitNumber ++;
            }
        }
        return (digitNumber > s.length()-digitNumber);
    }
}
