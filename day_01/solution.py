class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        #use current = (num.current + k.current + carry)%10
        #change K to list and then add
        # or change num to int and add with K then change back to list
        #method 2: add as number and then convert to list
        return [int(i) for i in list(str(int("".join([str(i) for i in num]))+k))]
