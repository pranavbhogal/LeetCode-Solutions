def maxProfit(self, prices: list[int]) -> int:
        profit = 0
        minimum = prices[0]
        for i in range(1, len(prices)):
            minimum = min(minimum, prices[i])
            profit = max(profit, prices[i] - minimum)
            print(minimum, prices[i], profit)
        return profit