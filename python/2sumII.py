def twoSumTwoPointers(self, numbers: list[int], target: int) -> list[int]:
        numdic = {}
        start, end = 0, len(numbers)-1
        while start < end:
            if numbers[start] + numbers[end] > target:
                end -= 1
            elif numbers[start] + numbers[end] < target:
                start += 1
            else:
                return [start+1, end+1]
        return []

