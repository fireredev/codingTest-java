import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 여벌 체육복을 가진 학생 중 도난당하지 않은 학생 리스트
        Arrays.sort(lost);
        Arrays.sort(reserve);
        ArrayList<Integer> reserveOnly = new ArrayList<>();
        for (int r : reserve) {
            boolean found = false;
            for (int l : lost) {
                if (r == l) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                reserveOnly.add(r);
            }
        }

        // 체육복을 도난당했지만 여벌이 없는 학생 리스트
        ArrayList<Integer> lostOnly = new ArrayList<>();
        for (int l : lost) {
            boolean found = false;
            for (int r : reserve) {
                if (l == r) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                lostOnly.add(l);
            }
        }

        // 체육복을 빌려줄 수 있는 경우 처리
        for (int r : reserveOnly) {
            if (lostOnly.contains(r - 1)) {
                lostOnly.remove((Integer) (r - 1));
            } else if (lostOnly.contains(r + 1)) {
                lostOnly.remove((Integer) (r + 1));
            }
        }

        // 체육복을 잃어버리지 않은 학생 수 계산
        return n - lostOnly.size();
    }}