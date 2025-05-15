class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1
        while left <= right:
            mid = (left + right) // 2
            # handle best case scenario when the target element is already at the middle
            if nums[mid] == target:
                return mid
            # check if left array is sorted
            if nums[left] <= nums[mid]:
                # check if target element exists in left array
                if nums[left] <= target < nums[mid]:
                    right = mid - 1
                else:
                    left = mid + 1
            # else right array is sorted
            else:
                if nums[mid] < target <= nums[right]:
                    left = mid + 1
                else:
                    right = mid - 1
        return -1
