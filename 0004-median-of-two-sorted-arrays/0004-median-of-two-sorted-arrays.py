class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        lst=nums1 + nums2
        lst.sort()
        start = 0
        end = len(lst)-1
        mid = (len(lst))//2
        if (len(lst)%2) == 0:
            return (lst[mid-1]+lst[mid]) / 2
        else:
            return lst[mid]