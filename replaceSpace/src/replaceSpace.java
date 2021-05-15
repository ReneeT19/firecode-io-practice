public class replaceSpace {
    public static void main(String[] args){
        System.out.println(replace("This is a test", "*"));
        System.out.println(replace2("This is another test", "/"));
    }

    public static String replace(String a, String b) {
        char[] chA = a.toCharArray();
        for(int i = 0; i < chA.length; i++) {
            if(a.charAt(i) == ' ') {
                return a.replace(" ", b);
            }
        } return a;
    }

    //use replaceAll
    public static String replace2(String a, String b) {
        a = a.replaceAll(" ", b);
        return a;
    }
}