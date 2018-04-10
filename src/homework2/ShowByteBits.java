import java.util.Scanner;

public class ShowByteBits {
    Scanner sc = new Scanner(System.in);
    byte bv = sc.nextByte();
       System.out.printf("%d", (bv & 0x80) >> 7); // Byte의 가장 앞 bit를 출력하는 부분
// 이 사이에 나머지 6bit를 출력하게 만들면 됩니다.
System.out.printf("%d\n", (bv & 0x01)); // Byte의 가장 뒷 bit를 출력하는 부분

}

