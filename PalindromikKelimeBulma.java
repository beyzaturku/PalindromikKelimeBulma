
package palindromikkelimebulma;

public class PalindromikKelimeBulma {

   static boolean isPalindrome(String kelime) {
        int i = 0;
        int j = kelime.length() - 1;
        while (i < j) {
            if (kelime.charAt(i) != kelime.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindorem2(String kelime) {
        String reverse = "";
        for (int i = kelime.length() - 1; i >= 0; i--) {
            reverse += kelime.charAt(i);
        }
        if (kelime.equals(reverse)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
   
        System.out.println(isPalindorem2("ece"));

    }
    
}
