package array_Project_sorting;

public class CalculateTrainPlatform {

	public static void main(String[] args) {
		
		int arr[] = { 100, 140, 150, 100, 100, 100, 100, 100 };
		int dep[] = { 110, 300, 220, 230, 315, 600, 215, 330 };
		System.out.println("Minimum platforms needed:" + findPlatformsRequiredForStation(arr, dep, 8));
	}

	static int findPlatformsRequiredForStation(int arr[], int dep[], int n) {
		int platform_needed = 0, maxPlatforms = 0;
		int i = 0, j = 0;

		// Similar to merge in merge sort
		while (i < n && j < n) {
			if (arr[i] < dep[j]) {
				platform_needed++;
				i++;
				if (platform_needed > maxPlatforms)
					maxPlatforms = platform_needed;
			} else {
				platform_needed--;
				j++;
			}
		}
		return maxPlatforms;
	}

	}


