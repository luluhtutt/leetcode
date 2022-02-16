public class BitwiseComplement {
    public static void main(String[] args) {
        System.out.println(solution(2));
    }
    public static int solution(int n) {
        if(n == 0 || n == 1) return Math.abs(n-1);
        int multiple = 1;
        while(n >= multiple) {
            multiple *= 2;
        }
        return (multiple - 1) - n;
    }
}
