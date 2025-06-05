class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        merged = []
        i, j = 0, 0
        # merge arrays inb sorted order
        while i < len(nums1) and j < len(nums2):
            if nums1[i] <= nums2[j]:
                merged.append(nums1[i])
                i += 1
            else:
                merged.append(nums2[j])
                j += 1
        
        # append remaining of nums1, if any
        while i < len(nums1):
            merged.append(nums1[i])
            i += 1
        
        # append remaining of nums2, if any
        while j < len(nums2):
            merged.append(nums2[j])
            j += 1
        
        # now we have created single sorted array from given two sorted arrays
        # now basis lenght is even or odd, we will find median
        n = len(merged)
        if n % 2 == 1: # if length is odd
            return float(merged[n // 2])
        else: # if length is even
            mid1 = merged[n // 2 - 1]
            mid2 = merged[n // 2]
            return (mid1 + mid2) / 2.0
