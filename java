1 class Solution {
    public int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 4;
        Solution min= new Solution();
        System.out.println(k + "th smallest element is: " + min.kthSmallest(arr, k));
        
    }
}

2 class Solution {
    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 4;
        Solution min= new Solution();
        System.out.println(k + "th smallest element is: " + min.kthSmallest(arr, k));
        
    }
     public int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
3 class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }
        return new ArrayList<>(set);
        
    }
}
4 class Solution {
    public int maxWater(int arr[]) {
        int n = arr.length;
        if (n < 3) return 0;

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int totalWater = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) leftMax = arr[left];
                else totalWater += leftMax - arr[left];
                left++;
            } else {
                if (arr[right] >= rightMax) rightMax = arr[right];
                else totalWater += rightMax - arr[right];
                right--;
            }
        }
        return totalWater;
        
    }
}
4 class Solution {
    public int maxWater(int arr[]) {
        int n = arr.length;
        if (n < 3) return 0;

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int totalWater = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) leftMax = arr[left];
                else totalWater += leftMax - arr[left];
                left++;
            } else {
                if (arr[right] >= rightMax) rightMax = arr[right];
                else totalWater += rightMax - arr[right];
                right--;
            }
        }
        return totalWater;
        
    }
} 
5 class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
        
    }
} 
6 import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean isSubset(int a[], int b[]) {
         if (b.length > a.length) return false;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : a) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (int num : b) {
            if (frequencyMap.getOrDefault(num, 0) > 0) {
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
        
    } 
7 class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid; 
            } else if (nums[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return left;
    }
        
    } 
8 class Solution {
    static int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0;
        if (arr[0] == 0) return -1;
        int maxReach = arr[0];
        int currentEnd = arr[0];
        int jumps = 1;
        for (int i = 1; i < n; i++) {
            if (i == n - 1) return jumps;
            maxReach = Math.max(maxReach, i + arr[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = maxReach;
                if (i >= maxReach) return -1;
            }
        }
        return -1;
    }
} 
9 import java.util.Arrays;

public class Solution {
    public int getMinDiff(int[] arr, int n, int k) {
        if (n == 1) return 0;
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] < k) continue;
            int minHeight = Math.min(smallest, arr[i + 1] - k);
            int maxHeight = Math.max(largest, arr[i] + k);
            ans = Math.min(ans, maxHeight - minHeight);
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {1, 5, 8, 10};
        System.out.println(sol.getMinDiff(arr1, arr1.length, 2)); 

        int[] arr2 = {3, 9, 12, 16, 20};
        System.out.println(sol.getMinDiff(arr2, arr2.length, 3));
    }
} 
10 class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0;
        if (arr[0] == 0) return -1;
        int maxReach = arr[0]; 
        int steps = arr[0];     
        int jump = 1;          
        for (int i = 1; i < n; i++) {
            if (i == n - 1) return jump;
            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;
            if (steps == 0) {
                jump++;
                if (i >= maxReach) return -1;
                steps = maxReach - i;
            }
        }
        return -1;
        
    }
} 
11 public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 8, 6};

        // Initialize min and max with the first element
        int min = arr[0];
        int max = arr[0];

        // Iterate through the array to find min and max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i]; 
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}
12 class Solution {
    public void mergeArrays(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int i = n - 1; 
        int j = 0;    
        while (i >= 0 && j < m) {
            if (a[i] > b[j]) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                i--;
                j++;
            } else {
                break; 
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
        
    } 
13 class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
        
    }
} 
14 class Solution {
    int maxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    
    
    }
} 
15 class Solution {
    public static int largest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
        
    }
} 
16 class Solution {
    public int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare){
        int ptr1 = nums[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        return ptr1;
    }
} 
17 import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;


class Solution {
    public static ArrayList<Integer> factorial(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        String s = res.toString();
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            digits.add(Character.getNumericValue(s.charAt(i)));
        }
        
        return digits;
    }
        
    } 
18 class Solution {
    public List<Integer> commonElements(List<Integer> arr, List<Integer> brr,
                                        List<Integer> crr) {
        int n1 = arr.size();
        int n2 = brr.size();
        int n3 = crr.size();
        int i = 0, j = 0, k = 0;
        List<Integer> res = new ArrayList<>();
        int last = Integer.MIN_VALUE;
        while (i < n1 && j < n2 && k < n3) {
            if (arr.get(i).equals(brr.get(j)) && arr.get(i).equals(crr.get(k)) &&
                !arr.get(i).equals(last)) {
                res.add(arr.get(i));
                last = arr.get(i);
                i++;
                j++;
                k++;
            } else if (Collections.min(Arrays.asList(arr.get(i), brr.get(j),
                                                     crr.get(k))) == arr.get(i))
                i++;
            else if (Collections.min(Arrays.asList(arr.get(i), brr.get(j),
                                                   crr.get(k))) == brr.get(j))
                j++;
            else
                k++;
        }
        return res;
    }
} 
19 class Solution {
    public void rotate(int[] arr) {
        if (arr.length <= 1) return;
        int lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
        
    }
} 
20 import java.util.Scanner;
import java.util.Arrays;
public class ArrayReversal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("\nOriginal Array: " + Arrays.toString(arr));
        reverseArrayInPlace(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
     public static void reverseArrayInPlace(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
} 
