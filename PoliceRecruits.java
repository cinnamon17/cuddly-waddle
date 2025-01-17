import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] nums = scanner.nextLine().split(" ");
        int hired = 0;
        int sum = 0;
        for (int i = 0; i < length ; i++) {
            int temp = Integer.parseInt(nums[i]);
            if (temp == -1 && hired > 0) {
                hired--;
            }else if(temp == -1 && hired < 0){
                sum++;
            }else if (temp == -1 && hired == 0){
                sum++;
            }else if(temp > 0){
                hired += temp;
            }
            else{
                hired += temp;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
