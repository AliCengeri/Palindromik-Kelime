public class Main {
    static boolean isPolindrom(String pldrm){
        String reverse = "";
        for (int i = pldrm.length() - 1; i >=0; i--){
            reverse += pldrm.charAt(i);
        }
        if (pldrm.equals(reverse)){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPolindrom("aba"));
    }
}