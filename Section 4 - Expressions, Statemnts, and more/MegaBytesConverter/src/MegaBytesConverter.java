public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void  printMegaBytesAndKiloBytes(int kilobytes){
        if (kilobytes < 0 ){
            System.out.println("Invalid Value");
        }else {
            int megaBytes = Math.round(kilobytes / 1024);
            int remainderKiloBytes = Math.round(kilobytes % 1024);
            System.out.println(kilobytes + " KB = " + megaBytes + " MB and " + remainderKiloBytes + " KB");
        }
    }
}
