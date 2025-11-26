// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class main {
   static Scanner sc;

   public main() {
   }

   public static void main(String[] var0) {
      System.out.println("=== GAME ADVENTURE bằng Java ===");
      System.out.println("Bạn tỉnh dậy trong một khu rừng tối...");
      forest();
   }

   static void forest() {
      System.out.println("\nBạn đứng giữa khu rừng. Có hai con đường:");
      System.out.println("1. Đi sang phải");
      System.out.println("2. Đi sang trái");
      System.out.print("> Chọn: ");
      int var0 = sc.nextInt();
      if (var0 == 1) {
         cave();
      } else if (var0 == 2) {
         river();
      } else {
         System.out.println("Lựa chọn không hợp lệ!");
         forest();
      }

   }

   static void cave() {
      System.out.println("\nBạn vào một hang động tối...");
      System.out.println("1. Bật đuốc");
      System.out.println("2. Đi tiếp trong bóng tối");
      System.out.print("> Chọn: ");
      int var0 = sc.nextInt();
      if (var0 == 1) {
         System.out.println("Ánh sáng hiện ra! Bạn tìm thấy kho báu ✨");
         end(true);
      } else if (var0 == 2) {
         System.out.println("Bạn trượt chân và rơi xuống vực...");
         end(false);
      } else {
         cave();
      }

   }

   static void river() {
      System.out.println("\nBạn gặp một dòng sông lớn.");
      System.out.println("1. Cố bơi qua");
      System.out.println("2. Quay lại rừng");
      System.out.print("> Chọn: ");
      int var0 = sc.nextInt();
      if (var0 == 1) {
         System.out.println("Dòng chảy quá mạnh. Bạn bị cuốn trôi...");
         end(false);
      } else if (var0 == 2) {
         forest();
      } else {
         river();
      }

   }

   static void end(boolean var0) {
      if (var0) {
         System.out.println("\n\ud83c\udf89 CHÚC MỪNG! Bạn đã hoàn thành cuộc phiêu lưu!");
      } else {
         System.out.println("\n\ud83d\udc80 GAME OVER! Hãy thử lại!");
      }

      System.out.println("Cảm ơn bạn đã chơi!");
      System.exit(0);
   }

   static {
      sc = new Scanner(System.in);
   }
}
